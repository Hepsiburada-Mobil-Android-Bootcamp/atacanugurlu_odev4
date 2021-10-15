package com.example.odev4_atacanugurlu

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel: ViewModel() {

    var input = MutableLiveData<String>()
    var editList: MutableList<String> = mutableListOf()

    init {
        input.value = "None"
    }


    fun onNewInput(newInput : String) {
        editList.add(newInput)
    }
}