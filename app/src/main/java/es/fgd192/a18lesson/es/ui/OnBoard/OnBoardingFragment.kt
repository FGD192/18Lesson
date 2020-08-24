package es.fgd192.a18lesson.es.ui.OnBoard

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import es.fgd192.a18lesson.R
import es.fgd192.a18lesson.es.data.OnBoardModel
import kotlinx.android.synthetic.main.on_boarding_fragment.*

class OnBoardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.on_boarding_fragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        val data = arguments?.get(DATA_INTRO) as OnBoardModel

        TeVi.text = data.TeVi
        TeVi2.text = data.TeVi2
        image.setImageResource(data.image)
    }
    companion object {
        const val DATA_INTRO = "DATA_INTRO"
        fun getInstance(data: OnBoardModel): OnBoardingFragment {
            var fragment = OnBoardingFragment()
            var bundle = Bundle()
            bundle.putParcelable(DATA_INTRO, data)
            fragment.arguments = bundle
            return fragment
        }
    }
}