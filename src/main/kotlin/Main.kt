package com.contasbancarias

fun main() {

    // UC01: Cliente cria uma conta normal / digital / premium

    val clienteNormal = ClienteNormal(
        nome = "João",
        sobrenome = "de Deus",
        cpf = "111.111.111-11",
        senha = "senhaNormal",
    )
    val clienteDigital = ClienteDigital(
        nome = "Maria",
        sobrenome = "do Rosário",
        cpf = "222.222.222-22",
        senha = "senhaDigital",
    )
    val clientePremium = ClientePremium(
        nome = "Aucier",
        sobrenome = "Crispim",
        cpf = "333.333.333-33",
        senha = "senhaPremium"
    )

    clienteNormal.deposito(100.00)

}

