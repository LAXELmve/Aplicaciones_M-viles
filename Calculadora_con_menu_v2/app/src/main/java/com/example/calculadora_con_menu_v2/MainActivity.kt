package com.example.calculadora_con_menu_v2

import android.app.Activity
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.calculadora_con_menu_v2.Configuracion

class MainActivity : AppCompatActivity() {
    lateinit var navegation : BottomNavigationView

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when (item.itemId){
            R.id.itemFragment1 -> {
                supportFragmentManager.commit {
                    replace<HomeFragment>(R.id.frameCont1)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.itemFragment2 -> {
                supportFragmentManager.commit {
                    replace<SettingsFragment>(R.id.frameCont1)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
        }

        false }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navegation = findViewById(R.id.navMenu1)
        navegation.setOnNavigationItemSelectedListener(mOnNavMenu)

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace<HomeFragment>(R.id.frameCont1)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
        }
        var tamanoletra = 30
        var fuenteletra = "sans-serif"
        var colorbotones = "original"
        var formabotones = "circulo"

        val configuracion = Configuracion(tamanoletra, fuenteletra, colorbotones, formabotones)
        val sharedPreferences = getSharedPreferences("preferencias", Activity.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt("tamanoletra", configuracion.tamanoLetra)
        editor.putString("fuenteletra", configuracion.fuenteLetra)
        editor.putString("colorbotones", configuracion.colorBotones)
        editor.putString("formabotones", configuracion.formaBotones)
        editor.apply()
    }

}