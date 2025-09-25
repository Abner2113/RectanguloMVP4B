package com.example.rectangulomvp4b.Contract

interface RectanguloContract
{
    interface RectanguloView
    {
        fun ShowArea(area : Float)
        fun ShowPerimetro(perimetro : Float)
        fun ShowTipoRectangulo(tipo : String)
        fun ShowError()
    }
    interface RectanguloModel
    {
        fun CalcularArea(base : Float, altura : Float) : Float
        fun CalcularPerimetro(base : Float, altura : Float) : Float
        fun CalcularTipoRectangulo(base : Float, altura : Float) : String
        fun ValidarRectangulo(base : Float, altura : Float) : Boolean
    }
    interface RectanguloPresenter
    {
        fun CalcularArea(base : Float, altura : Float)
        fun CalcularPerimetro(base : Float, altura : Float)
        fun CalcularTipoRectangulo(base : Float, altura : Float)
    }
}