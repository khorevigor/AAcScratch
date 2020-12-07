package com.dsphoenix.aacscratch.moviedetails

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dsphoenix.aacscratch.R
import com.dsphoenix.aacscratch.data.Actor

class ActorsAdapter(context: Context, private val actors: List<Actor>)
    : RecyclerView.Adapter<ActorsAdapter.ActorViewHolder>() {
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getItemCount(): Int = actors.size
    private fun getItem(position: Int) = actors[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        return ActorViewHolder(
            inflater.inflate(R.layout.vh_actor, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ActorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val avatar: ImageView = itemView.findViewById(R.id.iv_avatar)
        private val name: TextView = itemView.findViewById(R.id.tv_name)

        fun bind(actor: Actor) {
            Glide.with(context).load(actor.imageId).into(avatar)
            name.text = actor.name
        }
    }
}

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context