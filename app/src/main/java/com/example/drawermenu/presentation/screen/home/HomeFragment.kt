package com.example.drawermenu.presentation.screen.home

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drawermenu.R
import com.example.drawermenu.databinding.FragmentHomeBinding
import com.example.drawermenu.presentation.common.base.BaseFragment
import com.example.drawermenu.presentation.model.Drawer
import com.example.drawermenu.presentation.screen.home.adapter.DrawerRecyclerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private lateinit var adapter: DrawerRecyclerAdapter
    private val viewModel: NavHeaderViewModel by viewModels()

    override fun bind() {
        bindAdapter()
    }

    override fun bindViewActionListeners() {

    }

    override fun bindObserves() {

    }


    private fun bindAdapter() {
        adapter = DrawerRecyclerAdapter()
        val recyclerView =
            binding.navView.getHeaderView(0).findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        adapter.setData(
            listOf(
                Drawer(
                    icon = 7709, text = "Shundra", value = null
                ),
                Drawer(
                    icon = 7709, text = "Shundra", value = null
                ),
                Drawer(
                    icon = 7709, text = "Shundra", value = null
                )
            )
        )
    }


}