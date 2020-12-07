package com.dsphoenix.aacscratch.movieslist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dsphoenix.aacscratch.R
import com.dsphoenix.aacscratch.data.MovieSource
import kotlin.math.log

class MovieListFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_movies_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val movieSource = MovieSource()
        recyclerView = view.findViewById(R.id.rv_movies_list)
        recyclerView?.adapter = MoviesListAdapter(requireContext(), movieSource.getMovies(), findNavController())
    }
}