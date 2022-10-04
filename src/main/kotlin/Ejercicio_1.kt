
 /*
 Desarrollar una función que aplique un descuento a un precio y otra que aplique el IVA a un precio.
 Escribir una tercera función que reciba un diccionario con los precios y porcentajes de una cesta de la compra,
 y una de las funciones anteriores, y utilice la función pasada para aplicar los descuentos o el IVA a los
 productos de la cesta y devolver el precio final de la cesta.
 * */

    var precioNormal=0.0

    fun descuento(precio: Double, descuento:Double):Double{
       return precio.let {  precio-(precio*(descuento/100))}
    }

    fun iva(precio: Double, desc:Double):Double{
        return precio.let { precio+(precio*desc/100) }
    }

    fun precio_Canasta(canasta: Map<Double,Double>, operacion: (Double,Double)-> Double): Double{
        var total=0.0
        /*for ((precio,descuento) in canasta){
            total+=operacion(precio, descuento)
        }*/

        canasta.forEach{
            entry -> total+=operacion(entry.key,entry.value)
        }
        return total
    }

    fun costoNormal(canasta: Map<Double,Double>): Double{
        canasta.forEach{
            entry -> precioNormal+=entry.key
        }
        return precioNormal
    }

    fun precioConDesc():Unit{

        var canasta: Map<Double,Double> = mapOf(Pair(780.0,16.0), Pair(150.0,16.0),Pair(785.0,16.0),Pair(1785.0,16.0))

        return println("El precio normal de los productos de la canasta es de: ${costoNormal(canasta)}\n" +
                "El precio de los productos aplicando descuento es de: ${precio_Canasta(canasta,::descuento)}\n" +
                "El precio de los productos aplicando iva es de: ${precio_Canasta(canasta,::iva)}")
    }

