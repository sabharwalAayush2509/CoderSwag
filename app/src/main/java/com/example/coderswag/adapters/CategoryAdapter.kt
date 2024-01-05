package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Category

class CategoryAdapter(private val context: Context, private val categories: List<Category>) :
    BaseAdapter() {
    override fun getCount(): Int {
        return categories.size
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage = categoryView.findViewById<ImageView>(R.id.categoryImage)
        val categoryTitle = categoryView.findViewById<TextView>(R.id.categoryTitle)
        val category = categories[position]
        val resourceId =
            context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        categoryTitle.text = category.title
        return categoryView
    }
}