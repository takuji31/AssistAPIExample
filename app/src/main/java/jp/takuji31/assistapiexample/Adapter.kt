package jp.takuji31.assistapiexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by takuji on 2015/12/15.
 */
class Adapter(val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    val inflater : LayoutInflater by lazy {
        LayoutInflater.from(context)
    }

    val voiceActors : List<String> by lazy {
        context.resources.getStringArray(0).toList()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        return null
    }

    override fun getItemCount(): Int {
        return voiceActors.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }
}