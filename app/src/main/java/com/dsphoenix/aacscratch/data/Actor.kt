package com.dsphoenix.aacscratch.data

import com.dsphoenix.aacscratch.R

data class Actor(
    val imageId: Int,
    val name: String
)

class ActorsSource {
    fun getActors(): List<Actor> =
        listOf(
            Actor(R.drawable.downey_jr_icon, "Robert Downey, Jr."),
            Actor(R.drawable.evans_icon, "Chris Evans"),
            Actor(R.drawable.hemsworth_icon, "Chris Hemsworth"),
            Actor(R.drawable.ruffalo_icon, "Mark Ruffalo"),
            Actor(R.drawable.downey_jr_icon, "Robert Downey, Jr."),
            Actor(R.drawable.evans_icon, "Chris Evans"),
            Actor(R.drawable.hemsworth_icon, "Chris Hemsworth"),
            Actor(R.drawable.ruffalo_icon, "Mark Ruffalo")
        )
}
