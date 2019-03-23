package com.example.weather

object Model {
    data class Result(
        val current: Current,
        val location: Location
    )

    data class Current(
        val temp_c: Int,
        val feelslike_c: Double,
        val wind_mph: Double
    )

    data class Location(
        val name: String,
        val country: String
    )
}
