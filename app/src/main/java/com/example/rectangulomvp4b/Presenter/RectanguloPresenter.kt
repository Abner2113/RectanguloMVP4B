package com.example.rectangulomvp4b.Presenter

import com.example.rectangulomvp4b.Contract.RectanguloContract
import com.example.rectangulomvp4b.Model.RectanguloModel

class RectanguloPresenter (private val vista : RectanguloContract.RectanguloView) : RectanguloContract.RectanguloPresenter
{
    private val modelo : RectanguloContract.RectanguloModel = RectanguloModel()

    override fun CalcularArea(base: Float, altura: Float)
    {
        if (modelo.ValidarRectangulo(base, altura))
        {
            val area = modelo.CalcularArea(base, altura)
            vista.ShowArea(area)
        }
        else
        {
            vista.ShowError()
        }
    }

    override fun CalcularPerimetro(base: Float, altura: Float)
    {
        if (modelo.ValidarRectangulo(base, altura))
        {
            val perimetro = modelo.CalcularPerimetro(base, altura)
            vista.ShowPerimetro(perimetro)
        }
        else
        {
            vista.ShowError()
        }
    }

    override fun CalcularTipoRectangulo(base: Float, altura: Float)
    {
        if (modelo.ValidarRectangulo(base, altura))
        {
            val tipoRectangulo = modelo.CalcularTipoRectangulo(base, altura)
            vista.ShowTipoRectangulo(tipoRectangulo)
        }
        else
        {
            vista.ShowError()
        }
    }

}