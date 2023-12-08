package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Exception
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    var pantalla:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pantalla=findViewById(R.id.pantalla1)
    }

    fun div(view : View) {
        var boton = view as Button
        var texto = quitarCeroStart(pantalla?.text.toString())
        if (texto == "") {
        } else {
            texto = texto + "/"
        }
        pantalla?.text = texto
    }

    fun sum(view : View) {
        var boton = view as Button
        var texto = quitarCeroStart(pantalla?.text.toString())
        if (texto == "") {
        } else {
            texto = texto + "+"
        }
        pantalla?.text = texto
    }

    fun res(view : View) {
        var boton = view as Button
        var texto = quitarCeroStart(pantalla?.text.toString())
        if (texto == "") {
        } else {
            texto = texto + "-"
        }
        pantalla?.text = texto
    }

    fun mul(view : View) {
        var boton = view as Button
        var texto = quitarCeroStart(pantalla?.text.toString())
        if (texto == "") {
        } else {
            texto = texto + "*"
        }
        pantalla?.text = texto
    }

    fun teclear(view : View) {
        var boton = view as Button
        var textoB = boton.text.toString()

        var texto = quitarCeroStart(pantalla?.text.toString())

        if (textoB == ".") {
            if (texto=="" || !Character.isDigit(texto.last())) {
                texto = texto + "0."
            } else {
                texto = texto + textoB
            }
        } else {
            texto = texto + textoB
        }

        if (textoB == "=") {
            if ((texto == "=")) {
                texto = ""
            }else {
                var resultado = 0.0
                try {
                    resultado=eval(pantalla?.text.toString())
                    val decimalFormat = DecimalFormat("#.###") // Define el formato deseado
                    val formattedValue = decimalFormat.format(resultado)
                    pantalla?.text=formattedValue.toString()
                } catch (e: Exception) {
                    pantalla?.text= "Error"
                }
            }
        } else {
            if (textoB == "C") {
                pantalla?.text=""
            } else {
                pantalla?.text= texto
            }
        }
    }

    fun borrar(view : View) {
        val texto = pantalla?.text.toString()

        if (texto.isNotEmpty()) {
            val texto = texto.substring(0, texto.length - 1)
            pantalla?.text = texto
        }
    }

    fun quitarCeroStart(str : String):String{
        if (str == "0") {
            var i=0
            while (i<str.length && str[i]=='0')i++
            val sb=StringBuffer(str)
            sb.replace(0,i,"")
            return sb.toString()
        } else {
            return str
        }
    }

    fun eval(str: String): Double {
        return object : Any() {
            var pos = -1
            var ch = 0
            fun nextChar() {
                ch = if (++pos < str.length) str[pos].toInt() else -1
            }

            fun eat(charToEat: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()
                if (ch == charToEat) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                return x
            }

            // Gramatica:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm() // addition
                    else if (eat('-'.toInt())) x -= parseTerm() // subtraction
                    else return x
                }
            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor() // multiplication
                    else if (eat('/'.toInt())) x /= parseFactor() // division
                    else return x
                }
            }

            fun parseFactor(): Double {
                if (eat('+'.toInt())) return parseFactor() // unary plus
                if (eat('-'.toInt())) return -parseFactor() // unary minus
                var x: Double
                val startPos = pos
                if (eat('('.toInt())) { // parentheses
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) { // numbers
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) { // functions
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    x = if (func == "sqrt") Math.sqrt(x) else if (func == "sin") Math.sin(Math.toRadians(x)) else if (func == "cos") Math.cos(Math.toRadians(x)) else if (func == "tan") Math.tan(Math.toRadians(x)) else throw RuntimeException("Unknown function: $func")
                } else {
                    throw RuntimeException("Unexpected: " + ch.toChar())
                }
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
                return x
            }
        }.parse()
    }

}