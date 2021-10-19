package com.example.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailArticleActivity : AppCompatActivity() {

    companion object{
        const val DATA_TITLE = "title"
        const val DATA_DESC = "decs"
        const val DATA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title= "artikel islami"
        setContentView(R.layout.activity_detail_article)

        val dataTitle = intent.getStringExtra(DATA_TITLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)


        val tvTitle = findViewById<TextView>(R.id.tv_titel_artikel)
        tvTitle.text = dataTitle
        val tvDesc = findViewById<TextView>(R.id.tv_desc_artikel)
        tvDesc.text = dataDesc
        val imgArtikel = findViewById<ImageView>(R.id.img_detail_artikel)
        imgArtikel.setImageResource(dataImage)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}