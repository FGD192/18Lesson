package es.fgd192.a18lesson.es.ui.Fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.fgd192.a18lesson.R
import es.fgd192.a18lesson.es.ui.Fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBottomNav()
        setupListener()
    }
    private fun setupBottomNav() {
        var adapter =
            ViewPagerAdapter(
                supportFragmentManager
            )
        viewPager.adapter = adapter
        adapter.addFragment(CalendarFragment())
        adapter.addFragment(MusicFragment())
        adapter.addFragment(PlaceFragment())
        adapter.addFragment(WeatherFragment())
    }
    private fun setupListener() {
bottomNav.setOnNavigationItemSelectedListener {
    when(it.itemId){
        R.id.calendar -> viewPager.currentItem = 0
        R.id.music -> viewPager.currentItem = 1
        R.id.place -> viewPager.currentItem = 2
        R.id.news -> viewPager.currentItem = 3
    }
    return@setOnNavigationItemSelectedListener true
}
    }
}