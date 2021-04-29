package com.example.bloom.ui.theme

import androidx.compose.foundation.layout.size
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue



@Composable
fun Account_Circle_Icon()
{
    Icon(Icons.Default.AccountCircle,contentDescription = null)
}

@Composable
fun Search_Icon()
{
    Icon(Icons.Default.Search,contentDescription = null,modifier= Modifier.size(18.dp))
}


@Composable
fun Favourite_Border_Icon()
{
    Icon(Icons.Default.FavoriteBorder,contentDescription = null)
}


@Composable
fun Home_Icon()
{
    Icon(Icons.Default.Home,contentDescription = null)
}


@Composable
fun Shopping_Cart_Icon()
{
    Icon(Icons.Default.ShoppingCart,contentDescription = null)
}


@Composable
fun Filter_List_Icon()
{
    Icon(Icons.Default.FilterList,contentDescription = null)
}




@Composable
fun CheckBox()
{

    var checked:Boolean by rememberSaveable{ mutableStateOf(false)}
    Checkbox(
        checked = checked,
        onCheckedChange = { it->
            checked=it
        },
        colors=CheckboxDefaults.colors(
            checkedColor = MaterialTheme.colors.secondary,
            checkmarkColor = MaterialTheme.colors.onSecondary

        )
    )
}






