/*
 Desarrollar una función que reciba una frase y devuelva un diccionario con las palabras que contiene
 y su longitud.
* */

fun calcularPalabras(frase: String):Map<String,Int>{
    var fraseCopia=frase.trim().split("\\s+".toRegex())
    var mapa:Map<String,Int> = fraseCopia.associate { Pair(it, it.length) }

    return mapa
}

