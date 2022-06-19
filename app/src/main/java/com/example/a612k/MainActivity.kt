package com.example.a612k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(Timber.DebugTree)
    }

    override fun onStart() {
        super.onStart()
        Timber.w("onStart")

    }

    fun finish(view: View) {
        finish()
        Timber.e("Finish")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("Destroy")
    }
}


private fun Timber.Forest.plant(tree: Timber.DebugTree.Companion) {

}


