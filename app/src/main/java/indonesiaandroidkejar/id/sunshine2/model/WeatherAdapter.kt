package indonesiaandroidkejar.id.sunshine2.model

import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import indonesiaandroidkejar.id.sunshine2.R

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
            val forcastList = weatherList[position]
        }

    }

}
