package ru.geekbrains.androidonkotlin.hw.myweatherlite.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это стартовый фрагмент \n Тут будет отображаться текущая погода в\n основном городе. \n Также планируется коротко выводить о ближайших изменениях погоды. \n свайпом можно будет переместиться на другой город."
    }
    val text: LiveData<String> = _text
}