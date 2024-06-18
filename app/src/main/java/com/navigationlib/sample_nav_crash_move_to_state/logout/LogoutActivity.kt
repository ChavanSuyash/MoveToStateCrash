package com.navigationlib.sample_nav_crash_move_to_state.logout

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.navigationlib.sample_nav_crash_move_to_state.R
import com.navigationlib.sample_nav_crash_move_to_state.dashboard.DashboardActivity

class LogoutActivity: FragmentActivity() {

    companion object {
        @JvmStatic
        fun launch(context: Context, vararg flags: Int) {
            val intent = getLaunchIntent(context, flags)
            context.startActivity(intent)
        }

        @JvmStatic
        fun getLaunchIntent(context: Context, flags: IntArray): Intent {
            return Intent(context, LogoutActivity::class.java).apply {
                for (flag in flags) {
                    addFlags(flag)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activtiy_logout)
    }

}
