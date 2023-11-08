package com.example.composablefrankfurter08_11_2023.ui.viewmodel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.model.response.Frankfurter
import com.model.response.Rates
import kotlin.reflect.full.memberProperties

@Composable
fun CurrencyRates(name: String, value: String) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Row() {
            Column(
                Modifier
                    .align(Alignment.CenterVertically)
                    .padding(16.dp)){
                Text("${name} = ${value}", style = MaterialTheme.typography.headlineLarge)
            }
            
        }
        
    }
}
@Composable
fun MainScreen() {
    val viewModel: ResponseViewModel = viewModel()
    val rates = viewModel.responseState.value
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(rates) {
            rate ->
            val instance = Rates(
                rate.rates.AUD,
                rate.rates.BGN,
                rate.rates.BRL,
                rate.rates.CAD,
                rate.rates.CHF,
                rate.rates.CNY,
                rate.rates.CZK,
                rate.rates.DKK,
                rate.rates.GBP,
                rate.rates.HKD,
                rate.rates.HUF,
                rate.rates.IDR,
                rate.rates.ILS,
                rate.rates.INR,
                rate.rates.ISK,
                rate.rates.JPY,
                rate.rates.KRW,
                rate.rates.MXN,
                rate.rates.MYR,
                rate.rates.NOK,
                rate.rates.NZD,
                rate.rates.PHP,
                rate.rates.PLN,
                rate.rates.RON,
                rate.rates.SEK,
                rate.rates.SGD,
                rate.rates.THB,
                rate.rates.TRY,
                rate.rates.USD,
                rate.rates.ZAR
            )
            Rates::class.memberProperties.forEach {
                    member ->
                val name = member.name
                val value = member.get(instance) as String
                CurrencyRates(name = name, value = value )
            }

        }
    }
}