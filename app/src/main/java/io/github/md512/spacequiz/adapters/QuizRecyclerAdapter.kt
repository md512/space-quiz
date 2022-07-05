package io.github.md512.spacequiz.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.md512.spacequiz.R
import io.github.md512.spacequiz.Section

class QuizRecyclerAdapter (private val sections: ArrayList<Section>,
                           val onClickListener: onSectionClickListener) :
RecyclerView.Adapter<QuizRecyclerAdapter.MyViewHolder>(){
    //sections - список с разделами главного меню

    interface onSectionClickListener {
        fun onSectionClick(position: Int)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewTitle: TextView = itemView.findViewById(R.id.textViewTitle) as TextView
        var sectionImage: ImageView = itemView.findViewById(R.id.section_image) as ImageView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textViewTitle.text = sections[position].name
        holder.sectionImage.setImageResource(sections[position].image)
        holder.itemView.setOnClickListener {
            onClickListener.onSectionClick(position)
        }
    }

    override fun getItemCount(): Int {
        return sections.size
    }
}