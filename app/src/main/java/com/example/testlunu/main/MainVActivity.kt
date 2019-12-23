package com.example.testlunu.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testlunu.BaseApp
import com.example.testlunu.DescriptionActivity
import com.example.testlunu.R
import com.example.testlunu.db.CityParcel
import com.example.testlunu.db.CitySaved
import com.example.testlunu.net.Api
import com.example.testlunu.net.RetrofitProvider
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainVActivity : AppCompatActivity(), CityAdapter.TouchEvent, MainContract.View {


    @Inject
    lateinit var provider: RetrofitProvider
    @Inject
    lateinit var presenter: MainContract.Presenter

    private lateinit var cityAdapter: CityAdapter
    private lateinit var api: Api

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BaseApp[this].injector?.inject(this)
        api = provider.api
        cityAdapter = CityAdapter(this, this)
        rvMain.adapter = cityAdapter
        rvMain.layoutManager = LinearLayoutManager(this)
        presenter.checkAndAddIfNot(this, this, this)
        btnAdd.setOnClickListener {
            presenter.getCity(this, etCity.text.toString())
        }
    }

    override fun errorToast() {
        Toast.makeText(this, "Incorrect", LENGTH_SHORT).show()
    }

    override fun onClick(item: CitySaved) {
        val intent = Intent(this, DescriptionActivity().javaClass)
        intent.putExtra(
            "city_save",
            CityParcel(item.name, item.temperature, item.humidity, item.windSpeed)
        )
        startActivity(intent)
    }

    override fun onHold(item: CitySaved) {
        val items = arrayOf("Удалить")
        AlertDialog.Builder(this)
            .setTitle("Хотите удалить запись?")
            .setItems(items) { p0, idx ->
                when (idx) {
                    0 -> {
                        presenter.deleteItemFromDB(item)
                        cityAdapter.delete(item)
                    }
                }
            }.show()
    }

    override fun setCities(listCities: List<CitySaved?>?) {
        listCities?.forEach { if (it != null) { cityAdapter.addItem(it) } }
    }

    override fun setCity(citySaved: CitySaved?) {
        if (citySaved != null) {
            cityAdapter.addItem(citySaved)
            presenter.addItemToDb(this, citySaved)
        }
    }

    override fun setCitiesFromDB(citySaved: CitySaved?) {

    }
}

