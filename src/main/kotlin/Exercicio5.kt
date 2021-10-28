fun main(args: Array<String>) {


   /*
   5 - Crie um programa que leia um número do teclado até que
        encontre um número igual a zero. No final, mostre:

- A soma dos números digitados.
- A média deles
- O menor número digitado
- O maior número digitado
    */

    var num = 0
    var soma = 0
    var media = 0
    var cont = 0
    var maior = 0
    var menor = 0

    do {
        println("Digite um número: ")
        num = readLine()!!.toInt()
        if(cont == 0){
            menor = num
            maior = num
        }
        if (menor > num && num != 0){
            menor = num
        }
        if (maior < num){
            maior = num
        }

        soma += num
        cont++

    }while (num != 0)
    cont = cont - 1
    media = soma/cont

    println("A soma dos números é igual a $soma" +
            "\nA média dos números é $media" +
            "\nO menor número digitado foi $menor" +
            "\nO maior número digitado foi $maior")






}


