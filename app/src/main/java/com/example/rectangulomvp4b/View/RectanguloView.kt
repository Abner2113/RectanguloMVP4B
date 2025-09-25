package com.example.rectangulomvp4b.View

import com.example.rectangulomvp4b.Contract.RectanguloContract

class RectanguloView : RectanguloContract.RectanguloView
{
    private lateinit var presenter : RectanguloContract.RectanguloPresenter

    fun setPresenter(presentador : RectanguloContract.RectanguloPresenter)
    {
        presenter = presentador
    }

    fun inicio()
    {
        println("--- Calculadora de Rectangulos ---")
        println("Captura la base...")
        val base = readln().toFloat()
        println("Captura el altura...")
        val altura = readln().toFloat()
        presenter.CalcularTipoRectangulo(base, altura)
        println("... Menu de opcciones ...")
        println("[1] Calcular Area...")
        println("[2] Calcular Perimetro...")
        println("[3] Salir")
        val op : String = readln().toString()

        when (op)
        {
            "1"-> presenter.CalcularArea(base, altura)
            "2"-> presenter.CalcularPerimetro(base, altura)
            "3"-> return
        }
    }

    override fun ShowArea(area: Float)
    {
        println("El area del Rectangulo es: ${area} m^2")
    }

    override fun ShowPerimetro(perimetro: Float) {
        println("El perimetro del rectangulo es: ${perimetro}")
    }

    override fun ShowTipoRectangulo(tipo: String) {
        println("Es un: ${tipo}")
    }

    override fun ShowError() {
        println("Los datos capturados no forman un rectangulo...")
    }
}