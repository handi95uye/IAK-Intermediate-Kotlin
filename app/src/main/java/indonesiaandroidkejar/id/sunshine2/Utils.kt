package indonesiaandroidkejar.id.sunshine2

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Handy on 28/01/18.
 * akang.handy95@gmail.com
 */

fun convertToWeekDay (date: String?): String {

    /* Konversi tanggal bertipe string menjadi tgl bertipe Date */
    val oldsdf = SimpleDateFormat("yyyy-MM-dd",Locale.getDefault())
    val oldDate : Date = oldsdf.parse(date)

    /* Konversi tanggal date ke nama hari */
    val daysdf = SimpleDateFormat("EEEE", Locale("id"))
    val day =  daysdf.format(oldDate)

    println(day)
    return day

}