package ru.vasiliev.dontkillmyapp.ui.vendorhack

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.vasiliev.dontkillmyapp.R

class VendorHackFragment : Fragment() {

    companion object {
        fun newInstance() = VendorHackFragment()
    }

    private lateinit var viewModel: VendorHackViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VendorHackViewModel::class.java)
        // TODO: Use the ViewModel
    }

}