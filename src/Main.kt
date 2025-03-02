import kotlin.random.Random

fun main() {

    //Representante del municipio

    var votosInt1 = 0
    var votosInt2 = 0
    var votosInt3 = 0
    var votosRad1 = 0
    var votosRad2 = 0
    var votosRad3 = 0
    var votosTv1 = 0
    var votosTv2 = 0
    var votosTv3 = 0

    while (true) {
        println("\n1. Votar\n2. Vaciar urnas\n3. Mostrar Resultados\n4. Salir")
        println("Seleccione una opcion: ")
        var opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println("Candidatos")
                println("""
                    1 Duque
                    2 Santos
                    3 Uribe
                """.trimIndent())
                println("Ingrese el número del candidato a votar: ")
                val candidato = readln().toInt()
                println("Medios ")
                println("""
                    1 Internet
                    2 Radio
                    3 Television
                """.trimIndent())
                println("Ingrese medio de publicidad: ")
                val medio = readln().toInt()

                when (candidato) {
                    1 -> when (medio) {
                        1 -> votosInt1++
                        2 -> votosRad1++
                        3 -> votosTv1++
                    }
                    2 -> when (medio) {
                        1 -> votosInt2++
                        2 -> votosRad2++
                        3 -> votosTv2++
                    }
                    3 -> when (medio) {
                        1 -> votosInt3++
                        2 -> votosRad3++
                        3 -> votosTv3++
                    }
                    else -> println("Candidato no existente")
                }
            }
            2 -> {
                votosInt1 = 0
                votosInt2 = 0
                votosInt3 = 0
                votosRad1 = 0
                votosRad2 = 0
                votosRad3 = 0
                votosTv1 = 0
                votosTv2 = 0
                votosTv3 = 0
                println("Urnas vaciadas")
            }
            3 -> {
                var totalVotos = votosInt1 + votosInt2 + votosInt3 + votosRad1 + votosRad2 + votosRad3 + votosTv1 + votosTv2 + votosTv3
                println("El total de votos fue: ${totalVotos}")

                var costos1 = (votosInt1 * 700000) + (votosRad1 * 200000) + (votosTv1 * 600000)
                var costos2 = (votosInt2 * 700000) + (votosRad2 * 200000) + (votosTv2 * 600000)
                var costos3 = (votosInt3 * 700000) + (votosRad3 * 200000) + (votosTv3 * 600000)
                println("\nCosto de campaña por candidato")
                println("Candidato 1: ${costos1}")
                println("Candidato 2: ${costos2}")
                println("Candidato 3: ${costos3}")

                var costoTotal = costos1 + costos2 + costos3
                println("\nCosto promedio campaña: ${costoTotal}")


                var votos1 = votosInt1 + votosRad1 + votosTv1
                var votos2 = votosInt2 + votosRad2 + votosTv2
                var votos3 = votosInt3 + votosRad3 + votosTv3
                println("\nVotos por candidato")
                println("Candidato 1: ${votos1}")
                println("Candidato 2: ${votos2}")
                println("Candidato 3: ${votos3}")

                var porc1 = (totalVotos/100)*votos1
                var porc2 = (totalVotos/100)*votos2
                var porc3 = (totalVotos/100)*votos3
                println("\nPorcentaje por candidato")
                println("Candidato 1: ${porc1}")
                println("Candidato 2: ${porc2}")
                println("Candidato 3: ${porc3}")
            }
            4 ->
                break
            else -> println("Opción no valida")
        }
    }
}