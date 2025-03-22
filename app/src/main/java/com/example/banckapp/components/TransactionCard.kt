package com.example.banckapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banckapp.models.Transaction
import com.example.banckapp.ui.theme.AccentBlue
import com.example.banckapp.ui.theme.BanckAppTheme


@Composable
fun TransactionCard(transaction: Transaction) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.surface,
            shape = MaterialTheme.shapes.medium)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(if (transaction.nombre == "Nike Store") Color.Black
                else if (transaction.nombre == "Pepsi") AccentBlue
                else if (transaction.nombre == "Costco") Color.Red
                else Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = null,
                modifier = Modifier.size(30.dp),
                tint = Color.White

            )
        }// fin text

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(text = transaction.nombre,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold)

            Text(text = transaction.category,
                fontSize = 12.sp,
                color = Color.Gray)
        }// fin column

        Column(horizontalAlignment = Alignment.End) {
            Text(text = "-$${transaction.monto}",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black)

            Text(text = transaction.hora,
                fontSize = 12.sp,
                color = Color.Gray)
        }// fin column
    }// fin row
}

@Preview(
    showBackground = true
)
@Composable
fun TransactionCardPreview(){
    BanckAppTheme {
        TransactionCard(
            transaction = Transaction("Nike Store", "Ropa & Zapatos", 27, "2:23 PM")
        )
    }
}