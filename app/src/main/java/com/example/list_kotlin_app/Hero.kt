package com.example.list_kotlin_app

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    var name: String ?= "",
    var detail: String ?= "",
    var programming_language : String ?= "",
    var developers : String ?= "",
    var release_date : String ?= "",
    var photo: Int ?= 0
)  : Parcelable