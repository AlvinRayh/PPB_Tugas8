package com.example.tugas8ppb

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import android.widget.Toast

@Composable
fun DogCard(dog: Dog) {
    var expanded by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { expanded = !expanded }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.Top) {
                Image(
                    painter = painterResource(id = dog.imageRes),
                    contentDescription = dog.name,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(50))
                )
                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(text = dog.name, fontSize = 20.sp)
                    Text(text = "${dog.age} years old", fontSize = 14.sp)
                }

                Icon(
                    imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = null
                )
            }

            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "About:", fontSize = 14.sp)
                Text(text = dog.about, fontSize = 14.sp)

                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Favorite Food:", fontSize = 14.sp)
                Text(text = dog.food, fontSize = 14.sp)

                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    onClick = {
                        Toast.makeText(context, "You adopted ${dog.name}!", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("Adopsi")
                }
            }
        }
    }
}