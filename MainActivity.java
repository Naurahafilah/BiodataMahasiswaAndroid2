package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BiodataMahasiswa()
                }
            }
        }
    }
}

@Composable
fun BiodataMahasiswa() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        horizontalAlignment = Alignment.Start
    ) {

        Text(
            text = "BIODATA MAHASISWA",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Text(
            text = "Nama Lengkap : Syafira naura hafilah",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        Text(
            text = "NIM : 03081240058",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        Text(
            text = "Fakultas : Ilmu Komputer",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        Text(
            text = "Program Studi : Sistem Informasi",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        Text(
            text = "Konsentrasi : AI",
            fontSize = 20.sp
        )
    }
}
