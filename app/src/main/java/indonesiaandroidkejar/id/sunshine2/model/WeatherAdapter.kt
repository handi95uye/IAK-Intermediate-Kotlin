package indonesiaandroidkejar.id.sunshine2.model

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.util.Log.i
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import indonesiaandroidkejar.id.sunshine2.R
import kotlinx.android.synthetic.main.item_cuaca.view.*

/**
 * Created by Handy on 27/01/18.
 * akang.handy95@gmail.com
 */
// WeatherApp () constrator //

class WeatherAdapter(val weatherList: MutableList<Forcast>) : RecyclerView.Adapter<WeatherAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view: View? = LayoutInflater.from(parent?.context   )
                .inflate(R.layout.item_cuaca,ConstraintLayout(parent?.context),false)
        return Holder(view)
    }

    override fun getItemCount(): Int = weatherList.size

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bind(position)

    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {
            val forcast : Forcast = weatherList[position]
            i("adapter","forcast : " + Gson().toJsonTree(forcast))
            if (forcast.weather?.isNotEmpty() == true) {
                val  weather : Weather = forcast.weather[0]
                itemView?.tvWaktu?.text = forcast.dtTxt
                itemView?.tvDerajatSuhu?.text = forcast.main?.temp + "0080"
                itemView?.tvStatus?.text = weather.description

            }

        }

    }

}
