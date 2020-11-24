package com.br.xplorer.modcontexttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.br.xperience.customui.samples.SimpleStyledSpinner
import com.br.xplorer.simplenavactivity.NavigationActivity
import com.br.xplorer.simplenavactivity.NavigationActivity.redirect

class ActivitySampleContext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_context)
        setTitle(R.string.title_activity_sample_context)

        initView()
    }

    private fun initView() {
        val optionsNavMainActivity =
            findViewById<SimpleStyledSpinner>(R.id.spinner_navigation_to_main_activity_app_module)
        val opt =
            findViewById<SimpleStyledSpinner>(R.id.spinner_navigation_to_sample_activity_app_module)


    }

    fun clickView(view: View) {
        when (view.id) {
            /*
            R.id.activity_target_b_fg_context -> {
                redirect(NavigationActivity.AppModule.URI_APP_ACTIVITY_SAMPLE)
            }

            R.id.activity_target_b_base_context -> {
                baseContext.redirect(NavigationActivity.AppModule.URI_APP_ACTIVITY_SAMPLE)
            }

            else -> {
                applicationContext.redirect(NavigationActivity.AppModule.URI_APP_ACTIVITY_SAMPLE)
            }
            */

        }
    }
}