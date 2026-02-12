package eu.ekansh.wishlistapp

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarView(
    title : String,
    onBackNavClick : () -> Unit = {}
){
    TopAppBar(
        title = {
            Text(
                text = title,
                color = colorResource(id = R.color.white)
            )
        },
        modifier = Modifier
            .padding(start = 4.dp)
            .heightIn(max = 24.dp),
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color)
    )

}