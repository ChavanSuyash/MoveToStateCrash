package com.navigationlib.sample_nav_crash_move_to_state.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.navigationlib.sample_nav_crash_move_to_state.R
import com.navigationlib.sample_nav_crash_move_to_state.dashboard.DashboardActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_login, container, false)
        layout.findViewById<Button>(R.id.loginButton).setOnClickListener {
            launchDashboard()
        }
        return layout
    }

    private fun launchDashboard() {
        DashboardActivity.launch(
            requireActivity(),
            Intent.FLAG_ACTIVITY_CLEAR_TASK,
            Intent.FLAG_ACTIVITY_NEW_TASK,
        )
    }
}
