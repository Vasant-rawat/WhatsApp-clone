package com.example.whatsappclone.presentation.communityScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun CommunityScreen() {
    var showMenu by remember { mutableStateOf(false) }
    var isSearch by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }


    val communities = listOf(
        CommunitItemeUiData(
            image = R.drawable.img,
            name = "Food News",
            memberCount = "256"
        ), CommunitItemeUiData(
            image = R.drawable.img,
            name = "Tech News",
            memberCount = "123"
        ), CommunitItemeUiData(
            image = R.drawable.img,
            name = "Linux News",
            memberCount = "26"
        )
    )
    Scaffold(
        topBar = {
            Box(modifier = Modifier.fillMaxWidth()) {
                Column {
                    Row {
                        if (isSearch) {
                            TextField(value = search, onValueChange = {
                                search = it
                            }, placeholder = {
                                Text(text = "Search", color = Color.Gray)
                            }, colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent,
                            )
                            )
                        } else {
                            Text(
                                text = "Community",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 12.dp, top = 4.dp)
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        if (isSearch) {
                            IconButton(onClick = {
                                isSearch = !isSearch
                                search = ""
                            }) {
                                Icon(
                                    painter = painterResource(R.drawable.cross),
                                    contentDescription = null,
                                    modifier = Modifier.size(15.dp)
                                )
                            }
                        }
                        IconButton(onClick = { isSearch = !isSearch }) {
                            Icon(
                                painter = painterResource(R.drawable.search),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                        IconButton(onClick = {
                            showMenu = !showMenu
                        }) {
                            Icon(
                                painter = painterResource(R.drawable.more),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                            DropdownMenu(
                                expanded = showMenu,
                                onDismissRequest = { showMenu = !showMenu }) {
                                DropdownMenuItem(
                                    text = { Text(text = "Settings ") },
                                    onClick = { showMenu = !showMenu })
                            }
                        }
                    }
                    HorizontalDivider(modifier = Modifier.padding(12.dp))
                }
            }
        }
        , bottomBar = { BottomNavigation() }

    ) {
        Column(modifier = Modifier.padding(it)) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.light_green)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Start a new community",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,

                    )

            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Your Communities",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            LazyColumn {
                items(communities) {
                    CommunityItemUi(it)
                }
            }
        }
    }
}
