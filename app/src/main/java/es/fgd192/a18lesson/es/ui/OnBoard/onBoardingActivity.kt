package es.fgd192.a18lesson.es.ui.OnBoard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import es.fgd192.a18lesson.R
import es.fgd192.a18lesson.es.data.OnBoardModel
import es.fgd192.a18lesson.es.ui.Fragment.MainActivity
import kotlinx.android.synthetic.main.on_boarding_activity.*
import kotlinx.android.synthetic.main.on_boarding_fragment.*

class onBoardingActivity : AppCompatActivity() {

    private val list = arrayListOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_boarding_activity)
        setupListener()
        setupViewPager()
    }

    private fun setupViewPager() {
        var adapter = OnBoardAdapter(supportFragmentManager)
        onBoardingViPa.adapter = adapter
        list.add(OnBoardingFragment.getInstance(OnBoardModel(R.drawable.day, "day", "ffnbfvewjjvwbhvwbhfvwbhdbhsdbhsbfhdcncbvdhdnxncbchfdnndddddddddddddddsshhhhhhhshhhhhhhhhhejjjjjjjjjjjejjjjjjjjjwhhhhhhhhwhhhhhhhhhhhhhhhhhhhhhhh")))
        list.add(OnBoardingFragment.getInstance(OnBoardModel(R.drawable.sunset, "sunset", "ffnbfvewjjvwbhvwbhfvwbhdbhsdbhsbfhdcncbvdhdnxncbchfdnndddddddddddddddsshhhhhhhshhhhhhhhhhejjjjjjjjjjjejjjjjjjjjwhhhhhhhhwhhhhhhhhhhhhhhhhhhhhhhh")))
        list.add(OnBoardingFragment.getInstance(OnBoardModel(R.drawable.night, "night", "ffnbfvewjjvwbhvwbhfvwbhdbhsdbhsbfhdcncbvdhdnxncbchfdnndddddddddddddddsshhhhhhhshhhhhhhhhhejjjjjjjjjjjejjjjjjjjjwhhhhhhhhwhhhhhhhhhhhhhhhhhhhhhhh")))

        adapter.update(list)
        onBoardingTaLa.setupWithViewPager(onBoardingViPa)
    }

    private fun setupListener() {
        btnNext.setOnClickListener {
            if (isLastPage(onBoardingViPa.currentItem)) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                onBoardingViPa.currentItem += 1
            }
        }
        btnSkip.setOnClickListener{
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }
    }

    private fun isLastPage(position: Int) = position == list.size - 1
}

