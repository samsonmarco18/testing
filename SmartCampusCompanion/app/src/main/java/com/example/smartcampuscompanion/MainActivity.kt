package com.example.smartcampuscompanion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.smartcampuscompanion.ui.theme.SmartCampusCompanionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartCampusCompanionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var statusText by remember { mutableStateOf("Welcome to Smart Campus") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Smart Campus Companion",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = statusText,
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { statusText = "Viewing Campus Map" },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Campus Map")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = { statusText = "Checking Class Schedule" },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Class Schedule")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = { statusText = "Viewing Announcements" },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Announcements")
        }
    }
}
