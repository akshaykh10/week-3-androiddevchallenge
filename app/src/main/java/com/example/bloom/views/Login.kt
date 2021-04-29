package com.example.bloom.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.bloom.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle

@Composable
fun LoginScreen(onClick:()->Unit)
{
    var email by remember{ mutableStateOf("") }

    var password by remember{ mutableStateOf("")}

    Surface(
        modifier= Modifier.fillMaxSize(),
        color= MaterialTheme.colors.background
    ){
        Column(
            modifier=Modifier.fillMaxSize()
                .padding(start=16.dp,end=16.dp)

        ){

            /* Login with email text*/

           Column(modifier=Modifier.fillMaxWidth().height(184.dp),
               verticalArrangement = Arrangement.Bottom,
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
               Text(
                   text= stringResource(id = R.string.Log_in_with_email),
                   style=MaterialTheme.typography.h1,
                   color=MaterialTheme.colors.onBackground
               )


           }

            Spacer(modifier=Modifier.height(16.dp))

            /*Email text field  */

            OutlinedTextField(
                value = email,
                onValueChange = { email=it },
                modifier=Modifier.height(64.dp)
                    .fillMaxWidth()
                    .clip(MaterialTheme.shapes.small),
                placeholder = {
                    Text(
                        text= stringResource(id = R.string.Email_address),
                        style=MaterialTheme.typography.body1,
                        color=MaterialTheme.colors.onBackground
                    )
                },
                colors=TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.onBackground,
                    unfocusedBorderColor =MaterialTheme.colors.onBackground
                )
            )

            Spacer(modifier=Modifier.height(8.dp))

            /* Password text field*/

            OutlinedTextField(
                value = password,
                onValueChange = { password=it },
                modifier=Modifier.height(64.dp)
                    .fillMaxWidth()
                    .clip(MaterialTheme.shapes.small),
                placeholder = {
                    Text(
                        text= stringResource(id = R.string.Password),
                        style=MaterialTheme.typography.body1,
                        color=MaterialTheme.colors.onBackground
                    )
                },
                colors=TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = MaterialTheme.colors.onBackground,
                    unfocusedBorderColor =MaterialTheme.colors.onBackground
                )
            )

            /* Terms and Conditions*/

            Text(
                text = with(AnnotatedString.Builder("By clicking below, you agree to our ")) {
                    pushStyle(SpanStyle(textDecoration = TextDecoration.Underline))
                    append("Terms of Use")
                    pop()
                    append(" and consent to our ")
                    pushStyle(SpanStyle(textDecoration = TextDecoration.Underline))
                    append("Privacy Policy.")
                    toAnnotatedString()
                },
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(
                    bottom = 16.dp,
                    top = 24.dp
                ),
                textAlign = TextAlign.Center,
            )

            /*Log in Button*/

            Button(
                onClick = onClick,
                modifier=Modifier.height(48.dp).fillMaxWidth(),
                shape=MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary,
                    contentColor = MaterialTheme.colors.onSecondary
                )
            ) {
                Text(
                    text= stringResource(id = R.string.Log_in),
                    style=MaterialTheme.typography.button
                )

            }








        }


    }



}


