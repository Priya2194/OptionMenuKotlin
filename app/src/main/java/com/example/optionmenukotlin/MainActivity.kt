package com.example.optionmenukotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean
    {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.html ->Toast.makeText(this,"Html",Toast.LENGTH_SHORT).show()
            R.id.radio ->Toast.makeText(this,"Radio",Toast.LENGTH_SHORT).show()
            R.id.checkbox ->Toast.makeText(this,"CheckBox",Toast.LENGTH_SHORT).show()
            R.id.css ->Toast.makeText(this,"CSS",Toast.LENGTH_SHORT).show()
            R.id.internalcss ->Toast.makeText(this,"InternalCSS",Toast.LENGTH_SHORT).show()
            R.id.externalcss ->Toast.makeText(this,"ExternalCSS",Toast.LENGTH_SHORT).show()
            R.id.bootstrap ->Toast.makeText(this,"BootStrap",Toast.LENGTH_SHORT).show()
            R.id.java ->Toast.makeText(this,"JAVA",Toast.LENGTH_SHORT).show()
            R.id.inheritance ->Toast.makeText(this,"Inheritance",Toast.LENGTH_SHORT).show()
            R.id.exception ->Toast.makeText(this,"Exception",Toast.LENGTH_SHORT).show()
            R.id.polymorphism ->Toast.makeText(this,"Polymorphism",Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)
    }
}