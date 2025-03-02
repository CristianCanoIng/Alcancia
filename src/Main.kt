import kotlin.random.Random

fun main() {

    //Apuesta y Gana
    var dinero = 0
    println("Bienvenido Apuesta y Gana")
    do {
        println("¿Quiere jugar? Y/N : ")
        var opcion = readln()?.uppercase()
        if (opcion == "Y") {

            println("\nSaldo Total: ${dinero}")
            println("Ingrese dinero de apuesta: ")
            dinero = readln().toInt()
            println("\nApuesta es: ${dinero}")
            println("Procesando...")
            var ale = Random.nextInt(1, 3)
            if (ale == 1) {
                println("Felicidades Multiplicaste Tu Dinero")
                dinero = dinero * 2
                println("\n\nDinero Ganado: ${dinero}\n")
            } else if (ale == 2) {
                println("Perdiste Mitad Del Dinero\n")
                dinero = dinero / 2
            } else {
                println("Perdiste todo tu dinero")
                dinero = 0
                opcion = "N"
            }

        }else{
            println("Adios")
        }
    }while(opcion != "N")
}