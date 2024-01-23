import kotlin.time.TimeMark

fun main() {
    val horas = Tiempo(12,30,15)
    println(horas)

    var hora:Int = 0
    var minutos:Int = 0
    var segundos:Int = 0

    print("Introduzca la hora, minutos y segundo:")
    try {
        hora = readln().toInt()
        minutos = readln().toInt()
        segundos = readln().toInt()
        if (hora > 24){
            throw Exception("la hora tiene no puede ser mayor que 24")
        }
    } catch (e: NumberFormatException){
        println("ERROR, tienen que ser numeros enteros")
    }
    catch (e: Exception){
        println(e.message)
    }


    val tiempo = Tiempo(hora)
    println(tiempo)

    val tiempo2 = Tiempo(hora, minutos)
    println(tiempo2)

    val tiempo3 = Tiempo(hora, minutos, segundos)
    println(tiempo3)
    //Dependiendo de el parametro que meta estaria bien que se escogiera cada constructor
}