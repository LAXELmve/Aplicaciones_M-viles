package com.example.calculadora_con_menu_v2

import android.app.Activity
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import java.lang.Exception
import java.text.DecimalFormat

//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    var pantalla : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Inflate the layout for this fragment
        var hogar : View = inflater.inflate(R.layout.fragment_home, container, false)

        pantalla = hogar.findViewById(R.id.pantalla)

        var btn0 : Button? = hogar?.findViewById(R.id.button0)
        btn0?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button0)
            var textoB = boton?.text.toString()

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

        var btn1 : Button? = hogar?.findViewById(R.id.button1)
        btn1?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button1)
            var textoB = boton?.text.toString()

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

        var btn2 : Button? = hogar?.findViewById(R.id.button2)
        btn2?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button2)
            var textoB = boton?.text.toString()

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

        var btn3 : Button? = hogar?.findViewById(R.id.button3)
        btn3?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button3)
            var textoB = boton?.text.toString()

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

        var btn4 : Button? = hogar?.findViewById(R.id.button4)
        btn4?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button4)
            var textoB = boton?.text.toString()

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

        var btn5 : Button? = hogar?.findViewById(R.id.button5)
        btn5?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button5)
            var textoB = boton?.text.toString()

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

        var btn6 : Button? = hogar?.findViewById(R.id.button6)
        btn6?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button6)
            var textoB = boton?.text.toString()

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

        var btn7 : Button? = hogar?.findViewById(R.id.button7)
        btn7?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button7)
            var textoB = boton?.text.toString()

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

        var btn8 : Button? = hogar?.findViewById(R.id.button8)
        btn8?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button8)
            var textoB = boton?.text.toString()

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

        var btn9 : Button? = hogar?.findViewById(R.id.button9)
        btn9?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button9)
            var textoB = boton?.text.toString()

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

        var btn000 : Button? = hogar?.findViewById(R.id.button000)
        btn000?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button000)
            var textoB = boton?.text.toString()

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

        var btn111 : Button? = hogar?.findViewById(R.id.button111)
        btn111?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button111)
            var textoB = boton?.text.toString()

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

        var btn99 : Button? = hogar?.findViewById(R.id.button99)
        btn99?.setOnClickListener {
            var boton = view?.findViewById<Button>(R.id.button99)
            var textoB = boton?.text.toString()

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

        var btn14 : Button? = hogar?.findViewById(R.id.button14)
        btn14?.setOnClickListener {
            var texto = quitarCeroStart(pantalla?.text.toString())
            if (texto == "") {
            } else {
                texto = texto + "+"
            }
            pantalla?.text = texto
        }

        var btn13 : Button? = hogar?.findViewById(R.id.button13)
        btn13?.setOnClickListener {
            var texto = quitarCeroStart(pantalla?.text.toString())
            if (texto == "") {
            } else {
                texto = texto + "-"
            }
            pantalla?.text = texto
        }

        var btn12 : Button? = hogar?.findViewById(R.id.button12)
        btn12?.setOnClickListener {
            var texto = quitarCeroStart(pantalla?.text.toString())
            if (texto == "") {
            } else {
                texto = texto + "*"
            }
            pantalla?.text = texto
        }

        var btn11 : Button? = hogar?.findViewById(R.id.button11)
        btn11?.setOnClickListener {
            var texto = quitarCeroStart(pantalla?.text.toString())
            if (texto == "") {
            } else {
                texto = texto + "/"
            }
            pantalla?.text = texto
        }

        var btnDel : ImageButton? = hogar?.findViewById(R.id.imageButton)
        btnDel?.setOnClickListener {
            val texto = pantalla?.text.toString()

            if (texto.isNotEmpty()) {
                val texto = texto.substring(0, texto.length - 1)
                pantalla?.text = texto
            }
        }

        val colorDelOrig = ContextCompat.getColor(requireContext(),R.color.delete_c)
        val colorDelAlt = ContextCompat.getColor(requireContext(),R.color.delete_c_alt)

        val colorNumOrig = ContextCompat.getColor(requireContext(),R.color.number_c)
        val colorNumAlt = ContextCompat.getColor(requireContext(),R.color.number_c_alt)

        val colorOpOrig = ContextCompat.getColor(requireContext(),R.color.op_c)
        val colorOpAlt = ContextCompat.getColor(requireContext(),R.color.op_c_alt)

        val colorEq = ContextCompat.getColor(requireContext(),R.color.eq_c)

        val sharedPreferences = requireActivity().getSharedPreferences("preferencias", Activity.MODE_PRIVATE)

        if (sharedPreferences.getString("formabotones","circulo") == "circulo") { //curculo
            if (sharedPreferences.getString("colorbotones","original") == "original") { //original
                btn000?.setTextColor(colorDelOrig)
                btn000?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn0?.setTextColor(colorNumOrig)
                btn0?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn1?.setTextColor(colorNumOrig)
                btn1?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn2?.setTextColor(colorNumOrig)
                btn2?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn3?.setTextColor(colorNumOrig)
                btn3?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn4?.setTextColor(colorNumOrig)
                btn4?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn5?.setTextColor(colorNumOrig)
                btn5?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn6?.setTextColor(colorNumOrig)
                btn6?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn7?.setTextColor(colorNumOrig)
                btn7?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn8?.setTextColor(colorNumOrig)
                btn8?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn9?.setTextColor(colorNumOrig)
                btn9?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn111?.setTextColor(colorNumOrig)
                btn111?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn11?.setTextColor(colorOpOrig)
                btn11?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn12?.setTextColor(colorOpOrig)
                btn12?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn13?.setTextColor(colorOpOrig)
                btn13?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn14?.setTextColor(colorOpOrig)
                btn14?.setBackgroundResource(R.drawable.custom_button_round_1)
                btn99?.setTextColor(colorEq)
                btn99?.setBackgroundResource(R.drawable.custom_button_round_2)
            } else { // alternativo
                btn000?.setTextColor(colorDelAlt)
                btn000?.setBackgroundResource(R.drawable.custom_button_round_4_alt)
                btn0?.setTextColor(colorNumAlt)
                btn0?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn1?.setTextColor(colorNumAlt)
                btn1?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn2?.setTextColor(colorNumAlt)
                btn2?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn3?.setTextColor(colorNumAlt)
                btn3?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn4?.setTextColor(colorNumAlt)
                btn4?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn5?.setTextColor(colorNumAlt)
                btn5?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn6?.setTextColor(colorNumAlt)
                btn6?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn7?.setTextColor(colorNumAlt)
                btn7?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn8?.setTextColor(colorNumAlt)
                btn8?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn9?.setTextColor(colorNumAlt)
                btn9?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn111?.setTextColor(colorNumAlt)
                btn111?.setBackgroundResource(R.drawable.custom_button_round_1_alt)
                btn11?.setTextColor(colorOpAlt)
                btn11?.setBackgroundResource(R.drawable.custom_button_round_3_alt)
                btn12?.setTextColor(colorOpAlt)
                btn12?.setBackgroundResource(R.drawable.custom_button_round_3_alt)
                btn13?.setTextColor(colorOpAlt)
                btn13?.setBackgroundResource(R.drawable.custom_button_round_3_alt)
                btn14?.setTextColor(colorOpAlt)
                btn14?.setBackgroundResource(R.drawable.custom_button_round_3_alt)
                btn99?.setTextColor(colorEq)
                btn99?.setBackgroundResource(R.drawable.custom_button_round_2_alt)
            }
        } else { // cuadrado
            if (sharedPreferences.getString("colorbotones","original") == "original") { //original
                btn000?.setTextColor(colorDelOrig)
                btn000?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn0?.setTextColor(colorNumOrig)
                btn0?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn1?.setTextColor(colorNumOrig)
                btn1?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn2?.setTextColor(colorNumOrig)
                btn2?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn3?.setTextColor(colorNumOrig)
                btn3?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn4?.setTextColor(colorNumOrig)
                btn4?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn5?.setTextColor(colorNumOrig)
                btn5?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn6?.setTextColor(colorNumOrig)
                btn6?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn7?.setTextColor(colorNumOrig)
                btn7?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn8?.setTextColor(colorNumOrig)
                btn8?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn9?.setTextColor(colorNumOrig)
                btn9?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn111?.setTextColor(colorNumOrig)
                btn111?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn11?.setTextColor(colorOpOrig)
                btn11?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn12?.setTextColor(colorOpOrig)
                btn12?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn13?.setTextColor(colorOpOrig)
                btn13?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn14?.setTextColor(colorOpOrig)
                btn14?.setBackgroundResource(R.drawable.custom_button_square_1)
                btn99?.setTextColor(colorEq)
                btn99?.setBackgroundResource(R.drawable.custom_button_square_2)
            } else { // aternativo
                btn000?.setTextColor(colorDelAlt)
                btn000?.setBackgroundResource(R.drawable.custom_button_square_4_alt)
                btn0?.setTextColor(colorNumAlt)
                btn0?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn1?.setTextColor(colorNumAlt)
                btn1?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn2?.setTextColor(colorNumAlt)
                btn2?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn3?.setTextColor(colorNumAlt)
                btn3?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn4?.setTextColor(colorNumAlt)
                btn4?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn5?.setTextColor(colorNumAlt)
                btn5?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn6?.setTextColor(colorNumAlt)
                btn6?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn7?.setTextColor(colorNumAlt)
                btn7?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn8?.setTextColor(colorNumAlt)
                btn8?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn9?.setTextColor(colorNumAlt)
                btn9?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn111?.setTextColor(colorNumAlt)
                btn111?.setBackgroundResource(R.drawable.custom_button_square_1_alt)
                btn11?.setTextColor(colorOpAlt)
                btn11?.setBackgroundResource(R.drawable.custom_button_square_3_alt)
                btn12?.setTextColor(colorOpAlt)
                btn12?.setBackgroundResource(R.drawable.custom_button_square_3_alt)
                btn13?.setTextColor(colorOpAlt)
                btn13?.setBackgroundResource(R.drawable.custom_button_square_3_alt)
                btn14?.setTextColor(colorOpAlt)
                btn14?.setBackgroundResource(R.drawable.custom_button_square_3_alt)
                btn99?.setTextColor(colorEq)
                btn99?.setBackgroundResource(R.drawable.custom_button_square_2_alt)
            }
        }

        val tamano : Int = sharedPreferences.getInt("tamanoletra",30)
        val fuente = sharedPreferences.getString("fuenteletra", "sans-serif")
        var face : Typeface = Typeface.SANS_SERIF

        if (fuente == "sans-serif") {
            face = Typeface.SANS_SERIF
        } else {
            if (fuente == "monospace") {
                face = Typeface.MONOSPACE
            }else {
                face = Typeface.create("casual", Typeface.NORMAL)
            }
        }

        val layout = hogar.findViewById<TableLayout>(R.id.tableLayout)

        pantalla?.setTypeface(face)
        pantalla?.setTextSize(tamano.toFloat())

        for (i in 0 until layout.childCount) {
            val vista = layout.getChildAt(i)

            if (vista is TableRow) {
                for (o in 0 until vista.childCount) {
                    val vistaA = vista.getChildAt(o)

                    if (vistaA is LinearLayout) {
                        val vistaB = vistaA.getChildAt(0)

                        if (vistaB is Button) {
                            vistaB.setTextSize(tamano.toFloat())
                            vistaB.setTypeface(face)
                        }

                    }

                    if (vistaA is Button) {
                        vistaA.setTextSize(tamano.toFloat())
                        vistaA.setTypeface(face)
                    }

                }
            }

        }

        return hogar
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



    companion object {

        const val ARG_PARAM1 = "param1"
        const val ARG_PARAM2 = "param2"

        @JvmStatic
        fun newInstance(param1: String, param2: String) = HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}