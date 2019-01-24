package com.android.databindingbugdemo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations.map
import androidx.lifecycle.ViewModel
import com.android.databindingbugdemo.Flavor

class MainViewModel : ViewModel() {

    val selectedFlavor = MutableLiveData<Flavor?>()
    val title = map(selectedFlavor) { selectedFlavor.value?.title }
    val cost = map(selectedFlavor) { selectedFlavor.value?.cost }

}
