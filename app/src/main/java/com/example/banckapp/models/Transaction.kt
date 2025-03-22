package com.example.banckapp.models
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Transaction(
    val nombre: String,
    val category: String,
    var monto: Int,
    val hora: String = SimpleDateFormat("dd-MMM-yyyy HH:mm", Locale.getDefault()).format(Date()) // Fecha actual
)

val TransactionsList = listOf (
    Transaction("Nike Store", "Ropa & Zapatos", 27, "2:23 PM"),
    Transaction("Pepsi", "Restaurants & Cafe", 34, "10:00 AM"),
    Transaction("Costco", "Wholesale Club", 450, "11:45 AM")
)
