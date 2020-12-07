package com.dsphoenix.aacscratch.movieslist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dsphoenix.aacscratch.data.Movie
import com.dsphoenix.aacscratch.R

class MoviesListAdapter(context: Context, private val movies: List<Movie>, private val navController: NavController? = null)
    : RecyclerView.Adapter<MoviesListAdapter.MovieViewHolder>() {
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getItemCount(): Int = movies.size
    private fun getItem(position: Int) = movies[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            inflater.inflate(R.layout.vh_movie_preview, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))

        holder.itemView.setOnClickListener {
            val action =
                MovieListFragmentDirections.actionMovieListFragmentToMovieDetailsFragment3()
            navController?.navigate(action)
        }
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val previewImage: ImageView = itemView.findViewById(R.id.movie_preview_image)
        private val title: TextView = itemView.findViewById(R.id.movie_preview_title)
        private val tagline: TextView = itemView.findViewById(R.id.tagline)
        //    private val ratingbar  // delayed until rating bar implemented
        private val reviewCount: TextView = itemView.findViewById(R.id.review_count)
        private val duration: TextView = itemView.findViewById(R.id.duration)
        private val pgRate: ImageView = itemView.findViewById(R.id.pg_rate)
        private val like: ImageView = itemView.findViewById(R.id.like)

        fun bind(movie: Movie) {
            Glide.with(context).load(movie.previewImageId).into(previewImage)
            Glide.with(context).load(movie.pg).into(pgRate)
            title.text = movie.title
            tagline.text = movie.tagline
            reviewCount.text = context.getString(R.string.review_count, movie.reviewCount)
            duration.text = context.getString(R.string.duration, movie.duration)

            like.setColorFilter(
                ContextCompat.getColor(
                    context,
                    if (movie.liked) R.color.pink else R.color.light_gray
                ), android.graphics.PorterDuff.Mode.SRC_IN
            )
        }
    }
}

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context
