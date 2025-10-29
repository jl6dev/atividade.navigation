package com.example.gamezone2.GamesFragment
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gamezone.R

class GamesFragment : Fragment(R.layout.fragment_games) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.btnGoToProfile)
        btn.setOnClickListener {
            val action = GamesFragmentDirections.actionGamesFragmentToProfileFragment("Mario")
            findNavController().navigate(action)
        }
    }
}
