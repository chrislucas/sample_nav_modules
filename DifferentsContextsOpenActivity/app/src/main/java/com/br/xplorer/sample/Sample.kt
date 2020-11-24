package com.br.xplorer.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.br.xplorer.simplenavactivity.NavigationActivity
import com.br.xplorer.simplenavactivity.NavigationActivity.redirect

class Sample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        setTitle(R.string.title_activity_sample)
    }

    fun redirectWithApplicationContext(view: View) {
        applicationContext.redirect(NavigationActivity.ContextTestModule.URI_MOD_CONTEXT_ACTIVITY_ANALYSE_CONTEXT_CLASS)
    }
}