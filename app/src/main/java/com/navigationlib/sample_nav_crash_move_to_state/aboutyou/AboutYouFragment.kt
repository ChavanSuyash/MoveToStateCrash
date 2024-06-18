package com.navigationlib.sample_nav_crash_move_to_state.aboutyou

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.navigationlib.sample_nav_crash_move_to_state.R
import com.navigationlib.sample_nav_crash_move_to_state.somedestination.SomeDestinationViewModel

class AboutYouFragment: Fragment() {

    companion object {
        val TAG = AboutYouFragment::class.simpleName
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_about_you, container, false)
        return layout
    }

}
