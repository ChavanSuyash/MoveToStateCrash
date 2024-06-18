package com.navigationlib.sample_nav_crash_move_to_state.dashboard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.navigationlib.sample_nav_crash_move_to_state.R
import com.navigationlib.sample_nav_crash_move_to_state.logout.LogoutActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DashboardActivity: FragmentActivity() {

    companion object {
        val TAG = DashboardActivity::class.simpleName

        @JvmStatic
        fun launch(context: Context, vararg flags: Int) {
            val intent = getLaunchIntent(context, flags)
            context.startActivity(intent)
        }

        @JvmStatic
        fun getLaunchIntent(context: Context, flags: IntArray): Intent {
            return Intent(context, DashboardActivity::class.java).apply {
                for (flag in flags) {
                    addFlags(flag)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        //setupBottomDrawer()
        logoutAfterTimeout()
    }

    /*private fun setupBottomDrawer() {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        val navController = Navigation.findNavController(this, R.id.fragDashBoardNavHost)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }*/

    private fun logoutAfterTimeout() {
        lifecycleScope.launch {
            delay(10000)

            Log.d(TAG, "Timeout")
            // launch dashboard activity
            LogoutActivity.launch(
                this@DashboardActivity,
            )
            finishAffinity()
        }
    }
}
