package com.dsphoenix.aacscratch.moviedetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.dsphoenix.aacscratch.MarginItemDecoration
import com.dsphoenix.aacscratch.R
import com.dsphoenix.aacscratch.data.ActorsSource

class MovieDetailsFragment : Fragment() {
    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_details, container, false)

        view.findViewById<TextView>(R.id.back_button_text).setOnClickListener {
            findNavController().navigateUp()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val actorsSource = ActorsSource()
        recyclerView = view.findViewById(R.id.rv_actors_list)
        recyclerView?.adapter = ActorsAdapter(requireContext(), actorsSource.getActors())
        recyclerView?.addItemDecoration(MarginItemDecoration(12))
    }
}