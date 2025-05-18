package com.example.app_vehiculos.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.app_vehiculos.R

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.aucas),
                contentDescription = "Logo de la app",
                modifier = Modifier.size(220.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "App Vehículos",
                style = MaterialTheme.typography.headlineMedium,
                color = Color(0xFF3B82F6)
            )
        }
    }
}