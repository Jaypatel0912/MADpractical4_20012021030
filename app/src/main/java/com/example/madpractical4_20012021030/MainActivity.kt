package com.example.madpractical4_20012021030

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonBrowse = findViewById<Button>(R.id.button_browse)
        buttonBrowse.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://uvpce.gnu.ac.in")).apply { startActivity(this) }
        }

        var buttonCall = findViewById<Button>(R.id.button_call)
        buttonCall.setOnClickListener {
            var intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:8469056751")).apply { startActivity(this) }
        }

    }

}