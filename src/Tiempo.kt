

//Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando los tres atributos, sólo hora y minuto o sólo la hora (si no se indica, el valor de minuto o segundo será 0).

class Tiempo(
    val hora:Int,
    val minuto:Int,
    val segundo:Int
)
{
    //Constructor secundario por si se quiere instaciar un objeto con solo la hora y los minutos, pondremos por defecto que los segundos son 0
    constructor( hora: Int, minuto: Int) : this(hora,minuto, 0)

    //Constructor secundario por si se quiere instaciar un objeto con solo la hora , pondremos por defecto que los segundos y los minutos son 0
    constructor( hora: Int) : this(hora,0, 0)

    override fun toString(): String {
        return ("La hora es: $hora:$minuto:$segundo")
    }

    fun ajustarHora(){
        if (segundo > 60){

        }
    }
//No se como hacer el resto del tiempo
}


