package com.android.databindingbugdemo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations.map
import androidx.lifecycle.ViewModel
import com.android.databindingbugdemo.Flavor

class MainViewModel : ViewModel() {

    val selectedFlavor = MutableLiveData<Flavor>()
    val title = map(selectedFlavor, Flavor::title)
    val cost = map(selectedFlavor, Flavor::cost)

}
