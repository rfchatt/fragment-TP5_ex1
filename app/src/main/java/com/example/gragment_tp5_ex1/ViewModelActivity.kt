package com.example.gragment_tp5_ex1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelActivity : ViewModel() {

    val score = MutableLiveData<Int>(0)

    fun plusUn() {
        val actualValue = score.value ?: 0
        score.value = actualValue + 1

    }

    fun moinsUn() {
        val actualValue = score.value ?: 0
        score.value = actualValue - 1

    }

}