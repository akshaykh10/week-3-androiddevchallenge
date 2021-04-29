package com.example.bloom.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.bloom.R
import com.example.bloom.ui.theme.gray
import com.example.bloom.ui.theme.pink900
import com.example.bloom.ui.theme.white
import com.example.bloom.ui.theme.white850

@Composable
fun WelcomeScreen(onClick:()->Unit) {


    Surface(color = MaterialTheme.colors.primary) {

        //Create a background surface

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {

            /*background image*/
            if (!isSystemInDarkTheme()) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_light_welcome_bg),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            } else {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_dark_welcome_bg),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }


        Column(modifier = Modifier.fillMaxSize()) {

            /* illos image */
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Image(
                    painter = painterResource(id = if (!isSystemInDarkTheme()) R.drawable.ic_light_welcome_illos else R.drawable.ic_dark_welcome_illos),
                    contentScale = ContentScale.Fit,
                    contentDescription = null,
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(top = 72.dp, start = 88.dp)
                        .offset(44.dp)
                )
            }

            Spacer(modifier=Modifier.height(48.dp))


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier=Modifier.padding(start=16.dp,end=16.dp).fillMaxWidth()
            ) {

                /*Logo*/
                Image(
                    painter = painterResource(id = if (!isSystemInDarkTheme()) R.drawable.ic_light_logo else R.drawable.ic_dark_logo),
                    contentDescription = null,

                    )
                /*Tag Line*/
                Text(
                    text= stringResource(id = R.string.tag_line),
                    style =MaterialTheme.typography.subtitle1,
                    color=MaterialTheme.colors.onPrimary,
                    modifier=Modifier.padding(top=8.dp)
                )

                Spacer(modifier=Modifier.height(40.dp))

                /* Create Account button*/

                Button(
                    onClick = {  },
                    shape=MaterialTheme.shapes.medium,
                    modifier=Modifier.height(48.dp).fillMaxWidth(),
                    colors=ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.secondary,
                        contentColor =MaterialTheme.colors.onSecondary
                    ),
                    elevation=ButtonDefaults.elevation()
                ) {
                    Text(text= stringResource(id = R.string.Create_account),
                    style=MaterialTheme.typography.button)
                }

                Spacer(modifier=Modifier.height(32.dp))

                /*Login Button*/

                TextButton(onClick = onClick,) {
                    Text(
                        text= stringResource(id = R.string.log_in),
                        style=MaterialTheme.typography.button,
                        color=if(!isSystemInDarkTheme()) pink900 else white
                    )

                }


            }
        }
    }
}



