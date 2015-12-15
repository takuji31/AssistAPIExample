package jp.takuji31.assistapiexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by takuji on 2015/12/15.
 */
class Adapter(val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    val inflater : LayoutInflater by lazy {
        LayoutInflater.from(context)
    }

    val voiceActors : List<String> by lazy {
        context.resources.getStringArray(R.array.voice_actors).toList()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        val view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view = view)
    }

    override fun getItemCount(): Int {
        return voiceActors.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val item = voiceActors[position]
        holder!!.textView.text = item
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val textView by lazy {
            view.findViewById(android.R.id.text1) as TextView
        }
    }
}