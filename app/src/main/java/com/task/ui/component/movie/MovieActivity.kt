package com.task.ui.component.movie

import com.task.databinding.MovieActivityBinding
import com.task.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by TruyenDev on 20/07/2022.
 */
@AndroidEntryPoint
class MovieActivity : BaseActivity() {
    private lateinit var binding: MovieActivityBinding
    override fun observeViewModel() {

    }

    override fun initViewBinding() {
        binding = MovieActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}