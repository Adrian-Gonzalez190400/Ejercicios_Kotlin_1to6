/*
Desarrollar una función reciba un diccionario con las asignaturas y las notas de un alumno
y devuelva otro diccionario con las asignaturas en mayúsculas y las calificaciones correspondientes
a las notas: 95-100(excelente), 85-94(Notable), 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).
* */

fun calcularCalif(alumno: MutableMap<String,Double>): MutableMap<String,String>{
    var copia: MutableMap<String,String> = mutableMapOf()

    alumno.forEach{
        entry -> copia.set(entry.key.uppercase(),"")
        when(entry.value){
            in 95.0 .. 100.0 -> copia[entry.key.uppercase()]="Excelente"
            in 85.0 .. 94.0 -> copia[entry.key.uppercase()]="Notable"
            in 75.0 .. 84.0 -> copia[entry.key.uppercase()]="Bueno"
            in 70.0 .. 74.0 -> copia[entry.key.uppercase()]="Suficiente"
            in 0.0..69.0 -> copia[entry.key.uppercase()]="Desempeño insuficiente"
        }
    }
    return copia
}