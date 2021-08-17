package com.QalamInstitute.qalam.views.fragments

import androidx.fragment.app.Fragment

import com.QalamInstitute.qalam.R
import kotlinx.android.synthetic.main.fragment_donate.*

class DonateFragment : Fragment(R.layout.fragment_donate) {


    override fun onResume() {
        super.onResume()

        myWebView.settings.javaScriptEnabled=true

        myWebView.settings.loadWithOverviewMode=true
        myWebView.loadUrl("https://www.qalam.institute/support-us")
    }

}