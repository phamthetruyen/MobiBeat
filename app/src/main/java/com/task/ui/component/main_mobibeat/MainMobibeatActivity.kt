package com.task.ui.component.main_mobibeat

import android.graphics.Color
import com.task.R
import com.task.databinding.MainMobibeatActivityBinding
import com.task.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by TruyenDev on 21/07/2022.
 */
@AndroidEntryPoint
class MainMobibeatActivity : BaseActivity() {
    private lateinit var binding: MainMobibeatActivityBinding

    /**
     *
     */
    override fun observeViewModel() {

    }

    /**
     *
     */
    override fun initViewBinding() {
        binding = MainMobibeatActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onClickMenuBottom()
    }

    /**
     *
     */
    private fun onClickMenuBottom() {

        binding.layoutBottomNavigtion.llHomeBottom.setOnClickListener {
            resetViewBottom()
            binding.layoutBottomNavigtion.tvHomeBottom.setTextColor(Color.parseColor(getString((R.color.red_app))))
            binding.layoutBottomNavigtion.ivHomeBottom.setImageResource(R.drawable.ic_home_32_red)
        }
        binding.layoutBottomNavigtion.llLikeBottom.setOnClickListener {
            resetViewBottom()
            binding.layoutBottomNavigtion.tvLikeBottom.setTextColor(Color.parseColor(getString((R.color.red_app))))
            binding.layoutBottomNavigtion.ivLikeBottom.setImageResource(R.drawable.ic_like_bottombar_red)
        }
        binding.layoutBottomNavigtion.llSettingBottom.setOnClickListener {
            resetViewBottom()
            binding.layoutBottomNavigtion.tvSettingBottom.setTextColor(Color.parseColor(getString((R.color.red_app))))
            binding.layoutBottomNavigtion.ivSettingBottom.setImageResource(R.drawable.ic_setting_bottombar_red)
        }

    }

    /**
     *
     */
    private fun resetViewBottom() {
        binding.layoutBottomNavigtion.tvHomeBottom.setTextColor(Color.parseColor(getString((R.color.gray_app))))
        binding.layoutBottomNavigtion.tvLikeBottom.setTextColor(Color.parseColor(getString((R.color.gray_app))))
        binding.layoutBottomNavigtion.tvSettingBottom.setTextColor(Color.parseColor(getString((R.color.gray_app))))
        binding.layoutBottomNavigtion.ivHomeBottom.setImageResource(R.drawable.ic_home_32_white)
        binding.layoutBottomNavigtion.ivLikeBottom.setImageResource(R.drawable.ic_like_bottombar)
        binding.layoutBottomNavigtion.ivSettingBottom.setImageResource(R.drawable.ic_setting_bottombar)
    }
}