package kr.co.tjoeun.viewpager_20201114.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20201114.fragments.AddressFragment
import kr.co.tjoeun.viewpager_20201114.fragments.BirthYearFragment
import kr.co.tjoeun.viewpager_20201114.fragments.NameFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position) {
            0 -> "이름"
            1 -> "출생년도"
            else -> "거주지"
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragment()
            1 -> BirthYearFragment()
            else -> AddressFragment()
        }

    }

}