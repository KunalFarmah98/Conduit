package com.apps.kunalfarmah.conduit.Fragments.Main.Article


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import com.apps.kunalfarmah.conduit.R

class EditArticleFragment : Fragment() {

    companion object {
        fun newInstance() = EditArticleFragment()
    }

    // as read and edit have same functionality, use readviewmodel in edit article
    private lateinit var viewModel: ReadArticleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_edit_article, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ReadArticleViewModel::class.java)
        // TODO: Use the ViewModel
    }


}
