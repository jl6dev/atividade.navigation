package com.example.gamezone2.GamesFragment


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.gamezone.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val args: ProfileFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv = view.findViewById<TextView>(R.id.txtProfileName)
        tv.text = "Jogador: ${args.playerName}"
    }
}
