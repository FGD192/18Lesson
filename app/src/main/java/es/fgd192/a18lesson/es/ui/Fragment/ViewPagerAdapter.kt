package es.fgd192.a18lesson.es.ui.Fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(manager: FragmentManager) : FragmentStatePagerAdapter(manager) {
    private var list = arrayListOf<Fragment>()
    fun addFragment(fragment: Fragment){
        list.add(fragment)
        notifyDataSetChanged()
    }

    override fun getItem(position: Int): Fragment = list[position]
    override fun getCount(): Int = list.size
}