package com.model.response

import com.google.gson.annotations.SerializedName

data class Currencies (
    val summary: List<Frankfurter>
)
data class Frankfurter (

    @SerializedName("amount" ) var amount : String,
    @SerializedName("base"   ) var base   : String,
    @SerializedName("date"   ) var date   : String,
    @SerializedName("rates"  ) var rates  : Rates

)

data class Rates (

    @SerializedName("AUD" ) var AUD : String,
    @SerializedName("BGN" ) var BGN : String,
    @SerializedName("BRL" ) var BRL : String,
    @SerializedName("CAD" ) var CAD : String,
    @SerializedName("CHF" ) var CHF : String,
    @SerializedName("CNY" ) var CNY : String,
    @SerializedName("CZK" ) var CZK : String,
    @SerializedName("DKK" ) var DKK : String,
    @SerializedName("GBP" ) var GBP : String,
    @SerializedName("HKD" ) var HKD : String,
    @SerializedName("HUF" ) var HUF : String,
    @SerializedName("IDR" ) var IDR : String,
    @SerializedName("ILS" ) var ILS : String,
    @SerializedName("INR" ) var INR : String,
    @SerializedName("ISK" ) var ISK : String,
    @SerializedName("JPY" ) var JPY : String,
    @SerializedName("KRW" ) var KRW : String,
    @SerializedName("MXN" ) var MXN : String,
    @SerializedName("MYR" ) var MYR : String,
    @SerializedName("NOK" ) var NOK : String,
    @SerializedName("NZD" ) var NZD : String,
    @SerializedName("PHP" ) var PHP : String,
    @SerializedName("PLN" ) var PLN : String,
    @SerializedName("RON" ) var RON : String,
    @SerializedName("SEK" ) var SEK : String,
    @SerializedName("SGD" ) var SGD : String,
    @SerializedName("THB" ) var THB : String,
    @SerializedName("TRY" ) var TRY : String,
    @SerializedName("USD" ) var USD : String,
    @SerializedName("ZAR" ) var ZAR : String
)