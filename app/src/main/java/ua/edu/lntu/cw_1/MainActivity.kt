package ua.edu.lntu.cw_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ua.edu.lntu.cw_1.ui.theme.IPZ_CW_1_Hmilovskij_OleksandrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_1_Hmilovskij_OleksandrTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column() {
        Column() {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
            Column() {
                Text(text = "Name Surname")
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Title")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Column() {
                Row() {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
                    Text(text = "number phone")
                }
                Row() {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
                    Text(text = "name")
                }
                Row() {
                    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
                    Text(text = "mail")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ_CW_1_Hmilovskij_OleksandrTheme {
        Greeting("Android")
    }
}