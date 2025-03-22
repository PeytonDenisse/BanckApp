package com.example.banckapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banckapp.ui.theme.BanckAppTheme
import com.example.banckapp.ui.theme.CardBeige
import com.example.banckapp.ui.theme.CardPurple

@Composable
fun Activity(){
    Row(modifier = Modifier.fillMaxWidth()) {

        Box(
            modifier = Modifier
                .weight(1f)
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFDFF6E3)), // verde
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = Color.Black

                )

                Text(text = "Actividad",
                    fontSize = 18.sp,
                    color = Color.Black)
                Text(text = "de la Semana",
                    fontSize = 14.sp,
                    color = Color.Gray)
            }//fin column
        }// fin de box
        Spacer(modifier = Modifier.width(8.dp))

        Column(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(CardBeige), // beige
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Ventas",
                        fontSize = 14.sp,
                        color = Color.Gray)
                    Text(text = "$280.99",
                        fontSize = 18.sp,
                        color = Color.Black)
                }// fin column
            }// fin row
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(CardPurple),//  lila
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Ganancias",
                        fontSize = 14.sp,
                        color = Color.Gray)
                    Text(text = "$280.99",
                        fontSize = 18.sp,
                        color = Color.Black)
                }// fin column
            }//fin box
        }// fin column
    }// fin de row
}
@Preview(
    showBackground = true
)

@Composable
fun ActivityPreview(){
    BanckAppTheme {
        Activity()
    }
}