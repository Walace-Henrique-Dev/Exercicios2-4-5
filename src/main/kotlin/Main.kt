fun main(args: Array<String>) {
    /*
    2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.
    While
     */

    var num = 0
    var par = 0
    var impar = 0

    for(i in 1..10){

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