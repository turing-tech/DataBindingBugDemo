package com.android.databindingbugdemo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import com.android.databindingbugdemo.R
import com.google.android.material.snackbar.Snackbar

class SubFragment : Fragment() {

    private lateinit var viewModel: SubViewModel
    private val arguments: SubFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.sub_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SubViewModel::class.java)

        Snackbar.make(view!!, "${arguments.flavor.title} costs $${arguments.flavor.cost}!", Snackbar.LENGTH_SHORT).show()
    }

}
