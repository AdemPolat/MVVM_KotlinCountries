package com.example.kotlincountries.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.kotlincountries.model.Country
import kotlinx.coroutines.launch

class CountryViewModel: BaseViewModel {

    val countryLiveData = MutableLiveData<Country>()


    fun getDataFromRoom(uuid: Int){

        launch {

            val dao = CountryDatabase(getApplication()).countryDao()
            val country =dao.getCountry(uuid)
            countryLiveData.value=country
        }












    }



}