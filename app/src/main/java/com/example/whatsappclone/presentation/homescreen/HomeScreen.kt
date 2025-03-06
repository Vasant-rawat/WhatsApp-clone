package com.example.whatsappclone.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R
import com.example.whatsappclone.presentation.bottomNavigation.BottomAppBarComponent
import com.example.whatsappclone.presentation.bottomNavigation.BottomNavigation
import com.example.whatsappclone.presentation.chatlist.ChatListModel
import com.example.whatsappclone.presentation.chatlist.ChatUi

@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {
    val chatdata = listOf(
        ChatListModel(
            R.drawable.salmankhan,
            "Salman Khan",
            "10:00 AM",
            "Hello"
        ),

        ChatListModel(
            R.drawable.ajay_devgn,
            "Ajay Devgn",
            "10:00 AM",
            "Hello"
        ),
        ChatListModel(
            R.drawable.akshay_kumar,
            "Akshay Kumar",
            "10:00 AM",
            "Hello"
        ),

        ChatListModel(
            R.drawable.sharukhkhan,
            "Sharukh Khan",
            "10:00 AM",
            "Hello"
        ),

        ChatListModel(
            R.drawable.bhuvan_bam,
            "Bhuvan Bam",
            "10:00 AM",
            "Hello"
        ),

        ChatListModel(
            R.drawable.disha_patani,
            "Disah Patani",
            "10:00 AM",
            "Hello"
        ),

        ChatListModel(
            R.drawable.profile_placeholder,
            "Vasant Rawat",
            "10:00 AM",
            "Kill Your self Dude"
        )

    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }
        }
        , bottomBar = { BottomNavigation() }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "WhatsApp",
                    fontSize = 24.sp,
                    color = colorResource(R.color.dark_green),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(16.dp),
                    fontWeight = FontWeight.SemiBold
                )


                Row(
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(16.dp)
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )

                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                }
            }
            HorizontalDivider()
            LazyColumn {
                items(chatdata) { it->
                    ChatUi(it)
                }
            }

        }
    }
}




