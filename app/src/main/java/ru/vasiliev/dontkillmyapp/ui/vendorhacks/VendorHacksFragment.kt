package ru.vasiliev.dontkillmyapp.ui.vendorhacks

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.vasiliev.dontkillmyapp.R

class VendorHacksFragment : Fragment() {

    companion object {
        fun newInstance() = VendorHacksFragment()
    }

    private lateinit var viewModel: VendorHacksViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VendorHacksViewModel::class.java)
        // TODO: Use the ViewModel
    }

}