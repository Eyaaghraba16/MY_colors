
package com.example.tp1

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.tp1.ui.theme.Tp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tp1Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



    @Composable
    fun CounterComposable(modifier: Modifier = Modifier) {
        Row {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {

                    var counter = 0

                    counter++
                    println("counter : $counter")

                    Text("+", fontSize = 24.sp)


                Button(
                    onClick = {
                        val counter = null

                        counter
                    }
                ) {
                    Text("-", fontSize = 24.sp)
                }
            }
        }


    }


fun Greeting(name: String, modifier: Modifier = Modifier) {

}
@Composable
@Preview(showBackground = true)

fun ImageComposablePreview(
    modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),

        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Fit
    )

    Tp1Theme {
        Greeting("Android")
    }
}
