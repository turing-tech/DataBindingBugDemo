package com.android.databindingbugdemo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class Flavor(val title: String, val cost: Int): Parcelable {

    VANILLA("Vanilla", 5),
    CHOCOLATE("Chocolate", 3),
    STRAWBERRY("Strawberry", 6)

}