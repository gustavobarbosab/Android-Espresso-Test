package com.github.gustavobarbosab.testapplication.presentation.main.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.TextViewCompat
import androidx.fragment.app.Fragment
import com.github.gustavobarbosab.testapplication.R
import com.github.gustavobarbosab.testapplication.databinding.FragmentMainBinding
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainFragment : Fragment(), MainContract.View {

    private lateinit var binding: FragmentMainBinding
    private val presenter: MainContract.Presenter by inject { parametersOf(this) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.startRequest()
    }

    override fun loadList(items: List<String>) {
        items.forEach {
            val textView = TextView(requireContext())
            textView.text = it
            binding.linearLayout.addView(textView)
        }
    }

    override fun showError() {
        Toast.makeText(
            requireContext(),
            "Ops, please try again...",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }
}