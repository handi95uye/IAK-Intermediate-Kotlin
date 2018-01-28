package indonesiaandroidkejar.id.sunshine2.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Handy on 27/01/18.
 * akang.handy95@gmail.com
 */

class ForecastResponse(

        @field:SerializedName("cod")
        val cod: String = "",

        @field:SerializedName("massage")
        val massage: String = "",

        @field:SerializedName("city")
        val city: City = City(),

        @field:SerializedName("list")
        val forcastlist: List<Forcast>? = null

)

data class Forcast (

        @field:SerializedName("dt_txt")
        var dtTxt:String? = "",

        @field:SerializedName("weather")
        val weather: List<Weather>? = null,

        @field:SerializedName("main")
        val main: Temp? = null
)

data class Temp (
        @field:SerializedName("temp")
        val temp:String = ""

)

data class City (

        @field:SerializedName("id")
        val id: String? = "",

        @field:SerializedName("name")
        val name: String? = "",

        @field:SerializedName("country")
        val country: String = ""

)

data class  Weather (

        @field:SerializedName("id")
        val id: String? = "",

        @field:SerializedName("main")
        val main: String? = "",

        @field:SerializedName("description")
        val description: String? = null,

        @field:SerializedName("icon")
        val icon: String? = ""

)