package indonesiaandroidkejar.id.sunshine2

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Handy on 27/01/18.
 * akang.handy95@gmail.com
 */

class App  : Application() {

    // statik tanpa melalui object java public final//
    companion object {
       // tidak bisa di kasih nilai //
       lateinit var api : Api
    }

    override fun onCreate() {
        super.onCreate()
        val retrofit =  Retrofit
                .Builder()
                .baseUrl("http://samples.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        api = retrofit.create(Api::class.java)
    }
}
