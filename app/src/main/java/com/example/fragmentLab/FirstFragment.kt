package com.example.fragmentLab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentLab.R

class FirstFragment: Fragment() {

    //function for displaying a fragment on the screen
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)  //find xml_file our fragment
    }
}