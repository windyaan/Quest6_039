package com.example.project.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project.model.ListGender
import com.example.project.ui.view.DetailMahasiswaView
import com.example.project.ui.view.FormMahasiswaView
import com.example.project.ui.view.screen.MahasiswaFormView
import com.example.project.ui.view.viewmodel.MahasiswaViewModel
import com.example.project.ui.viewmodel.MahasiswaViewModel

enum class Halaman {
    Form,
    Data
}

