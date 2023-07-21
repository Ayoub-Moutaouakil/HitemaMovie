package com.example.hitemamovie.data.repository

import com.example.hitemamovie.api.TmdbApi
import com.example.hitemamovie.data.model.MovieData

class MovieRepository(private val tmdbApi: TmdbApi) {
    suspend fun getPopularMovies(): List<MovieData> {
        val response = tmdbApi.getPopularMovies()
        return if (response.isSuccessful) {
            response.body()?.results ?: emptyList()
        } else {
            emptyList()
        }
    }

    suspend fun getTopRatedMovies(): List<MovieData> {
        val response = tmdbApi.getTopRatedMovies()
        return if (response.isSuccessful) {
            response.body()?.results ?: emptyList()
        } else {
            emptyList()
        }
    }

    suspend fun getUpcomingMovies(): List<MovieData> {
        val response = tmdbApi.getUpcomingMovies()
        return if (response.isSuccessful) {
            response.body()?.results ?: emptyList()
        } else {
            emptyList()
        }
    }
}