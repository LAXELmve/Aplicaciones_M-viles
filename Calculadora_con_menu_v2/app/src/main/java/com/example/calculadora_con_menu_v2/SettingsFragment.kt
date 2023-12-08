package com.example.calculadora_con_menu_v2

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SettingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var config : View = inflater.inflate(R.layout.fragment_settings, container, false)

        var selectColor : Spinner? = config.findViewById(R.id.spinner3)
        var selectForma : Spinner? = config.findViewById(R.id.spinner4)
        var selectSize : Spinner? = config.findViewById(R.id.spinner2)
        var selectFuente : Spinner? = config.findViewById(R.id.spinner)

        var colorArray : Array<String> = resources.getStringArray(R.array.Color)
        var formaArray : Array<String> = resources.getStringArray(R.array.Forma)
        var sizeArray : Array<String> = resources.getStringArray(R.array.Tamano)
        var fuenteArray : Array<String> = resources.getStringArray(R.array.Fuente)

        var btnG : Button? = config.findViewById(R.id.btnG1)
        val sharedPreferences = requireActivity().getSharedPreferences("preferencias", Activity.MODE_PRIVATE)

        selectSize?.setSelection(sizeArray.indexOf( sharedPreferences.getInt("tamanoletra",30).toString() ))
        selectFuente?.setSelection(fuenteArray.indexOf( sharedPreferences.getString("fuenteletra","sans-serif") ))
        selectColor?.setSelection(colorArray.indexOf( sharedPreferences.getString("colorbotones","original") ))
        selectForma?.setSelection(formaArray.indexOf( sharedPreferences.getString("formabotones","circulo") ))

        /*val allEntries = sharedPreferences.all

        for ((key, value) in allEntries) {
            Log.d("FragmentConfiguracion", "$key: $value")
        }*/

        btnG?.setOnClickListener {
            var tamanoletra = Integer.parseInt(selectSize?.selectedItem.toString())
            var fuenteletra = selectFuente?.selectedItem.toString()
            var colorbotones = selectColor?.selectedItem.toString()
            var formabotones = selectForma?.selectedItem.toString()

            val configuracion = Configuracion(tamanoletra, fuenteletra, colorbotones, formabotones)
            val sharedPreferences = requireActivity().getSharedPreferences("preferencias", Activity.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putInt("tamanoletra", configuracion.tamanoLetra)
            editor.putString("fuenteletra", configuracion.fuenteLetra)
            editor.putString("colorbotones", configuracion.colorBotones)
            editor.putString("formabotones", configuracion.formaBotones)
            editor.apply()

            Toast.makeText(requireContext(),"Guardado con éxito",Toast.LENGTH_LONG).show()
        }


        return config
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SettingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}