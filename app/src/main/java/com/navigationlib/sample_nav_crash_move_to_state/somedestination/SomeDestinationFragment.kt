package com.navigationlib.sample_nav_crash_move_to_state.somedestination

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.navigationlib.sample_nav_crash_move_to_state.R

class SomeDestinationFragment: Fragment() {

    companion object {
        val TAG = SomeDestinationFragment::class.simpleName
    }

    private val someDestinationViewModel: SomeDestinationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getBundle()
        val layout = inflater.inflate(R.layout.fragment_some_destination, container, false)
        return layout
    }

    private fun getBundle() {
        arguments?.let { args ->
            val temp = args.getString("Code") as String
            Log.d(TAG, "bundleArg Code : $temp")
        }
    }

}
