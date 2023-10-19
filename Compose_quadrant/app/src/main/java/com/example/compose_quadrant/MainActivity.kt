package com.example.compose_quadrant

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.Compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_quadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page_viewer()
                }
            }
        }
    }
}

@Composable
fun Page_viewer() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)){
            ComposableInfoCard(stringResource(id = R.string.Text_comp), stringResource(R.string.Text_comp_des), Color(0xFFEADDFF), modifier = Modifier.weight(1f))
            ComposableInfoCard(stringResource(id = R.string.Img_comp), stringResource(R.string.Img_comp_des), Color(0xFFD0BCFF), modifier = Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)){
            ComposableInfoCard(stringResource(id = R.string.Row_comp), stringResource(R.string.Row_comp_des), Color(0xFFB69DF8), modifier = Modifier.weight(1f))
            ComposableInfoCard(stringResource(id = R.string.Col_comp), stringResource(R.string.Col_comp_des), Color(0xFFF6EDFF), modifier = Modifier.weight(1f))
        }
    }
}

@Composable
private fun ComposableInfoCard(title: String, description: String, background_cl: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(background_cl)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Compose_Quadrant_App() {
    Compose_quadrantTheme {
        Page_viewer()
    }
}