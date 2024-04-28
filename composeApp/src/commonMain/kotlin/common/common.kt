package common

import kotlinx.datetime.Clock
import kotlinx.datetime.IllegalTimeZoneException
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun currentTimeAt(location: String, zone: TimeZone): String {
    fun LocalTime.formatted() = "$hour:${
        if (minute < 10) {
            "0$minute"
        } else minute
    }:$second"

    return try {
        val time = Clock.System.now()
        val localTime = time.toLocalDateTime(zone).time
        "The time in $location is ${localTime.formatted()}"
    } catch (ex: IllegalTimeZoneException) {
        "Cannot Get time in Location"
    }
}

fun todaysDate(): String {
    fun LocalDateTime.format() = toString().substringBefore('T')
    val now = Clock.System.now()
    val zone = TimeZone.currentSystemDefault()
    return now.toLocalDateTime(zone).format()
}