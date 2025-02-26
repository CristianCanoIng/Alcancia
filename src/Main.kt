import java.util.Scanner
import kotlin.random.Random

fun main() {
    var intentos = 3
    do {
        println("Ingrese codigo de acceso: ")
        var n = readln().toInt()

        if (n >= 1000 && n <= 1999) {
            println("Bienvenido empleado ${n}}")
        } else if (n >= 2000 && n <= 2999) {
            println("Bienvenido visitante")
            println("Ingresa nombre: ")
            var nombre= readln().toString()
            println("Ingresa motivo de ingreso: ")
            var motivo= readln().toString()
            println("\nIngreso ${nombre} con motivo de ${motivo}")
        } else {
            intentos = intentos-1
            println("Codigo Incorrecto, te quedan ${intentos} intentos")
        }

    }while(intentos!=0)

    println("Acceso bloqueado")
}