package ru.geekbrains.androidonkotlin.hw.myweatherlite.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент, в котором \nбудет отражаться история наблюдений \nза погодой"
    }
    val text: LiveData<String> = _text
}