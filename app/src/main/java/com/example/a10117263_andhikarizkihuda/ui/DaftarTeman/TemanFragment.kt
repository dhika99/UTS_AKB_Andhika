package com.example.a10117263_andhikarizkihuda.ui.DaftarTeman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.a10117263_andhikarizkihuda.R

class TemanFragment : Fragment() {
    /*
        Nim : 10117263
        Nama : Andhika Rizki Huda
        Kelas : IF-8
     */
    private lateinit var temanViewModel: TemanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        temanViewModel =
                ViewModelProviders.of(this).get(TemanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_teman, container, false)
        val textView: TextView = root.findViewById(R.id.text_teman)
        temanViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
