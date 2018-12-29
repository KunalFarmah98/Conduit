package com.apps.kunalfarmah.conduit.Fragments.Main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.apps.kunalfarmah.conduit.Adapters.ArticleFeedRecyclerAdapter

import com.apps.kunalfarmah.conduit.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    // creating an adapter
    private var articleFeedRecyclerAdapter = ArticleFeedRecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    // this is a shortcut to applying the recycler view components in few lines of code
    ): View? = inflater.inflate(R.layout.fragment_home, container, false).apply {
          this.rv_article_feed.layoutManager = LinearLayoutManager(context)
          this.rv_article_feed.adapter = articleFeedRecyclerAdapter

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        // the observe function observe any changes in the data and changes the data accordingly
        viewModel.globalFeed.observe(   // this functions needs a lifecyce object
            //so we pass the lifecycle object fo the fragment itself
            {lifecycle},
           // { Log.d("Articles", "COUNT =  ${it.size}")}
            {articleFeedRecyclerAdapter.updateArticlList(it)}
        )

        //whenever the global feed in the articles is changed, we refresh the list which is observed by th viewodel

        viewModel.refreshGlobalFeed()
    }

}
