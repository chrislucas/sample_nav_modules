package com.br.xplorer.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.br.xplorer.simplenavactivity.NavigationActivity
import com.br.xplorer.simplenavactivity.NavigationActivity.redirect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.title_activity_main_activity)
        redirect(NavigationActivity.ContextTestModule.URI_MOD_CONTEXT_ACTIVITY_ANALYSE_CONTEXT_CLASS)
    }
/*
    fun redirectWithActivityContext(view: View) {
        //redirect(NavigationActivity.URI_MOD_CONTEXT_ACTIVITY_ANALYSE_CONTEXT_CLASS)
    }

    fun redirectWithApplicationContext(view: View) {
        //applicationContext.redirect(NavigationActivity.URI_MOD_CONTEXT_ACTIVITY_ANALYSE_CONTEXT_CLASS)
    }

    fun redirectWithBaseContext(view: View) {
        //baseContext.redirect(NavigationActivity.URI_MOD_CONTEXT_ACTIVITY_ANALYSE_CONTEXT_CLASS)
    }
*/

}