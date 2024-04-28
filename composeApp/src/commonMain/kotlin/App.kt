import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common.currentTimeAt
import example.dataclass.Country
import example.dataclass.countries
import example.views.DateTimeExample
import kotlinx.datetime.Clock
import kotlinx.datetime.IllegalTimeZoneException
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import moviesappkm.composeapp.generated.resources.Res
import moviesappkm.composeapp.generated.resources.compose_multiplatform
import moviesappkm.composeapp.generated.resources.eg
import moviesappkm.composeapp.generated.resources.fr
import moviesappkm.composeapp.generated.resources.id
import moviesappkm.composeapp.generated.resources.jp
import moviesappkm.composeapp.generated.resources.mx
import org.jetbrains.compose.resources.DrawableResource

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App(countries: List<Country> = countries()) {
    MaterialTheme {
        DateTimeExample(countries)
    }

}
