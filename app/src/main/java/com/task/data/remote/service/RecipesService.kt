package com.task.data.remote.service

import com.task.data.dto.recipes.MovieResponse
import com.task.data.dto.recipes.RecipesItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by TruyenDev
 */

interface RecipesService {
    @GET("recipes.json")
    suspend fun fetchRecipes(): Response<List<RecipesItem>>

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(
        @Query("language") language: String,
        @Query("page") page: Int
    ): Response<List<MovieResponse>>
}
