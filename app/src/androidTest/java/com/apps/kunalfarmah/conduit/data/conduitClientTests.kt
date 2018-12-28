package com.apps.kunalfarmah.conduit.data

import com.apps.kunalfarmah.conduit.Data.ConduitClient
import org.junit.Test
import org.junit.Assert.*

class conduitClientTests{

    @Test
    fun List_all_articles_is_working(){
        // calling the getArticle() method of the conduitapi interface on the conduitClient object
        val response = ConduitClient.conduitApi.getArticles().execute()
        response.body()!!.let {
            assertNotNull(it)
            assertNotNull(it.articles)
            assertEquals(500,it.artticlesCount)
            // the documentation says that the expected articles count should be 200
        }
    }
}