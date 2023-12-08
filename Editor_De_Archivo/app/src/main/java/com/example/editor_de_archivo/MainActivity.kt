package com.example.editor_de_archivo

import android.content.Context
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.Manifest
import android.app.Activity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class MainActivity : AppCompatActivity() {

    private var et1 : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.editTextTextMultiLine)

        if(existeArchivo(fileList(), "nota_app.txt")) {
            var contenido=""
            try {
                val archivo = InputStreamReader(openFileInput("nota_app.txt"))
                val bf = BufferedReader(archivo)
                var linea = bf.readLine()
                while (linea != null) {
                    contenido = contenido + linea + "\n"
                    linea = bf.readLine()
                }
            } catch(e:Exception){
                Log.e("Create","Error al leer archivo",e)
                Toast.makeText(this, "Hubo un error al leer el archivo", Toast.LENGTH_LONG).show()
            }
            et1?.setText(contenido)
        }
    }

    fun guardar(view: View) {
        try {
            val archivo = OutputStreamWriter(openFileOutput("nota_app.txt", Activity.MODE_PRIVATE))
            archivo.write(et1?.text.toString())
            archivo.flush()
            archivo.close()
        } catch(e:Exception){
            Log.e("Create","Error al guardar en archivo",e)
            Toast.makeText(this, "No fue posible guardar los cambios", Toast.LENGTH_LONG).show()
        }

        Toast.makeText(this, "El texto se guardó con éxito", Toast.LENGTH_SHORT).show()
    }

    fun existeArchivo(archivos : Array<String>, archivo : String):Boolean {
        archivos.forEach {
            if (archivo == it) {
                return true
            }
        }
        return false
    }
}