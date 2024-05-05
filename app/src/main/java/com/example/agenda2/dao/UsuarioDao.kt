package com.example.agenda2.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.agenda2.model.Usuario


@Dao

interface UsuarioDao {
    @Insert
    fun insert(listaUsuarios: MutableList<Usuario>)

}