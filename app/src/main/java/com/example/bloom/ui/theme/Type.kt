package com.example.bloom.ui.theme


import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.sp
import com.example.bloom.R



val NunitoSansBold = FontFamily(Font(R.font.nunito_sans_bold))
val NunitoSansSemiBold = FontFamily(Font(R.font.nunito_sans_semibold))
val NunitoSansLight = FontFamily(Font(R.font.nunito_sans_light))

val typography = Typography(
    h1 = TextStyle(
        fontFamily = NunitoSansBold,
        fontSize = 18.sp,
        letterSpacing = 0.sp
    ),
    h2 = TextStyle(
        fontFamily = NunitoSansBold,
        fontSize = 14.sp,
        letterSpacing = 0.15.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = NunitoSansLight,
        fontSize = 16.sp,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontFamily = NunitoSansLight,
        fontSize = 14.sp,
        letterSpacing = 0.sp
    ),
    body2 = TextStyle(
        fontFamily = NunitoSansLight,
        fontSize = 12.sp,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontFamily = NunitoSansSemiBold,
        fontSize = 14.sp,
        letterSpacing = 1.sp
    ),
    caption = TextStyle(
        fontFamily = NunitoSansSemiBold,
        fontSize = 12.sp,
        letterSpacing = 1.sp
    )
)