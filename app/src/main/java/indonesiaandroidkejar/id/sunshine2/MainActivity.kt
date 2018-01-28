package indonesiaandroidkejar.id.sunshine2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log.*
import com.google.gson.Gson
import indonesiaandroidkejar.id.sunshine2.model.Forcast
import indonesiaandroidkejar.id.sunshine2.model.ForecastResponse
import indonesiaandroidkejar.id.sunshine2.model.WeatherAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: WeatherAdapter
    private val tag = this::class.java.simpleName

    //MutableListOf untuk menambahkan
    private val forcastList = mutableListOf<Forcast>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()
        setupView()
    }

    private fun setupView() {
        adapter = WeatherAdapter(forcastList)
        recCuaca.layoutManager = LinearLayoutManager(this)
        recCuaca.adapter = adapter
    }

    private fun getData() {
        App.api.getForecast().enqueue(object : Callback<ForecastResponse> {

            override fun onResponse(call: Call<ForecastResponse>?, response: Response<ForecastResponse>?) {
                d(tag, response?.body().toString())
                val nWeatherList = response?.body()?.forcastlist
                nWeatherList?.let {
                    forcastList.addAll(it)
                    adapter.notifyDataSetChanged()
                }
            }
            override fun onFailure(call: Call<ForecastResponse>?, t: Throwable?) {
                i(tag, "data : ${Gson().toJsonTree(t?.message)}")
            }
        })
    }                               
}
