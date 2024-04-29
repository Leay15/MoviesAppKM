import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import example.dataclass.Country
import example.dataclass.countries
import example.views.DateTimeExample
import movies.main.view.HomeView
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App(countries: List<Country> = countries()) {
    //Example for DateTimeExample
    /*
    MaterialTheme {
        DateTimeExample(countries)
    }
    */
    MaterialTheme {
        HomeView()
    }

}
