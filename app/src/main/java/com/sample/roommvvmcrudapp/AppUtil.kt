package com.sample.roommvvmcrudapp

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

object AppUtil {

    fun addDivider(recyclerView: RecyclerView, context: Context) {
        val decorator =
            DividerItemDecoration(recyclerView.context, LinearLayoutManager.VERTICAL)
        decorator.setDrawable(
            ContextCompat.getDrawable(
                context,
                R.drawable.bg_filter_divider
            )!!
        )
        recyclerView.addItemDecoration(decorator)
    }
}