package com.example.banckapp.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banckapp.components.Activity
import com.example.banckapp.components.Header
import com.example.banckapp.components.TransactionCard
import com.example.banckapp.models.TransactionsList
import com.example.banckapp.ui.theme.BanckAppTheme

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(20.dp)
    ) {
        Header()
        Spacer(modifier = Modifier.height(20.dp))
        Activity()
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween,


            ) {
            Text(
                fontSize = 18.sp,
                text = "Transactions",
                fontWeight = FontWeight.Bold
            )
            Text(
                fontSize = 14.sp,
                text = "See All",
                color = Color.Gray
            )
        }//fin del row
        LazyColumn {
            items(TransactionsList) { transaction ->
                TransactionCard(transaction)
            }
        }// fin column

    }
}
@Preview(
    showBackground = true
)
@Composable
fun HomeScreenPreview(){
    BanckAppTheme {
        HomeScreen()
    }
}