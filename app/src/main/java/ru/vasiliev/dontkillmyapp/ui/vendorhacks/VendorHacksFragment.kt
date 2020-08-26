package ru.vasiliev.dontkillmyapp.ui.vendorhacks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.vasiliev.dontkillmyapp.R

@AndroidEntryPoint
class VendorHacksFragment : Fragment() {

    companion object {
        fun newInstance() = VendorHacksFragment()
    }

    private val viewModel: VendorHacksViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}