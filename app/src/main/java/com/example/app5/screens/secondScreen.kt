package com.example.app5.screens

import android.annotation.SuppressLint
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.app5.modelos.Producto
import com.example.app5.modelos.productos
import com.example.app5.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SecondScreen(navController: NavController){
    Scaffold(
        bottomBar = {
            BottomAppBar() {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = {
                        navController.navigate(route = AppScreens.FirstScreen.route)
                    }){
                        Text(text = "Regresar")
                    }
                    Button(onClick = {
                        navController.navigate(route = AppScreens.ThirdScreen.route)
                    }){
                        Text(text = "Siguiente")
                    }
                }
            }
        }
    ) {
        Cosas(productos)
    }
}



@Composable
fun Botones(navController: NavController){
    Row(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Button(onClick = {
            navController.navigate(route = AppScreens.FirstScreen.route)
        }){
            Text(text = "Regresar")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.ThirdScreen.route)
        }){
            Text(text = "Siguiente")
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SecBodyContent(navController: NavController){

}

@Composable
fun Vendemos(foto: Int, nombre: String, descripcion: String, precio: Int) {
    Surface(
    ) {
        Column(modifier = Modifier
            .border(2.dp, MaterialTheme.colors.primary)
            .fillMaxWidth()) {
            Row(modifier = Modifier.padding(5.dp)) {
                Image(
                    contentDescription = "sopas",
                    painter = painterResource(foto),
                    modifier = Modifier
                        .size(80.dp)
                        .height(80.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier = Modifier.padding(6.dp))
                var expandirTexto by remember{mutableStateOf(false)}

//                val colorFondo by animateColorAsState(
//                    if (expandirTexto) MaterialTheme.colors.error else MaterialTheme.colors.surface
//                )
                Column(modifier = Modifier.clickable { expandirTexto = !expandirTexto }){
                    Text(text = nombre, color = Color.Green)
                    Spacer(modifier = Modifier.padding(6.dp))
                    Text(text = descripcion, maxLines = if (expandirTexto) Int.MAX_VALUE else 1)
                    Text(text = "Precio: $precio")
                }
            }
        }
    }
}

@Composable
fun Cosas(datos : List<Producto>){
    LazyColumn(){
        items(datos) {
                vender -> Vendemos(vender.foto, vender.nombre, vender.descripcion, vender.precio)
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
//@Composable
//fun PreviewSec(){
//    App4Theme {
//        SecondScreen()
//    }
//}