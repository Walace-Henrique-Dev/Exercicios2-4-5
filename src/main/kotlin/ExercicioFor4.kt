fun main(args: Array<String>) {
    /*
   4 - Crie um programa que leia 10 valores e identifique a quantidade de números pares e ímpares
    Do...While
     */

    var num = 0
    var par = 0
    var impar = 0
    var i = 1

    while(i <= 10){

        print("Digite um número: ")
        num = readLine()!!.toInt()

        if(num % 2 == 0){
            par++

        }else{
            impar++


        }


    }
    println("A quantidade dos impares é: $impar" +
            "\nA quantidade dos pares é: $par ")










}

