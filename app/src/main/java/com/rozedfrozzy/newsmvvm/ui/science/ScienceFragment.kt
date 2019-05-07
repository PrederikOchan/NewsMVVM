package com.rozedfrozzy.newsmvvm.ui.science

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rozedfrozzy.newsmvvm.R

class ScienceFragment : Fragment() {

    companion object {
        fun newInstance() = ScienceFragment()
    }

    private lateinit var viewModel: ScienceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.science_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ScienceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
