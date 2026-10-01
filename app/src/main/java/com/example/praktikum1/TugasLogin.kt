package com.example.praktikum1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    val latar = painterResource(id = R.drawable.bg_barak)
    val logo = painterResource(id = R.drawable.logo_umy)
    val foto = painterResource(id = R.drawable.tni)

    Box(modifier = modifier.fillMaxSize()) {
        // Gambar latar
        Image(
            painter = latar,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Judul
            Text(
                text = "Login",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(40.dp))

            // Logo
            Image(
                painter = foto,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(320.dp)
                    .clip(CircleShape)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape)
                    .background(color = Color(0xFFE8E8F4))
            )

            Spacer(modifier = Modifier.height(70.dp))

            // Identitas
            Text(
                text = "Nama",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )
            Text(
                text = "Aurelia Citra Pangukir",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Text(
                text = "20240140240",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Foto bulat dengan border putih
            Image(
                painter = foto,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(320.dp)
                    .clip(CircleShape)
                    .border(width = 4.dp, color = Color.White, shape = CircleShape)
                    .background(color = Color(0xFFE8E8F4))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TugasLoginPreview() {
    TugasLogin()
}