package com.sano.reddito.util

import java.text.DecimalFormat

private val NUM_SUFFIXES = charArrayOf(' ', 'k', 'M', 'B', 'T', 'P', 'E')

fun numToK(number: Int): String {
    val value = Math.floor(Math.log10(number.toDouble())).toInt()
    val base = value / 3

    val decimalFormat = DecimalFormat("#0.#")

    return if (value >= 3 && base < NUM_SUFFIXES.size) {
        val num = decimalFormat.format(number / Math.pow(10.0, base * 3.0))
        (num + NUM_SUFFIXES[base]).trim()
    } else {
        number.toString()
    }
}
