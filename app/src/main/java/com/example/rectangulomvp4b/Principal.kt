package com.example.rectangulomvp4b

import com.example.rectangulomvp4b.Presenter.RectanguloPresenter
import com.example.rectangulomvp4b.View.RectanguloView

fun main()
{
    var objeto = RectanguloView()
    var presentador = RectanguloPresenter(objeto)
    objeto.setPresenter(presentador)
    objeto.inicio()
}