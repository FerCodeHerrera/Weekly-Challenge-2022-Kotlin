package com.mouredev.weeklychallenge2022

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

fun main() {
    for(number in 1..100 )
    {
        print(primeNumber(number))
    }
}

fun primeNumber(number:Int):String{

    var i:Int = 0

    if(number == 0)
        return "\nValor no válido, ingrese un número entre 1 y 100."

    for (opeDiv in 1..number)
    {
        if(number%opeDiv == 0) {
            i++
        }

        if (i > 2) {
            return ""
        }
    }
    return "\n$number"
}


