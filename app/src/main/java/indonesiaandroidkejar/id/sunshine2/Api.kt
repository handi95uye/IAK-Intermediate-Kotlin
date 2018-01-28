package indonesiaandroidkejar.id.sunshine2

import indonesiaandroidkejar.id.sunshine2.model.ForecastResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Handy on 27/01/18.
 * akang.handy95@gmail.com
 */

interface Api {

    @GET("forecast?id=1621177&appid=5ecab6f24a036daf83865e2056fe98eb")
    fun getForecast(): Call<ForecastResponse>

}