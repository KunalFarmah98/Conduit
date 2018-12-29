package com.apps.kunalfarmah.conduit.Fragments.Main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.apps.kunalfarmah.conduit.Data.Article
import com.apps.kunalfarmah.conduit.Data.ConduitClient
import com.apps.kunalfarmah.conduit.Extensions.enqueue

class HomeViewModel : ViewModel() {

    val globalFeed : MutableLiveData<ArrayList<Article> > by lazy {
        MutableLiveData<ArrayList<Article>>()
    }
        fun refreshGlobalFeed(){
            // the enqueue fucnton runs asynchronously and we need to use postValue to update the value of
            // the object
        ConduitClient.conduitApi.getArticles().enqueue{t, response->
            response?.body()?.let{
                globalFeed.postValue(it.articles)

            }
        }
    }
}
