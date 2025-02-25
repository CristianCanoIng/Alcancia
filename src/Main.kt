import kotlin.random.Random

fun main() {
    var mon20 = 0
    var mon50 = 0
    var mon100 = 0
    var mon200 = 0
    var mon500 = 0
    var suma = 0
    var ahorro = 0

    /*do {

        println("Alcancia\n\n")

        println("1 Agregar moneda")
        println("2 Contar monedas")
        println("3 Calcular total")
        println("4 Romper alcancia")
        println("5 Cerrar")

        println("\n¿Que Opcion desea?\n\n")
        var opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println("Monedas\n")
                println("1 20")
                println("2 50")
                println("3 100")
                println("4 200")
                println("5 500")

                println("\n¿Que moneda desea agregar?\n")

                var moneda = readln().toInt()

                when (moneda) {
                    1 -> {
                        println("Moneda de 20 agregada\n")
                        mon20 += 1
                    }

                    2 -> {
                        println("Moneda de 50 agregada\n")
                        mon50 += 1
                    }

                    3 -> {
                        println("Moneda de 100 agregada\n")
                        mon100 += 1
                    }

                    4 -> {
                        println("Moneda de 200 agregada\n")
                        mon200 += 1
                    }

                    5 -> {
                        println("Moneda de 500 agregada\n")
                        mon500 += 1
                    }
                }
            }

            2 -> {
                suma = mon20+mon50+mon100+mon200+mon500
                println("La cantidad de monedas es:  ${suma}")
            }

            3 -> {
                ahorro = (mon20*20)+(mon50*50)+(mon100*100)+(mon200*200)+(mon500*500)
                println("Tu ahorro es:  ${ahorro}")
            }

            4 -> {
                mon20=0
                mon50=0
                mon100=0
                mon200=0
                mon500=0
                println("Alcancia rota")
            }
        }
    } while (opcion != 5)
*/
    println("Formas de agregar numeros aleatorios")

    val numero = Random.nextInt(10, 50)
    println(numero)

    val numeroDouble = Random.nextDouble(2.0, 15.0)
    println(numeroDouble)

    val numeroFloat = Random.nextFloat()

    val lista = List(5) { Random.nextInt(1, 100) }
    println(lista)

}
