import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappclone.R
import com.example.whatsappclone.presentation.callScreen.FavoriteItem

@Composable
@Preview(showSystemUi = true)
fun FavoriteSection() {
    val fav_cont = listOf(
        FavoriteContact(image = R.drawable.neat_roots, name = "raju"),
        FavoriteContact(image = R.drawable.profile_placeholder, name = "Vasant"),
        FavoriteContact(image = R.drawable.woman, name = "Omi"),
        FavoriteContact(image = R.drawable.img, name = "nice"),
        FavoriteContact(image = R.drawable.img, name = "nice"),
        FavoriteContact(image = R.drawable.img, name = "nice"),
        FavoriteContact(image = R.drawable.img, name = "nice"),
    )
    Column(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)) {
        Text(
            text = "Favorite",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            fav_cont.forEach {
                FavoriteItem(it)
            }
        }
    }
}


data class FavoriteContact(
    val image: Int,
    val name: String,
)