package com.br.natanfc.filmesflix.framework.api

import com.br.natanfc.filmesflix.domain.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    //https://rafaelkenedy.github.io/matches-simulator-api/movies.json

    @GET("movies.json")
    fun getAllMovies(): Call<List<Movie>>


}