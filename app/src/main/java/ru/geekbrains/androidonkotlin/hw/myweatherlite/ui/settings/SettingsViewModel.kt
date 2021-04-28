package ru.geekbrains.androidonkotlin.hw.myweatherlite.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Это фрагмент настроек. \n Здесь планируется реализация следующих фишек:\n" +
                "светлая и темная тема принудительно или авто матическое определение\n" +
                "выбор и добавление города в список быстрого доступа\n" +
                "определение набора отображаемых параметров\n" +
                "выбор режима добавления записи истории"
    }
    val text: LiveData<String> = _text
}