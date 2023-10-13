package com.santo.ejemplofragment.ui.tabbed

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.santo.ejemplofragment.R
import com.santo.ejemplofragment.ui.batman.BatmanFragment
import com.santo.ejemplofragment.ui.flash.FlashFragment
import com.santo.ejemplofragment.ui.superman.SupermanFragment
import com.santo.ejemplofragment.ui.wonderwoman.WonderWomnFragament

private val TAB_TITLES = arrayOf(
    R.string.Batmanname,
    R.string.Flash_name,
    R.string.Superman_name,
    R.string.Wonderwoman_name

)
class SectionsPagerAdapter (private val context: Context,fm:FragmentManager):FragmentPagerAdapter(fm){



    override fun getItem(position: Int): Fragment {
        return when(position){
         0-> BatmanFragment()
         1-> FlashFragment ()
         2-> SupermanFragment()
         else-> WonderWomnFragament()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])

    }
    override fun getCount(): Int {
        return 4
    }

}

