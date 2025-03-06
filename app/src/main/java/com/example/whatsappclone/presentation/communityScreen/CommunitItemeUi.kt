package com.example.whatsappclone.presentation.communityScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommunityItemUi(communityData: CommunitItemeUiData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically // Aligns the children of a Row or Column vertically.
    ) {
        Image(
            painter = painterResource(communityData.image),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = communityData.name, fontWeight = FontWeight.Bold, fontSize = 14.sp)
            Text(text = communityData.memberCount, color = Color.Gray, fontSize = 12.sp)
        }
    }
}

data class CommunitItemeUiData(
    val image: Int,
    val name: String,
    val memberCount: String
)