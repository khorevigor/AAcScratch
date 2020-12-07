package com.dsphoenix.aacscratch.data

import com.dsphoenix.aacscratch.R

data class Movie(
    val previewImageId: Int,
    val title: String,
    val tagline: String,
    val rating: Int,
    val reviewCount: Int,
    val duration: Int,
    val pg: Int,
    val liked: Boolean
)

class MovieSource {
    fun getMovies(): List<Movie> =
        listOf(
            Movie(R.drawable.avengers_end_game_tile, "Avengers: End game", "Action, Adventure, Drama", 4, 125, 137, R.drawable.ic_pg_13, false),
            Movie(R.drawable.tenet_preview, "Tenet", "Action, Sci-Fi, Thriller", 5, 98, 97, R.drawable.ic_pg_16, true),
            Movie(R.drawable.black_widow_preview, "Black Widow", "Action, Adventure, Sci-Fi", 4, 38, 102, R.drawable.ic_pg_13, false),
            Movie(R.drawable.wonder_woman_preview, "Wonder Woman 1984", "Action, Adventure, Fantasy", 5, 74, 120, R.drawable.ic_pg_13, false),
            Movie(R.drawable.avengers_end_game_tile, "Avengers: End game", "Action, Adventure, Drama", 4, 125, 137, R.drawable.ic_pg_13, false),
            Movie(R.drawable.tenet_preview, "Tenet", "Action, Sci-Fi, Thriller", 5, 98, 97, R.drawable.ic_pg_16, true),
            Movie(R.drawable.black_widow_preview, "Black Widow", "Action, Adventure, Sci-Fi", 4, 38, 102, R.drawable.ic_pg_13, false),
            Movie(R.drawable.wonder_woman_preview, "Wonder Woman 1984", "Action, Adventure, Fantasy", 5, 74, 120, R.drawable.ic_pg_13, false)
        )
}