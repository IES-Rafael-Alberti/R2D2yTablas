/**
 * Solicita un número entero en un rango.
 *
 * @param min Int - valor mínimo
 * @param max Int - valor máximo
 *
 * @return Int - número entero válido dentro del rango especificado
 */
fun pedirNumeroEnRango(minimo: Int, maximo: Int): Int {
    var numero: Int
    do {
        print("Introduce un número entre $minimo y $maximo: ")
        numero = readln().toInt()
    } while (numero !in minimo..maximo)
    return numero
}

/**
 * Realiza una pregunta para contestar con s/si ó n/no
 *
 * @param text String - Texto de la pregunta
 *
 * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
 */
fun pregunta(text: String): Boolean {
    var respuesta: String
    do {
        print("$text (s/n): ")
        respuesta = readln().toLowerCase()
    } while (respuesta != "s" && respuesta != "n")
    return respuesta == "s"
}

fun main() {
    do {
        val numero = pedirNumeroEnRango(1, 100)
        val tablaMultiplicar = Array(10) { i -> (i + 1) * numero }

        println("Tabla de multiplicar del $numero:")
        for (i in 1..10) {
            println("$i -> ${numero} x $i = ${tablaMultiplicar[i - 1]}")
        }

    } while (pregunta("¿Desea generar otra tabla de multiplicación?"))
}
