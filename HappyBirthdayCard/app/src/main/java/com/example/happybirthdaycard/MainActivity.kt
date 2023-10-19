package com.example.happybirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdaycard.ui.theme.HappyBirthdayCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //GreetingText(message = "Happy Birthday My dear!!", from = "Your beloved")
                    GreetingImage(message = getString(R.string.happy_birthday_dear), from = getString(R.string.from_val))
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(
            text = message,
            fontSize = 50.sp,
            lineHeight = 60.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                start = 10.dp,
                top = 10.dp,
                end = 15.dp,
                bottom = 12.dp
            )
        )
        Text(
            text = from,
            fontSize = 36.sp,
            lineHeight = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}
@Preview(
    showBackground = true,
    name = "MyPreview",
    showSystemUi = true
)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayCardTheme {
        //GreetingText(message = "Happy Birthday My dear!!",from = "From Gazi That for just preview")
        GreetingImage(stringResource(id = R.string.happy_birthday_dear), stringResource(id = R.string.from_val))
    }
}

@Composable
fun GreetingImage(message: String,from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = (R.drawable.androidparty))
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
                //.background(color = Color.Gray)
            )
    }
}
/*
Here goes the solution code..

package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContent {
           HappyBirthdayTheme {
               // A surface container using the 'background' color from the theme
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ) {
                   GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
               }
           }
       }
   }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
   // Create a column so that texts don't overlap
   Column(
       verticalArrangement = Arrangement.Center,
       modifier = modifier
   ) {
       Text(
           text = message,
           fontSize = 100.sp,
           lineHeight = 116.sp,
           textAlign = TextAlign.Center
       )
       Text(
           text = from,
           fontSize = 36.sp,
           modifier = Modifier
               .padding(16.dp)
               .align(alignment = Alignment.End)
       )
   }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Sam!", from ="From Emma")
    }
}
 */