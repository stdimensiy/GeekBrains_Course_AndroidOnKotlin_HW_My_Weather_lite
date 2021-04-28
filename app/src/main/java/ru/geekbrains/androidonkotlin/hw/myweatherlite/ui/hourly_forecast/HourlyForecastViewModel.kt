package ru.geekbrains.androidonkotlin.hw.myweatherlite.ui.hourly_forecast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HourlyForecastViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент почасовой детализации погоды\n в выбранном городе. \n Планируется также свайпом перемещаться по линейке времени (или городам) еще не решил."
    }
    val text: LiveData<String> = _text
}