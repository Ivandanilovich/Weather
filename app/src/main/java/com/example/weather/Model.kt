package com.example.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



//object Model {
//        @SerializedName("location")
//        @Expose
//        private var userId: Int = 0
//
//        fun getId(): Int {
//                return userId
//        }




//}

object Model {

        @SerializedName("location")
        @Expose
        var location: Location? = null
        @SerializedName("current")
        @Expose
        var current: Current? = null

}

class Location {

        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("region")
        @Expose
        var region: String? = null
        @SerializedName("country")
        @Expose
        var country: String? = null
        @SerializedName("lat")
        @Expose
        var lat: Double? = null
        @SerializedName("lon")
        @Expose
        var lon: Double? = null
        @SerializedName("tz_id")
        @Expose
        var tzId: String? = null
        @SerializedName("localtime_epoch")
        @Expose
        var localtimeEpoch: Int? = null
        @SerializedName("localtime")
        @Expose
        var localtime: String? = null

}


class Condition {

        @SerializedName("text")
        @Expose
        var text: String? = null
        @SerializedName("icon")
        @Expose
        var icon: String? = null
        @SerializedName("code")
        @Expose
        var code: Int? = null

}


class Current {

        @SerializedName("last_updated_epoch")
        @Expose
        var lastUpdatedEpoch: Int? = null
        @SerializedName("last_updated")
        @Expose
        var lastUpdated: String? = null
        @SerializedName("temp_c")
        @Expose
        var tempC: Double? = null
        @SerializedName("temp_f")
        @Expose
        var tempF: Double? = null
        @SerializedName("is_day")
        @Expose
        var isDay: Int? = null
        @SerializedName("condition")
        @Expose
        var condition: Condition? = null
        @SerializedName("wind_mph")
        @Expose
        var windMph: Double? = null
        @SerializedName("wind_kph")
        @Expose
        var windKph: Double? = null
        @SerializedName("wind_degree")
        @Expose
        var windDegree: Int? = null
        @SerializedName("wind_dir")
        @Expose
        var windDir: String? = null
        @SerializedName("pressure_mb")
        @Expose
        var pressureMb: Double? = null
        @SerializedName("pressure_in")
        @Expose
        var pressureIn: Double? = null
        @SerializedName("precip_mm")
        @Expose
        var precipMm: Double? = null
        @SerializedName("precip_in")
        @Expose
        var precipIn: Double? = null
        @SerializedName("humidity")
        @Expose
        var humidity: Int? = null
        @SerializedName("cloud")
        @Expose
        var cloud: Int? = null
        @SerializedName("feelslike_c")
        @Expose
        var feelslikeC: Double? = null
        @SerializedName("feelslike_f")
        @Expose
        var feelslikeF: Double? = null
        @SerializedName("vis_km")
        @Expose
        var visKm: Double? = null
        @SerializedName("vis_miles")
        @Expose
        var visMiles: Double? = null
        @SerializedName("uv")
        @Expose
        var uv: Double? = null
        @SerializedName("gust_mph")
        @Expose
        var gustMph: Double? = null
        @SerializedName("gust_kph")
        @Expose
        var gustKph: Double? = null

}