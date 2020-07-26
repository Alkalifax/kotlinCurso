package com.alkagame.kotlincurso

class programador(val name:String,
                  var age:Int,
                  var sexo:Char,
                  val languages:Array<language>,
                  val friends: Array<programador>? = null)
                //a una clase le podemos asignar esa misma clase
                //el parametro de una clase pude ser nullo al agregar un ?
                //si agregamos un = definimos un valor por defecto

{
    enum class language{ //enum permite limitar a cierto valores una clase
        Kotlin,
        Java,
        Switf,
        JavaScript,
        Python,
        C11,
        C,
        R,
        APRENDIZ


    }

    fun code(){
        for (x in languages){
            println("puedo programar en: $x")
        }
    }
}