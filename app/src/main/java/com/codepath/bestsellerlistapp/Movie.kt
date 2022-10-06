package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single movie from The Movie Database
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("overview")
    var description: String? = null


    //TODO-STRETCH-GOALS amazonUrl
}