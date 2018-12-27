package com.apps.kunalfarmah.conduit.Fragments.Main.Article

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.apps.kunalfarmah.conduit.R

class ReadArticleFragment : Fragment() {

    companion object {
        fun newInstance() = ReadArticleFragment()
    }

    private lateinit var viewModel: ReadArticleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.read_article_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ReadArticleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
