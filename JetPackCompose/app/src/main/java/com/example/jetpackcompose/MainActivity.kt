package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyImage(getString(R.string.title),getString(R.string.Passage_1),getString(R.string.Passage_2))
                    //Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    name = "FirstPreview",
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    JetPackComposeTheme {
        MyImage(stringResource(id = R.string.title), stringResource(id = R.string.Passage_1),stringResource(id = R.string.Passage_2))
        //Greeting("Android")
    }
}

@Composable
fun MyImage(text1: String,text2: String, text3: String,modifier: Modifier = Modifier) {
    val image = painterResource(id = (R.drawable.bg_compose_background))
    Column{
        Image(
            painter = image,
            contentDescription = null,
            //contentScale = ContentScale.Crop,
            alpha = 0.8F
        )

        Text(
            text = text1,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = text2,
            //fontSize = 10.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = text3,
            //fontSize = 10.sp,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}
