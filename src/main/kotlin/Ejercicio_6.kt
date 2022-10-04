/*
Desarrollar una función que reciba una muestra de números y devuelva los valores atípicos, es decir,
los valores cuya puntuación típica sea mayor que 3 o menor que -3.
Nota: La puntuación típica de un valor se obtiene restando la media y dividiendo por la desviación típica
de la muestra.
 */

fun valores_Atipicos(lista: MutableList<Double>): Unit { //MutableList<Double>
    var media = lista.average()
    var desviacionT: Double = 0.0

    for (item in lista) {
        desviacionT += Math.pow((item - media), 2.0)
    }
    desviacionT /= lista.size
    desviacionT = Math.sqrt(desviacionT) //Desviacion Tipica calculada

    var valores: MutableList<Double> = mutableListOf()

    for ((index, elemento) in lista.withIndex()) { // Calculando valores atipicos de cada elemento de la lista
        valores.add(index, (elemento - media) / desviacionT)
    }

    var valoresAtipicos: MutableList<Double> = mutableListOf()
    var index=0;
    for(elemento in valores){
        if (elemento > 3 || elemento<-3){
           valoresAtipicos.add(index,lista.get(valores.indexOf(elemento)))
            index++
            println("El elemento: ${lista.get(valores.indexOf(elemento))} tiene un valor atipico de -> $elemento")
        }
    }


    //return valores

}