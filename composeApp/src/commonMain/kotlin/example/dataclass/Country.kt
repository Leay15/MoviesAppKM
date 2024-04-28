package example.dataclass

import kotlinx.datetime.TimeZone
import moviesappkm.composeapp.generated.resources.Res
import moviesappkm.composeapp.generated.resources.eg
import moviesappkm.composeapp.generated.resources.fr
import moviesappkm.composeapp.generated.resources.id
import moviesappkm.composeapp.generated.resources.jp
import moviesappkm.composeapp.generated.resources.mx
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
data class Country(val name: String, val zone: TimeZone, val image: DrawableResource)

@OptIn(ExperimentalResourceApi::class)
fun countries() = listOf(
    Country("Japan", TimeZone.of("Asia/Tokyo"), Res.drawable.jp),
    Country("France", TimeZone.of("Europe/Paris"), Res.drawable.fr),
    Country("Mexico", TimeZone.of("America/Mexico_City"), Res.drawable.mx),
    Country("Indonesia", TimeZone.of("Asia/Jakarta"), Res.drawable.id),
    Country("Egypt", TimeZone.of("Africa/Cairo"), Res.drawable.eg)
)
