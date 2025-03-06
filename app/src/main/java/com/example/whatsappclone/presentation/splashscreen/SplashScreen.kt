package com.example.whatsappclone.presentation.splashscreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R

@Composable
@Preview(showSystemUi = true)
fun SplashScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(R.drawable.whatsapp_icon),
            contentDescription ="WhatsApp Update" ,
            modifier = Modifier.size(80.dp)
                .align(Alignment.Center))
        Column (modifier = Modifier.align(Alignment.BottomCenter).padding(20.dp)
        , horizontalAlignment =Alignment.CenterHorizontally){
            Text("From" , fontSize = 18.sp, fontWeight = FontWeight.Bold )
            Row (modifier = Modifier.padding()){
                Icon(painter = painterResource(R.drawable.meta),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                ,tint= colorResource(R.color.light_green)
                )
                Text("Meta", fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            }
        }
    }
}