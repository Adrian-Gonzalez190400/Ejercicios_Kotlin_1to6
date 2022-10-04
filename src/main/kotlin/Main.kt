fun main(args: Array<String>) {

    /*EJERCICIO 1*/

    println("\n*****************RESULTADOS DEL EJERCICIO 1*****************")
    precioConDesc()

    println("\n\n************************************************************")
    println("\n*****************RESULTADOS DEL EJERCICIO 2*****************")
    resultadoFinal()

    println("\n\n************************************************************")
    println("\n*****************RESULTADOS DEL EJERCICIO 3*****************")

    val nombre:String=" Instituto Superior    Tecnologico del Sur de Guanajuato "

    var mapa=calcularPalabras(nombre)

   mapa.forEach{
       entry -> println("La palabra: ${entry.key} TIENE ${entry.value} caracteres")
   }

    var notas:MutableMap<String,Double> = mutableMapOf(
        "espanol" to 95.0, "matematicas" to 86.0, "ciencias" to 77.0, "actividad complementaria v" to 70.0,
        "prog. web" to 65.0)

    println("\n\n************************************************************")
    println("\n*****************RESULTADOS DEL EJERCICIO 4*****************")
    var notasFinal:MutableMap<String,String> = calcularCalif(notas)
    println(notasFinal.entries.joinToString {"${it.key}->${it.value}"})


    println("\n\n************************************************************")
    println("\n*****************RESULTADOS DEL EJERCICIO 5*****************")
    println(String.format("El modulo del vector es -> %.3f",moduloVector(2.0,5.0)))


    println("\n\n************************************************************")
    println("\n*****************RESULTADOS DEL EJERCICIO 6*****************")

    val numbers1: MutableList<Double> = arrayListOf(1.0,10000.0,3.2,4.3,5.4,6.5,7.6,8.7,9.8,10.9,11.0)
    val numbers2: MutableList<Double> = arrayListOf(10.0,20.2,15.3,30.4,31.5,35.6,40.7,45.8,50.9,55.0,-20000.0)

    valores_Atipicos(numbers1)
    valores_Atipicos(numbers2)


}