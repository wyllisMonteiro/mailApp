package com.example.gfxma.mailapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickBtnConnect(view:View) {

        var loginComponent = findViewById(R.id.login) as EditText
        var passComponent = findViewById(R.id.login) as EditText

        var login = loginComponent.getText().toString()
        var pass = passComponent.getText().toString()

        if ( login == "admin" && pass == "admin" ) {
            val intent = Intent(this, MailActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Mauvais identifiants !", Toast.LENGTH_SHORT).show()
        }

    }
}
