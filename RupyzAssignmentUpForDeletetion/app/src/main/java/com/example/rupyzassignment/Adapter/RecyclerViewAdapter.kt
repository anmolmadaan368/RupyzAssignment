package com.example.rupyzassignment.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rupyzassignment.Model.Data
import com.example.rupyzassignment.Model.ListResponse
import com.example.rupyzassignment.R
import kotlinx.android.synthetic.main.item_list.view.*

class RecyclerViewAdapter(private val context: Context, private var usersResponse: ArrayList<Data>):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list,parent,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(users = usersResponse[position])
        val user = usersResponse[position]

//        holder.id.text = post.id
        holder.title.text = user.title
        holder.subject.text= user.subtitle

        Glide.with(holder.itemView.context)
            .load(user.thumbnail_image_url)
            .into(holder.itemView.imageView)

    }

    override fun getItemCount(): Int {
        return usersResponse.size
    }

    fun setUserData(postList: ArrayList<Data>) {
        this.usersResponse = postList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        //        fun bind(users: UsersItem){
//            itemView.txtName.text = users.name
        val title: TextView = itemView.findViewById(R.id.txtTitle)
        val subject: TextView = itemView.findViewById(R.id.txtSubtitle)
        val image: ImageView = itemView.findViewById(R.id.imageView)
        //  itemView.txtSubject.text = users.subjects.toString()


    }
}