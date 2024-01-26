package com.example.drawermenu.presentation.screen.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.drawermenu.R
import com.example.drawermenu.databinding.RecyclerDrawerBinding
import com.example.drawermenu.presentation.model.Drawer

class DrawerRecyclerAdapter: RecyclerView.Adapter<DrawerRecyclerAdapter.DrawerViewHolder>() {

    private var itemList = listOf<Drawer>()

    inner class DrawerViewHolder(private val binding: RecyclerDrawerBinding): RecyclerView.ViewHolder(binding.root) {


        fun bind(drawer: Drawer) = with(binding) {
            imgIcon.setImageResource(R.drawable.ic_launcher_background)
            tvText.text = drawer.text
            tvValue.text = drawer.value

        }

    }

    fun setData(userList: List<Drawer>) {
        itemList = userList
        notifyItemChanged(itemList.size)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrawerViewHolder {
        return DrawerViewHolder(
            RecyclerDrawerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: DrawerViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.bind(currentItem)

    }

}