package com.apps.kunalfarmah.conduit.Extensions

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// making an inline extension function to enqueue the data into the articles ArrayList
// we do this as directed by the retrofit inbuilt function structure


// the Call<T> is a generic function of the retrofit class
// the enqueue function is a retrofit function that returns true if the call has been executed

inline fun <T> Call<T>.enqueue(crossinline done:(t:Throwable?, response: Response<T>?)->Unit){   // this is a lambda (a function whith a function as an argument)
   this.enqueue(object :Callback<T>{
       override fun onFailure(call: Call<T>, t: Throwable) {
           // if call fails, we return null as response
           done(t,null)
       }

       override fun onResponse(call: Call<T>, response: Response<T>) {
           done(null,response)
       }
   })
}