package kr.co.tjoeun.viewpager_20201114.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20201114.fragments.AddressFragment
import kr.co.tjoeun.viewpager_20201114.fragments.BirthYearFragment
import kr.co.tjoeun.viewpager_20201114.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        if (position == 0) {
            return NameFragment()
        }
        else if (position == 1) {
            return BirthYearFragment()
        }
        else {
            return AddressFragment()
        }

    }

}