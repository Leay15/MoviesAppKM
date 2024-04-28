@file:OptIn(ExperimentalResourceApi::class)

package example.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import common.currentTimeAt
import example.dataclass.Country
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun DateTimeExample(countries: List<Country>){
    var showCountries by remember { mutableStateOf(false) }
    var timeAtLocation by remember { mutableStateOf("No location Selected") }
    Column(modifier = Modifier.padding(20.dp)) {
        Text(
            timeAtLocation,
            style = TextStyle(
                fontSize = 20.sp
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally)
        )
        Row(modifier = Modifier.padding(start = 20.dp, top = 10.dp)) {
            DropdownMenu(
                expanded = showCountries,
                onDismissRequest = {
                    showCountries = false
                }
            ) {
                countries.forEach { (name, zone, image) ->
                    DropdownMenuItem(
                        onClick = {
                            timeAtLocation = currentTimeAt(name, zone)
                            showCountries = false
                        }
                    ) {
                        Image(
                            painterResource(image),
                            modifier = Modifier.size(50.dp).padding(end = 10.dp),
                            contentDescription = "$name flag"
                        )
                        Text(name)
                    }
                }
            }
        }
        Button(
            modifier = Modifier.padding(top = 10.dp),
            onClick = {
                showCountries = !showCountries
            }) {
            Text("Select Location")
        }
    }
}