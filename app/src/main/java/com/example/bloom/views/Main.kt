package com.example.bloom.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.bloom.R
import com.example.bloom.ui.theme.CheckBox

import com.example.bloom.ui.theme.Filter_List_Icon
import com.example.bloom.ui.theme.Search_Icon
import com.example.bloom.utils.Cards
import com.example.bloom.utils.Design
import com.example.bloom.utils.Screen

@Composable
fun Home()
{
    val row=listOf(
        Cards.DesertChic,
        Cards.TinyTerrariums,
        Cards.JungleVibes,
        Cards.EasyCare,
        Cards.Statements
    )

    val plants=listOf(
        Design.Monstera,
        Design.Algaonema,
        Design.Peace_lily,
        Design.FiddleLeaf,
        Design.SnakePlant,
        Design.Pothos
    )
    var search:String by remember{ mutableStateOf("")}
    Surface(
        modifier=Modifier.fillMaxSize(),
        color=MaterialTheme.colors.background
    ) {

        Column(
            modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 40.dp),

        ) {
            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = { Search_Icon() },
                placeholder = {
                    Text(
                        text = stringResource(id = R.string.Search),
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onBackground
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.onBackground,
                    unfocusedBorderColor = MaterialTheme.colors.onBackground
                )
            )

            Box(
                modifier =Modifier.fillMaxWidth().height(32.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(
                    text = stringResource(id = R.string.Browse_themes),
                    style=MaterialTheme.typography.h1,
                    color=MaterialTheme.colors.onBackground
                )
            }

            Spacer(modifier=Modifier.height(16.dp))

            LazyRow(
                modifier=Modifier.fillMaxWidth().height(152.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                items(row){
                    Card(
                        modifier=Modifier.width(136.dp).height(136.dp),
                        shape = MaterialTheme.shapes.small,


                        elevation= 1.dp,


                    ) {

                        Column(
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Image(
                                painter = painterResource(id = it.image),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.height(96.dp)
                            )

                            Box(
                                modifier = Modifier.height(40.dp).padding(start = 16.dp),
                                contentAlignment = Alignment.CenterStart,
                            ) {
                                Text(
                                    text = stringResource(id = it.name),
                                    style = MaterialTheme.typography.h2,
                                    color = MaterialTheme.colors.onBackground
                                )

                            }


                        }




                    }
                }

            }

            Box(
                modifier=Modifier.height(34.dp).fillMaxWidth(),
                contentAlignment = Alignment.BottomStart
            ){
                Row(
                    modifier=Modifier.matchParentSize(),
                    horizontalArrangement = Arrangement.SpaceBetween
                )
                {

                    Text(
                        text= stringResource(id = R.string.Design_home),
                        style=MaterialTheme.typography.h1,
                        color=MaterialTheme.colors.onBackground
                    )

                    Filter_List_Icon()





                }


            }

            Spacer(modifier = Modifier.height(16.dp))

            //TODO: lazy column for plants

            LazyColumn(
                modifier=Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)


            )
            {
                items(plants)
                {
                    DesignCard(image = it.image, name = it.name)

                }

            }



        }
    }
}

@Composable
fun DesignCard( image:Int, name:Int) {
   Row(
       modifier=Modifier.fillMaxWidth().height(64.dp),
       horizontalArrangement = Arrangement.spacedBy(16.dp)


   ) {
       Card(
           shape=MaterialTheme.shapes.small
       ){
           Image(
               painter = painterResource(id=image),
               contentDescription = null,
               modifier=Modifier.height(64.dp).width(64.dp),
               contentScale = ContentScale.Crop
           )

       }



       Column(
           modifier=Modifier.height(64.dp).fillMaxWidth().padding(top=16.dp),
           verticalArrangement = Arrangement.SpaceBetween
       )
       {
           Row(
               modifier=Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceBetween

           ){
               Column()
               {
                   Text(
                       text = stringResource(id = name),
                       style=MaterialTheme.typography.h2,
                       color=MaterialTheme.colors.onBackground
                   )
                   Text(
                       text = stringResource(id = R.string.Description),
                       style= MaterialTheme.typography.body1,
                       color=MaterialTheme.colors.onBackground

                   )
               }

               CheckBox()

           }

           Divider(
               modifier=Modifier.fillMaxWidth(),
               thickness = 1.dp,
               color=MaterialTheme.colors.onBackground


           )

       }







   }

}



@Composable
fun Favorite()
{
    Column(
        modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text="Favorite Screen",
            style=MaterialTheme.typography.h1
        )

    }

}

@Composable
fun Profile()
{
    Column(
        modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text="Profile Screen",
            style=MaterialTheme.typography.h1
        )

    }

}

@Composable
private fun Cart()
{
    Column(
        modifier= Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text="Cart Screen",
            style=MaterialTheme.typography.h1
        )

    }

}


@Composable
fun MainScreen(){
    val navController= rememberNavController()

    val items= listOf(
        Screen.Home,
        Screen.Fav,
        Screen.Profile,
        Screen.Cart

    )

    Scaffold(
        bottomBar ={
            BloomBottomBarNavigation(navController,items)
        },

    ) {
        MainScreenNavigation(navController)

    }
}

@Composable
private fun BloomBottomBarNavigation(
    navController:NavHostController,
    items:List<Screen>
){
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.height(56.dp)

    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute=navBackStackEntry?.arguments?.get(KEY_ROUTE)
        items.forEach{ screen ->
            BottomNavigationItem(
                icon=screen.icon,
                label={ Text(
                    text= stringResource(id = screen.resourceId),
                    style=MaterialTheme.typography.caption

                ) },
                selected = currentRoute==screen.route,
                onClick = {
                    navController.navigate(screen.route){
                        popUpTo=navController.graph.startDestination
                        launchSingleTop=true
                    }

                }
            )


        }
    }
}

@Composable
private fun MainScreenNavigation(navController:NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(Screen.Home.route){
            Home()
        }
        composable(Screen.Fav.route){
            Favorite()
        }
        composable(Screen.Profile.route){
            Profile()
        }
        composable(Screen.Cart.route){
            Cart()

        }
    }

}






