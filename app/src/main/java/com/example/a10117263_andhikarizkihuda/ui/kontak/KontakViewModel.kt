package com.example.a10117263_andhikarizkihuda.ui.kontak

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KontakViewModel : ViewModel() {
    /*
        Nim : 10117263
        Nama : Andhika Rizki Huda
        Kelas : IF-8
     */
    private val _text = MutableLiveData<String>().apply {
        value = ""
    }
    val text: LiveData<String> = _text
}