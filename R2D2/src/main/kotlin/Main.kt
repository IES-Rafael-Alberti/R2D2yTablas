fun definirCoordenadas(pasos: IntArray): IntArray {
    var coordenadas = intArrayOf(0, 0)
    var direccionY = 1

    for (paso in pasos) {
        when {
            direccionY == 1 -> coordenadas[1] += paso  // Movimiento en el eje "y"
            else -> coordenadas[0] += paso  // Movimiento en el eje "x"
        }

        direccionY *= -1
    }

    return coordenadas
}

fun main() {
    print("Ingresa la secuencia de pasos separados por comas sin espacios: ")
    val input = readln()

    if (input.isNotBlank()) {
        val pasos = input.split(",").map { it.toInt()}.toIntArray()

        if (pasos.isNotEmpty()) {
            val coordenadasFinales = definirCoordenadas(pasos)
            println("Coordenadas actuales: (x: ${coordenadasFinales[0]}, y: ${coordenadasFinales[1]})")
        } else {
            println("Entrada no válida")
        }
    } else {
        println("Entrada vacía")
    }
}

