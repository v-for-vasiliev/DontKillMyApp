package ru.vasiliev.dontkillmyapp.ui.vendorhacks

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import ru.vasiliev.dontkillmyapp.R
import ru.vasiliev.dontkillmyapp.domain.interactor.VendorHacksInteractor
import ru.vasiliev.dontkillmyapp.ui.vendorhacks.viewmodel.VendorHacksViewModel
import ru.vasiliev.dontkillmyapp.ui.vendorhacks.viewmodel.VendorHacksViewModelProvider
import javax.inject.Inject

class VendorHacksFragment : Fragment() {

    companion object {
        fun newInstance() = VendorHacksFragment()
    }

    @Inject
    private lateinit var vendorHacksInteractor : VendorHacksInteractor

    private val viewModel by activityViewModels { VendorHacksViewModelProvider(vendorHacksInteractor, activity) }

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