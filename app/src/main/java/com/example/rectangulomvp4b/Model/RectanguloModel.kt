package com.example.rectangulomvp4b.Model

import com.example.rectangulomvp4b.Contract.RectanguloContract

class RectanguloModel : RectanguloContract.RectanguloModel {
    override fun CalcularArea(base: Float, altura: Float): Float
    {
        val area = base * altura
        return area
    }

    override fun CalcularPerimetro(base: Float, altura: Float): Float
    {
        val perimetro = base + base + altura + altura
        return perimetro
    }

    override fun CalcularTipoRectangulo(base: Float, altura: Float): String
    {
        if (base == altura)
        {
            return "Cuadrado"
        }
        else
        {
            return "Rectangulo"
        }
    }

    override fun ValidarRectangulo(base: Float, altura: Float): Boolean
    {
        if (base > 0 && altura > 0)
        {
            return true
        }
        else
        {
            return false
        }
    }
}