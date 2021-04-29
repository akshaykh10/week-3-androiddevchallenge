package com.example.bloom.utils

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.bloom.R

sealed class Cards (@DrawableRes val image:Int, @StringRes val name:Int){
    object DesertChic:Cards(R.drawable.img_desert_chic, R.string.Desert_chic)
    object TinyTerrariums:Cards(R.drawable.img_tiny_terrarium, R.string.Tiny_terrariums)
    object JungleVibes:Cards(R.drawable.img_jungle_vibes, R.string.Jungle_vibes)
    object EasyCare:Cards(R.drawable.img_easy_care, R.string.Easy_care)
    object Statements:Cards(R.drawable.img_statements, R.string.Statements)
}

