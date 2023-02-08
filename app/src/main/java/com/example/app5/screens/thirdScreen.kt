package com.example.app5.screens


import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.app5.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ThirdScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow Back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Pagos")
                }
            }
    ){
        ThiBodyContent(navController)
    }
}

@Composable
fun ThiBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Factura de pago", fontSize = 50.sp)
    }
}