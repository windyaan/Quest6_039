package com.example.project.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.project.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel(){
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()
    fun setMatakuliah (mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy (  = mkPilihan) }
    }
    fun setKelas (kelasPilihan: String) {
        _krsState.update { stateKelas -> stateKelas.copy ( kelas = kelasPilihan) }
    }
}