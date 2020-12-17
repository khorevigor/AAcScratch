package com.dsphoenix.aacscratch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dsphoenix.aacscratch.movieslist.MovieListFragmentDirections

class MovieListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)

        view.findViewById<ImageView>(R.id.rv_movies_list).setOnClickListener {
            val action = MovieListFragmentDirections.actionMovieListFragmentToMovieDetailsFragment3()
            findNavController().navigate(action)
        }

        return view
    }

}