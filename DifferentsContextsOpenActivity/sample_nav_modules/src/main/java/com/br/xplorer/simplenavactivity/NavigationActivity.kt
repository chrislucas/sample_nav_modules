package com.br.xplorer.simplenavactivity

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri


object NavigationActivity {

     object AppModule {
        val URI_APP_ACTIVITY_SAMPLE: Uri = Uri.parse("navkey://app_activity_sample")
        val URI_APP_ACTIVITY_MAIN: Uri = Uri.parse("navkey://app_activity_main")
    }

    object ContextTestModule {
        val URI_MOD_CONTEXT_ACTIVITY_SAMPLE_CTX: Uri =
            Uri.parse("navkey://mod_context_activity_sample_context")
        val URI_MOD_CONTEXT_ACTIVITY_ANALYSE_CONTEXT_CLASS: Uri =
            Uri.parse("navkey://mod_context_activity_analyse_and_context")
    }


    @JvmStatic
    fun Context.redirect(uri: Uri): Boolean {
        val intent = Intent.parseUri(uri.toString(), 0)

        val listResolveInfo = packageManager.queryIntentActivities(
            intent,
            PackageManager.GET_RESOLVED_FILTER
        )

        return listResolveInfo.takeIf { listResolveInfo.size == 1 }?.let { list ->
            val resolveInfo = list[0]
            val i = Intent().apply {
                this.component = resolveInfo.activityInfo.run {
                    ComponentName(packageName, name)
                }
            }
            startActivity(i)
            true
        } ?: false
    }
}