package com.example.my_business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_business_card.ui.theme.My_Business_CardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_Business_CardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FrontPage(getString(R.string.name),getString(R.string.title),getString(R.string.phone),getString(R.string.mail),getString(R.string.share_address))
                }
            }
        }
    }
}

@Composable
fun FrontPage(name: String,title: String, phone: String, gmail: String, share_add: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    val icon_pn = painterResource(id = R.drawable.telephone)
    val icon_ml = painterResource(id = R.drawable.mail)
    val icon_sr = painterResource(id = R.drawable.share)

    Box(
        modifier = modifier
            .background(Color(0xFFFFFF))
    ){
        Column(
            modifier = modifier
                .background(Color(R.color.mycol))
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = modifier
                    .weight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = modifier
                        .background(Color(R.color.black))
                        .size(width = 100.dp, height = 80.dp),
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alpha = 1.0F
                )
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Text(
                    text = title,
                    color = Color(0xFF3ddc84),
                    fontWeight = FontWeight.Light,
                )
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row (
                    modifier = modifier
                        .padding(10.dp)
                ){
                    Image(
                        modifier = modifier
                            .padding(horizontal = 10.dp)
                            .size(width = 30.dp, height = 30.dp),
                        painter = icon_pn,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        alpha = 1.0F
                    )
                    Text(
                        text = phone,
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                }
                Row(
                    modifier = modifier
                        .padding(10.dp)
                ) {
                    Image(
                        modifier = modifier
                            .padding(horizontal = 10.dp)
                            .size(width = 30.dp, height = 30.dp),
                        painter = icon_sr,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        alpha = 1.0F
                    )
                    Text(
                        text = share_add,
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                }
                Row(
                    modifier = modifier
                        .padding(10.dp)
                ) {
                    Image(
                        modifier = modifier
                            .padding(horizontal = 10.dp)
                            .size(width = 30.dp, height = 30.dp),
                        painter = icon_ml,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        alpha = 1.0F
                    )
                    Text(
                        text = gmail,
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FrontPagePreview() {
    My_Business_CardTheme {
        FrontPage(name = stringResource(R.string.name), title = stringResource(id = R.string.title), phone = stringResource(id = R.string.phone) , gmail = stringResource(id = R.string.mail), share_add = stringResource(id = R.string.share_address))
    }
}