package com.example.bday

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun createbirthdaycard(view: View) {
        
        val name= nameInput.editableText.toString()
        Toast.makeText(
            this,
            "Name is $name",
            Toast.LENGTH_SHORT
        ).show()

        val intent= Intent(this,BdayGreet::class.java)

        intent.putExtra(BdayGreet.NAME_EXTRA,name)
        startActivity(intent)


    }

}
