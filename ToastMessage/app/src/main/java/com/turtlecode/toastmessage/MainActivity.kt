package com.turtlecode.toastmessage

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = "welcome to application"
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
    fun buttonto2 (view: View) {
        val uyariMesaji = AlertDialog.Builder(this)
        uyariMesaji.setMessage("Do you want to go to second section?")

        uyariMesaji.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, i ->
            val intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
            finish()
        })
        uyariMesaji.setNegativeButton("No") { dialog, i ->
            Toast.makeText(applicationContext, "Stay here ", Toast.LENGTH_LONG)
        }
        uyariMesaji.show()
    }



}