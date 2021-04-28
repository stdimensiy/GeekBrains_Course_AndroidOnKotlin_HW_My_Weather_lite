package ru.geekbrains.androidonkotlin.hw.myweatherlite.ui.hourly_forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.geekbrains.androidonkotlin.hw.myweatherlite.R

class HourlyForecastFragment : Fragment() {

    private lateinit var hourlyForecastViewModel: HourlyForecastViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        hourlyForecastViewModel =
                ViewModelProvider(this).get(HourlyForecastViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_hourly_forecast, container, false)
        val textView: TextView = root.findViewById(R.id.text_houly_forecast)
        hourlyForecastViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}