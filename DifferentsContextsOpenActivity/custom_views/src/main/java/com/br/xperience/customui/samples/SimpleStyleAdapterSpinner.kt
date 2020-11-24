package com.br.xperience.customui.samples

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class SimpleStyleAdapterSpinner<T>(context: Context, resource: Int, objects: Array<out T>) :
    ArrayAdapter<T>(context, resource, objects) {

    private val data: List<T> = objects.toList()

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getDropDownView(position, convertView, parent)
    }
}