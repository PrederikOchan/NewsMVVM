package com.rozedfrozzy.newsmvvm.ui.entertainment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rozedfrozzy.newsmvvm.R

class EntertainmentFragment : Fragment() {

    companion object {
        fun newInstance() = EntertainmentFragment()
    }

    private lateinit var viewModel: EntertainmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.entertainment_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EntertainmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
