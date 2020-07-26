package com.alkagame.kotlincurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tiposDeDatos()
        //sentenciasIf()
        //sentenciaWhenOrSwitch()
        //arrayOrArreglos()
        //mapsOrDiccionarios()
        //bucleForAndWhile()
        //nullSafetyOrExcepciones()
        //read(arrayOf())
        //funciones()
        //sayMyName("Yarod", 19)
        //println(sumTwoNumbers(12,12))
        //val resultado = sumTwoNumbers(12,sumTwoNumbers(12,1)) //el segundo valor llama
        // a otra funcion y esta al retornar un valor de tipo entero lo usara para la siguiente suma
        //println(resultado)
        clasesUObjetos()
    }

    private fun tiposDeDatos() {
        //char y string
        // un caracter y cadenas de texto

        val myString = "Este es un String"
        val myChar: Char = 'x' //el tipo de variable char se asigna con comillas simples
        val concatenar = "$myString y " + "un char: $myChar"
        println(concatenar)

        //Enteros
        //Byte 	    8 	-128 	127
        //Short 	16 	-32768 	32767
        //Int   	32 	-2,147,483,648 (-231) 	2,147,483,647 (231 - 1)
        //Long 	    64 	-9,223,372,036,854,775,808 (-263) 	9,223,372,036,854,775,807 (263 - 1)

        val myInt = 1
        val myShort = -32768
        val myByte = -128
        val myLong = 123466764532436452L// el tipo Long puede estar especificado con L
        val suma = myByte + myInt + myShort + myLong
        println("este es el resultado de sumar $myByte + $myInt + $myLong + $myShort = $suma")

        // Double and Floats
        // Type 	Size (bits) 	Significant bits 	Exponent bits 	Decimal digits
        //Float 	32 	24 	8 	<6-7>
        //Double 	64 	53 	11 	<15-16>

        val myFloat =
            13.123456789012345678901234567890f //los flotantes puden estar marcados con una F o f
        val myDouble = 13.1234567890123456789012345678901
        val flotantes = myFloat + myDouble
        println(flotantes)

        //Booleanos
        // this variables only have a unique state true or false
        //this data type only working with logic operations
        // ||   disyuncion
        // &&   conjuncion
        // !    negacion
        val myBool = true
        val myBool0 = false
        val sumaLogica = myBool && myBool0
        val multiplicacionLogica = myBool == myBool
        println("$sumaLogica and $multiplicacionLogica")

        //underscores
        //el uso de guion bajo facilita la lectura de datos al programar
        //en consola se ignoran los _
        //ejemplos
        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010
        println(oneMillion)

        //conversion de valores
        val value0: Byte = 8 //declaramos una variable de tipo byte
        val conInt =
            value0.toInt() //declaramos una segunda variable para hacer la converion con el metodo .to
        //Tipos de conversiones soportadas == overloading
        //toByte(): Byte
        //toShort(): Short
        //toInt(): Int
        //toLong(): Long
        //toFloat(): Float
        //toDouble(): Double
        //toChar(): Cha
        println(conInt)

        //Reglas Aritmeticas Kotlin
        // la divicion entre enteros siempre devolvera enteros

        val div = 5L / 2
        // println(div == 2.5) //hacer esto nos dara error pues no podemos comparar enteros con dobles
        println(div == 2L) //comparar numeros nos devolvera un valor booleano

        val div0 = 5.0f / 2.0
        println(div0 == 2.5)

        //tambien podemos usar el metodo .to para especificar el tipo de dato resultante
        val div1 = 5L / 2.toFloat()
        println(div1)

        val x = (1 shl 2) and 0x000FF000
        println(x)
    }

    private fun sentenciasIf() {
        //Operadores condicionales
        // < menor que
        // > mayor que
        // <= menor o igual que
        // > mayor o igual que
        // == igualdad
        // != desigualdad

        //Operadores Logicos
        // && = and
        // || = or
        // ! = not
        var myNumber: Int = 6
        if (!(myNumber <= 10 && myNumber > 5) || (myNumber == 54)) {
            println("$myNumber no es menor que o igual que 10 y mayor que 5 y en su defecto es 54")
        } else if (myNumber == 60) {
            println("el numero $myNumber es igual a 60")
        } else if (myNumber != 70) {
            println("el numero $myNumber no es igual a 70")
        } else {
            println("El numero $myNumber es mayor que 10, menor o igual que 5 y no es 54")
        }
    }

    private fun sentenciaWhenOrSwitch() {
        //sentencia when o switch

        val country = "Argentina"
        when (country) {
            "Mexico" -> {
                println("El idioma es Español Mexico")
            }
            "Colombia", "Argentina", "LATAM", "Vemezuela" -> {
                println("El idioma es Español Latinoamerica")
            }
            "España" -> {
                println("El idioma es Castellano")
            }
            "EE.UU" -> {
                println("the language is english")
            }
            "Francia" -> {
                println("la langue est le français")
            }
            else -> {
                println("No encontramos un idioma disponible")
            }
        }
        val age: Short = 0 //use short para reservar menos memoria
        if (age >= 0 && age <= 32765) {
            when (age) {
                in 0..3 -> {
                    println("you are a baby")
                }
                in 3..11 -> {
                    println("you are a kid")
                }
                in 12..14 -> {
                    println("eres un preadolecente")
                }
                in 15..17 -> {
                    println("Eres un adolecente")
                }
                in 18..69 -> {
                    println("Eres un adulto")
                }
                in 70..120 -> {
                    println("eres un anciano")
                }
                else -> {
                    println("edad no valida o eres polvo")
                }
            }
        } else if (age < 0) {
            println("La edad no puede ser negativa")
        }else {
            println("el dato introducido no es un numero o hay un error")
        }
    }
    //arreglo es una coleccion de valores con un identificador
    fun arrayOrArreglos() {
        val name = "Yarod Castillo"
        val surname = "Alkalifax"
        val company = "Alkagame"
        val age = "20"
        val mensaje = "Ten un excelente dia"
        // Creacion de un Array
        //declaramos una constante y le asignamos el valor de un array de tipo string
        //Puede ser una variable o una constante
        val myArray = arrayListOf<String>()
        //agregamos valores a nuestra variable de tipo array con el metodo .add
        // dandole el nombre de nuestras constantes ateriormente declaradas
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //Un array admite valores repetidos
        myArray.add(age)
        myArray.add(age)
        myArray.add(age)
        println(myArray)
        //podemos añadir un conjunto de datos ya que se trata de una lista
        //usaremos el metodo .addAll y listOf() donde introduciremos los datos separados por una ,
        myArray.addAll(listOf("Hola", "Esta", "Es una", "Lista"))
        println(myArray)


        //Acceso a datos de un Array
        //podemos imprimir el valor dentro un array proporcionandio el index del valor deseado
        println(myArray[0])
        // podemos igualar el valor de una variable o constante a la posicion de un dato en el array
        val myNameIs = myArray[0]
        println("Hola mi nombre es $myNameIs")

        //Modificar Datos
        //Podremos modificar datos en un Array atravez de su index en este
        myArray.add(mensaje)
        println(mensaje)
        myArray[11] = "Este es mi nuevo mensaje"
        println(myArray[11])

        //Eliminar datos de un array atravez de su index
        println(myArray)
        myArray.removeAt(11)
        println(myArray)

        //Recorrer datos
        //El metodo .forEach recorre el array y lo almacena en una variable temporal
        //de nombre it que toma cada uno de los valor del array
        myArray.forEach {
            println(it)
        }
        //Otras operaciones
        println("Este arreglo contiene: " + myArray.count() +" elementos")
        myArray.clear()
        println("Este arreglo contiene: " + myArray.count() +" elementos")
        //Llamara al primer y al ultimo elemento
        println(myArray.first())
        println(myArray.last())
        myArray.sort()
    }


    //MAPS o Diccionarios
    //Estructura o coleccion de datos no ordenada a la que se le asigna una key y un valor
    //la clave y el valor no tienen porque ser del mismo tipo de dato
    //sin embargo la todas las claves si tienen que ser del mismo tipo de dato al igual
    //que todos los valores tienen que ser del mismo tipo de dato
    //NO PUEDEN EXISTIR CLAVES REPETIDAS pero 2 claves distintas pueden tener el mismo valor

    fun mapsOrDiccionarios(){
        //Declaramos una constante o variable y la inicializamos como diccionario
        //con la palabra reservada Map dento de esta ecribiremos el valor tipo de
        //dato  con el que trabajara uno seguido del otro separado por una ,
        // el = mapOf() es para inicializarlo
        //el primer valor de map es la k y el segundo el valor
        var myMap: Map<String,Int> = mapOf()
        var myMapMutable : Map<String,String> = mutableMapOf()
        println(myMap)

        //Anadir datos
        //al usar mapOf eliminamos el mapa existente previamente inicializado y creamos uno nuevo
        //solo se puden cambiar datos 1 vez despues de inicializado
        myMap = mapOf("Yarod" to 1, "Abraxas" to 2, "Belfegor" to 3)
        println(myMap)
        //para añadir datos sin eliminar el mapa requerimos un mutableMapOf
        //este es mutable y se podra modificar la veces deseadas despues de inicializado

        myMapMutable = mutableMapOf("Yarod" to "name", "Luzbel" to "name" )
        println("Este es un mapa mutable $myMapMutable")
        //primera forma
        myMapMutable["Satan"] = "name"
        //segunda forma para añadir valores de uno en uno
        myMapMutable.put("Lucifer","name")
        println("Este es mi mapa mutable $myMapMutable")
        myMapMutable.forEach(){
            println(it)
        }
        //podemos asignar otro valor a la clave
        myMapMutable.put("Yarod","Demon")
        myMapMutable.put("Leviathan", "Demon")
        println(myMapMutable)

        //Acceso a Datos
        println(myMapMutable["Demon"])

        //Borrar Datos
        myMapMutable.put("Astaroth","demon")
        println(myMapMutable)
        myMapMutable.remove("Astaroth")
        println(myMapMutable)

    }
    private fun bucleForAndWhile(){
        //loops o bucles
        //recorrer estructuras de datos
        val myArray = listOf("Hola", "Esto", "Es", "Un","Array", "En", "Un", "Bucle")
        val myMap = mutableMapOf<String, Int>("Yarod" to 0, "Alka" to 1, "Alkagame" to 2)
        //Bucle for
        //Recorrer estructuras de datos
        for(myString in myArray){
            println(myString)

        }
        for(myElement in myMap){
            /*
            interpolamos es decir mostrar el valor de una variable en un texto usando $
            podemos mostrar solo el valor o solo la variable con .value y .key
            o podemos mostar todo el mapa
            */
            println("clave: ${myElement.key} - valor: ${myElement.value}")

        }
        for (x in 0..10){
            println(x)
            for(c in 0 until 10) {//until recorre el bucle sin tomar en cuenta el ultimo valor
                println(c)
                for (x in 0..100 step 2){// step cambia el +1 por el numero
                    println(x)
                }
            }
        }
        for (z in 100 downTo 0 step 9-1){//permite recorrer la seguencia en el orden inverso
            println(z)
        }
        val myArrayNum:IntRange = (0..20)
        for (z in myArrayNum){
            println("este es un arrary $z")
        }
        var t = 0

        while (t < 10){
            println("hola $t")
            t ++ //suma de uno en uno
            t += 2 //primero se suma luego se da el resultado
        }

    }
    private fun nullSafetyOrExcepciones(){
        //Seguridad contra nulos
        var myString = "Hola"
        // myString = null //esto es un error de compilacion
        println(myString)

        var mySafetyString: String? = "Hola"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Que hace?"
        //println(mySafetyString)
        //println(mySafetyString!!)

        if (mySafetyString != null){
          println(mySafetyString!!)
            mySafetyString = null
        }
        //Safe Calls
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run { println(mySafetyString) }


        var num:Int//con el ? definimos una variable nullable
        println("Ingrese un numero por favor: ")
        num = readLine()?.toInt() as Int
        //en caso de que la variable no sea de tipo nullable se requiere una conversion
        //con el uso de as
        println(num)
    }

    private fun read(arg: Array<String>) {
        var num: Int?
        print("Ingrese un numero: ")
        num = try {
            readLine()?.toInt()
        } catch (_: NumberFormatException) {
            null
        }
    }
    private fun funciones(){
        //Funciones
        //Escribe 3 veces hola
        var numHola: Int = 0
        while (numHola <= 3){
            println("Hola")
            numHola += 1
        }

    }
    //Funciones con parametros de entrada
    private fun sayMyName(name:String?, age:Int?){
        println("Hola mi nombre es $name y mi edad es $age años")
    }
    //Funciones con un valor de retorno
    fun sumTwoNumbers(num1:Int, num2:Int):Int{
        var resultado:Int = num1.plus(num2)
        println("la suma de los numeros $num1 y $num2 es $resultado")
        return resultado //retornar un valor nos sirve para poder almacenar ese valor en una variable fuera de la funcion
    }

    private fun clasesUObjetos(){
        val programador1 = programador("Yarod",19,'M', arrayOf(programador.language.Python,programador.language.Kotlin,programador.language.C11),null)
        println("Hola Joven Programador tu nombre es: ${programador1.name}")
        println("Tu edad actual es de ${programador1.age} auqnue estas proximo a cumplir ${programador1.age +1}" )
        programador1.age = 20

        val programador2 = programador("Eddie",19,'M', arrayOf(programador.language.R,programador.language.JavaScript),
            arrayOf(programador1))
        println("${programador2.friends?.first()?.name} es amigo de ${programador2.name}")
        println("Hola ${programador2.name} veo que conoces los siguientes lenguajes")
        programador2.code()

        println("Hola Edd soy yarod yo puedo programar en: ")
        programador1.code()


    }

}
