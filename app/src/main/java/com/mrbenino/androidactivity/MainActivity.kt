package com.mrbenino.androidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var myObserver: MyObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myObserver = MyObserver()
        lifecycle.addObserver(myObserver)
    }

    private  fun toastMeState(message: String){
        Toast.makeText(this, "${lifecycle.currentState}, $message", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        toastMeState("ON_START")
    }

    override fun onResume() {
        super.onResume()
        toastMeState("ON_RESUME")
    }

    override fun onPostResume() {
        super.onPostResume()
        toastMeState("onPostResume")
    }

    override fun onPause() {
        super.onPause()
        toastMeState("ON_PAUSE")
    }

    override fun onStop() {
        super.onStop()
        toastMeState("ON_STOP")
    }

    override fun onRestart() {
        super.onRestart()
        toastMeState("ON_RESTART")
    }

    override fun onDestroy() {
        super.onDestroy()
        toastMeState("ON_DESTROY")
    }
}