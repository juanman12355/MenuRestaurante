package com.example.app5.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.app5.R
import com.example.app5.modelos.Producto
import com.example.app5.modelos.productos
import com.example.app5.navigation.AppScreens
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FirstScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar {
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Inicio")
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Arrow Forward",
                        modifier = Modifier.clickable {
                            navController.navigate(route = AppScreens.SecondScreen.route)
                        }
                    )
                }
            }
        }
    ) {
        BodyContent(navController)
    }
}



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BodyContent(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter =  painterResource(R.drawable.r1),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(1500.dp)
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Los pollos hermanos", fontSize = 30.sp, fontFamily = FontFamily.Serif, color = Color.Black)
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route)
        }){
            Text(text = "Ver menú")
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Composable
//fun PreviewPrin(){
//    App4Theme {
//        FirstScreen()
//    }
//}