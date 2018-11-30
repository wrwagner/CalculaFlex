package com.example.logonrmlocal.calculaflex.extensions

fun Double.format(digits: Int) =
        java.lang.String.format("%.${digits}f", this)
