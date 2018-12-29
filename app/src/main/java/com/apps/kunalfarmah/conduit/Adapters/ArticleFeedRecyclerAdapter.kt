package com.apps.kunalfarmah.conduit.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apps.kunalfarmah.conduit.Data.Article
import com.apps.kunalfarmah.conduit.R
import kotlinx.android.synthetic.main.list_item_article.view.*


class ArticleFeedRecyclerAdapter: RecyclerView.Adapter<ArticleFeedRecyclerAdapter.ArticleViewHolder>(){

    val articleList = ArrayList<Article>()

    fun updateArticlList(newArticleList:ArrayList<Article>){
        articleList.clear()
        articleList.addAll(newArticleList)
    }

    // putting an "=" after return type makes the function return the thing written after it
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder =
        with(parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater) {
            // passing the constructor parameter as a View returned by the inflate method
            ArticleViewHolder(inflate(R.layout.list_item_article, parent, false))
        }

    override fun getItemCount(): Int {
        return articleList.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {

        // binding the data given by the articlelist to the textview with help fo ArticleViewHolder
        holder.bindView(articleList[position])
    }


    class ArticleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun bindView(article: Article){

            itemView.tv_article_title.text = article.title

            if(itemView.tv_article_description.text.length>200) {
                itemView.tv_article_description.text = article.description.substring(0,200)+"...."
            }

            else {
                itemView.tv_article_description.text = article.description
            }
        }

    }
}