package com.example.whatsappclone.presentation.bottomNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappclone.R

@Composable
@Preview(showSystemUi = true)
fun BottomNavigation() {
    BottomAppBar(
        tonalElevation = 12.dp,
        containerColor = Color.White
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            BottomAppBarComponent(
                Buttontitle = "Chats",
                icon = R.drawable.message,
                onclick = {}
            )
            BottomAppBarComponent(
                Buttontitle = "Updates",
                icon = R.drawable.update_icon,
                onclick = {}

            )
            BottomAppBarComponent(
                Buttontitle = "Community",
                icon = R.drawable.communities_icon,
                onclick = {}
            )
            BottomAppBarComponent(
                Buttontitle = "Calls",
                icon = R.drawable.telephone,
                onclick = {}
            )
        }
    }
}


@Composable
fun BottomAppBarComponent(Buttontitle: String, icon: Int, onclick: () -> Unit) {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButton(onClick = onclick) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(28.dp),
            )
        }
        Text(text = Buttontitle, fontWeight = FontWeight.Bold)
    }
}
