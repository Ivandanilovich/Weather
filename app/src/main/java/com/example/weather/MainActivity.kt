package com.example.weather

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var disposable: Disposable? = null
    private val service by lazy {
        Service.create()
    }

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                disposable = service.getW(getString(R.string.key), parent.selectedItem.toString())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        { result ->
                            temp.text = result.current.temp_c.toString()
                            country.text = result.location.country
                            city.text = result.location.name
                            wind.text = result.current.wind_mph.toString()
                            feels_like.text = result.current.feelslike_c.toString()
                        },
                        { error -> print("error") }
                    )
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }
}
