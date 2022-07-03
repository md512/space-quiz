package io.github.md512.spacequiz.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.md512.spacequiz.R
import io.github.md512.spacequiz.adapters.QuizRecyclerAdapter

class MainActivity : AppCompatActivity() {

    //private val quizViewModel by lazy { ViewModelProvider(this).get(QuizViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sections = arrayListOf(
            Section(getResources().getString(R.string.sun), R.drawable.sun),
            Section(getResources().getString(R.string.mercury), R.drawable.mercury),
            Section(getResources().getString(R.string.venus), R.drawable.venus),
            Section(getResources().getString(R.string.earth), R.drawable.earth),
            Section(getResources().getString(R.string.mars), R.drawable.mars),
            Section(getResources().getString(R.string.jupiter), R.drawable.jupiter),
            Section(getResources().getString(R.string.saturn), R.drawable.saturn),
            Section(getResources().getString(R.string.uranus), R.drawable.uranus),
            Section(getResources().getString(R.string.neptune), R.drawable.neptune),
            Section(getResources().getString(R.string.small_bodies), R.drawable.small_bodies),
            Section(getResources().getString(R.string.stars), R.drawable.stars),
            Section(getResources().getString(R.string.galaxies), R.drawable.galaxies)
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        //сюда прописать слушателя

        val onSectionClickListener =  object : QuizRecyclerAdapter.onSectionClickListener {
            override fun onSectionClick(position: Int) {
                //обработка нажатий
                when(position) {
                    0 -> Toast.makeText(applicationContext, "Sun", Toast.LENGTH_SHORT).show()
                }
            }
        }

        recyclerView.adapter = QuizRecyclerAdapter(sections, onSectionClickListener)
    }
}