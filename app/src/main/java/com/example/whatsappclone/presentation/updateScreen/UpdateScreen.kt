package com.example.whatsappclone.presentation.updateScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R
import com.example.whatsappclone.presentation.bottomNavigation.BottomNavigation

@Composable
@Preview(showSystemUi = true)
fun UpdateScreen() {
    val scrollState = rememberScrollState()
    val SampleChannel = listOf(
        ChannelItemUi(
            name = "Neat Roots", description = "Get the latest news", image = R.drawable.neat_roots
        ),
        ChannelItemUi(
            name = "Food", description = "Healthy LifeStyle advice", image = R.drawable.img
        ),

        )

    val statusData = listOf(
        StatusData(
            name = "Shamiksha", time = "Today, 10:00 AM", image = R.drawable.woman
        ),
        StatusData(
            name = "Ramesh", time = "Just now", image = R.drawable.man
        ),
        StatusData(
            name = "Raj", time = "Today, 11:00 AM", image = R.drawable.profile_placeholder
        ),
        StatusData(
            name = "Kanav", time = "10 minutes ago", image = R.drawable.profile_placeholder
        ),
    )
    Scaffold(topBar = { TopBar() }, floatingActionButton = {
        FloatingActionButton(
            onClick = {},
            containerColor = colorResource(R.color.light_green),
            modifier = Modifier.size(65.dp),
            contentColor = Color.White
        ) {
            Icon(
                painter = painterResource(R.drawable.baseline_photo_camera_24),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
        }
    }, bottomBar = { BottomNavigation() }) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            MyStatus()
            statusData.forEach {
                StatusItem(statusData = it)
            }
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider(color = Color.Gray)
            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    text = "stay updated on topics that matter to you. Find channels",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(32.dp))
                Text(text = "Find Channels to follow", color = Color.Black, fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(16.dp))
            SampleChannel.forEach {
                ChannelItemUi(channelItemUi = it)
            }
        }
    }
}