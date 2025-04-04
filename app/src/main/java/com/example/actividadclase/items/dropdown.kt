package com.example.actividadclase.items

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun dropdown(){
    var expandedColor by remember { mutableStateOf(false) }
    var expandedTypography by remember { mutableStateOf(false) }

    var selectedColor by remember { mutableStateOf(Color.Black) }
    var selectedFont by remember { mutableStateOf(FontFamily.Default) }

    var selectedColorName by remember { mutableStateOf("Negro") }
    var selectedFontName by remember { mutableStateOf("Default") }

    var textStyle by remember {
        mutableStateOf(TextStyle(color = selectedColor, fontFamily = selectedFont, fontSize = 24.sp))
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Colores")
                Button(onClick = { expandedColor = !expandedColor }) {
                    Text(selectedColorName)
                }
                DropdownMenu(
                    expanded = expandedColor,
                    onDismissRequest = { expandedColor = false }
                ) {
                    DropdownMenuItem(text = { Text("Negro") }, onClick = {
                        selectedColorName = "Negro"
                        selectedColor = Color.Black
                        expandedColor = false
                    })
                    DropdownMenuItem(text = { Text("Rojo") }, onClick = {
                        selectedColorName = "Rojo"
                        selectedColor = Color.Red
                        expandedColor = false
                    })
                    DropdownMenuItem(text = { Text("Azul") }, onClick = {
                        selectedColorName = "Azul"
                        selectedColor = Color.Blue
                        expandedColor = false
                    })
                    DropdownMenuItem(text = { Text("Verde") }, onClick = {
                        selectedColorName = "Verde"
                        selectedColor = Color.Green
                        expandedColor = false
                    })
                    DropdownMenuItem(text = { Text("Cyan") }, onClick = {
                        selectedColorName = "Cyan"
                        selectedColor = Color.Cyan
                        expandedColor = false
                    })
                }
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Tipografías")
                Button(onClick = { expandedTypography = !expandedTypography }) {
                    Text(selectedFontName)
                }
                DropdownMenu(
                    expanded = expandedTypography,
                    onDismissRequest = { expandedTypography = false }
                ) {
                    DropdownMenuItem(text = { Text("Default") }, onClick = {
                        selectedFontName = "Default"
                        selectedFont = FontFamily.Default
                        expandedTypography = false
                    })
                    DropdownMenuItem(text = { Text("Serif") }, onClick = {
                        selectedFontName = "Serif"
                        selectedFont = FontFamily.Serif
                        expandedTypography = false
                    })
                    DropdownMenuItem(text = { Text("Sans-serif") }, onClick = {
                        selectedFontName = "Sans-serif"
                        selectedFont = FontFamily.SansSerif
                        expandedTypography = false
                    })
                    DropdownMenuItem(text = { Text("Monospace") }, onClick = {
                        selectedFontName = "Monospace"
                        selectedFont = FontFamily.Monospace
                        expandedTypography = false
                    })
                    DropdownMenuItem(text = { Text("Cursive") }, onClick = {
                        selectedFontName = "Cursive"
                        selectedFont = FontFamily.Cursive
                        expandedTypography = false
                    })
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = {
            textStyle = TextStyle(
                color = selectedColor,
                fontFamily = selectedFont,
                fontSize = 24.sp
            )
        }) {
            Text("Aplicar estilo")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Texto de ejemplo", style = textStyle)
    }

}

