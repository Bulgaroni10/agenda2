package com.example.agenda2.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.agenda2.dao.UsuarioDao

@Database(entities = [Usuario::class], version = 1)

 abstract class AppDataBase : RoomDatabase(){

     abstract fun usuarioDao(): UsuarioDao

     companion object{
         private const val DATABASE_NAME: String = "DB_Usuario"

         @Volatile
         private var INSTANCE: AppDataBase? + null

         fun getInstance(context: Context): AppDataBase {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
         }
     }
}