package com.br.xplorer.modcontexttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.br.xplorer.simplenavactivity.NavigationActivity
import com.br.xplorer.simplenavactivity.NavigationActivity.redirect

class AnalyseAndroidContextClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analyse_contexts_in_app)
        setTitle(R.string.title_activity_analyse_android_context)
    }

    fun clickView(view: View) {

        val rs = when (view.id) {
            R.id.activity_analyses_fg_context -> {
                redirect(NavigationActivity.AppModule.URI_APP_ACTIVITY_SAMPLE)
            }

            R.id.activity_analyses_base_context -> {
                baseContext.redirect(NavigationActivity.AppModule.URI_APP_ACTIVITY_SAMPLE)
            }

            else -> {
                applicationContext.redirect(NavigationActivity.AppModule.URI_APP_ACTIVITY_SAMPLE)
            }
        }

        if (rs) {
            Toast.makeText(this
                , "Problemas para realizar o redirect"
                , Toast.LENGTH_LONG).show()
        }
    }
}