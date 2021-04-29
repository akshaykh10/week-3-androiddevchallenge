package com.example.bloom.utils

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.example.bloom.R

sealed class Design(@DrawableRes val image:Int,@StringRes val name:Int){
    object Monstera:Design(R.drawable.img_mostera,R.string.Monstera )
    object Algaonema:Design(R.drawable.img_aglaonema,R.string.Algaonema )
    object Peace_lily:Design(R.drawable.img_peace_lily,R.string.Peace_lily )
    object FiddleLeaf:Design(R.drawable.img_fiddle,R.string.Fiddle_leaf_tree )
    object SnakePlant:Design(R.drawable.img_snake_plant,R.string.Snake_plant )
    object Pothos:Design(R.drawable.img_pothos,R.string.Pothos )

}
