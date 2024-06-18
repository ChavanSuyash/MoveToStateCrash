package com.navigationlib.sample_nav_crash_move_to_state.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.navigationlib.sample_nav_crash_move_to_state.R
import java.io.Serializable

class DashboardFragmentFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_dashboard, container, false)
        layout.findViewById<Button>(R.id.toSomeDestinationButton).setOnClickListener {
            launchSomeDestination()
        }
        return layout
    }

    private fun launchSomeDestination() {
        findNavController().navigate(
            R.id.actionDashboard_To_SomeDestinationFragment,
            bundleOf(
                "Code" to "Temp",
                "Obj" to Temp()
            )
        )
    }
}

data class Temp(
    val name: String = "Tempo",
    val id: String = "Id"
): Serializable {
    override fun hashCode(): Int {
        return ('a'..'z').random().hashCode()
    }
}
