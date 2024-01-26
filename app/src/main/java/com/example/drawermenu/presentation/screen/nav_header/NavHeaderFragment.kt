package com.example.drawermenu.presentation.screen.nav_header

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.drawermenu.databinding.FragmentNavHeaderBinding
import com.example.drawermenu.presentation.common.base.BaseFragment
import com.example.drawermenu.presentation.model.Drawer
import com.example.drawermenu.presentation.screen.home.NavHeaderViewModel
import com.example.drawermenu.presentation.screen.home.adapter.DrawerRecyclerAdapter
import kotlinx.coroutines.launch

class NavHeaderFragment :
    BaseFragment<FragmentNavHeaderBinding>(FragmentNavHeaderBinding::inflate) {

    private lateinit var adapter: DrawerRecyclerAdapter
    private val viewModel: NavHeaderViewModel by viewModels()

    override fun bind() {
        bindAdapter()
    }

    override fun bindViewActionListeners() {
        getData()
    }

    override fun bindObserves() {

    }

    private fun bindAdapter() {
        adapter = DrawerRecyclerAdapter()
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
        adapter.setData(
            listOf(
                Drawer(
                    icon = 7709, text = "Shundra", value = null
                ),
                Drawer(
                    icon = 7709, text = "Shundra", value = null
                )
            )
        )
    }

    private fun getData() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.listItem.collect {
                    adapter.setData(it)
                }
            }
        }
    }


}