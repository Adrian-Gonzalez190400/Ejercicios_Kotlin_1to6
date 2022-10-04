/*
Desarrollar una función que reciba otra función y una lista, y devuelva otra lista con el
resultado de aplicar la función dada a cada uno de los elementos de la lista.
* */

fun calcularCubo(funcion:(Double)->Double, lista: MutableList<Double>):List<Double>{
    var resultados = mutableListOf<Double>()
    for (i in lista){
        resultados.add(funcion(i))
    }
    return resultados
}

fun cubo(num:Double):Double{
    return Math.pow(num, 3.0)
}

var numeros= mutableListOf<Double>(2.0,3.0,4.0,5.0,10.0,50.0)

fun resultadoFinal():Unit{
    println("El cubo de los numeros ${numeros.toString()} son\n${calcularCubo(::cubo,numeros).toString()}")
}



