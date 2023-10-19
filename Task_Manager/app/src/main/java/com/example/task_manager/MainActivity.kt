package com.example.task_manager

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task_manager.ui.theme.Task_ManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task_ManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    //val textView = findViewById<TextView>(R.string.Done_message)
                    TaskImage(getString(R.string.Done_message),getString(R.string.Congratulate))
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
    name = "task preview",
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    Task_ManagerTheme {
        TaskImage(stringResource(id =R.string.Done_message), stringResource(id = R.string.Congratulate))
//        Greeting("Android")
    }
}

@Composable
fun TaskImage(first: String,second: String,modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.ic_task_completed)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //verticalArrangement = Arrangement.Center,
        //modifier = modifier
//        val verticalLayout = LinearLayout(this)
//        verticalLayout.orientation = LinearLayout.VERTICAL
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .alpha(0.9F)
                .align(CenterHorizontally)
            //alignment = Alignment.CenterHorizontally
            )
        Text(
            text = first,

            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
                .align(alignment = CenterHorizontally),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = second,
            modifier = Modifier
                .padding(54.dp)
                .align(alignment = CenterHorizontally)
        )
    }


}