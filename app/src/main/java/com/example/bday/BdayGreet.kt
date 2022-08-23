package com.example.bday

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bday_greet.*
import kotlinx.android.synthetic.main.activity_main.*

class BdayGreet : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA= "name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_greet)
        val name= intent.getStringExtra( NAME_EXTRA)
        greeting.text = "HAPPY BIRTHDAY\n $name!"
    }
}