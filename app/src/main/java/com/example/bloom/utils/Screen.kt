package com.example.bloom.utils

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import com.example.bloom.R
import com.example.bloom.ui.theme.Account_Circle_Icon
import com.example.bloom.ui.theme.Favourite_Border_Icon
import com.example.bloom.ui.theme.Home_Icon
import com.example.bloom.ui.theme.Shopping_Cart_Icon

sealed class Screen(val route:String, @StringRes val resourceId:Int, val icon:@Composable ()-> Unit)
{
    object Home:Screen("HomeScreen", R.string.Home, { Home_Icon() })
    object Fav:Screen("FavScreen", R.string.Favorites,{ Favourite_Border_Icon() })
    object Profile:Screen("ProfileScreen", R.string.Profile, { Account_Circle_Icon() })
    object Cart:Screen("CartScreen", R.string.Cart, { Shopping_Cart_Icon() })
}
