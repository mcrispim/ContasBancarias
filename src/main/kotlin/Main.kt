package com.contasbancarias

fun main() {

    // UC01: Cliente cria uma conta normal / digital / premium

    val clienteNormal = ClienteNormal(
        nome = "João",
        sobrenome = "Normal de Deus",
        cpf = "111.111.111-11",
        senha = "senhaNormal",
        saldoInicialFisico = 0.0
    )
    clienteNormal.carteiraFisica.deposito(100.00)
    clienteNormal.carteiraFisica.printSaldo()
    clienteNormal.carteiraFisica.saque(23.00)
    clienteNormal.carteiraFisica.printSaldo()
    clienteNormal.carteiraFisica.pagarBoleto(18.00)
    clienteNormal.carteiraFisica.printSaldo()
    println()

    val clienteDigital = ClienteDigital(
        nome = "Maria",
        sobrenome = "do Rosário Digital",
        cpf = "222.222.222-22",
        senha = "senhaDigital",
        saldoInicialDigital = 1000.00)
    clienteDigital.carteiraDigital.investir(300.00)
    clienteDigital.carteiraDigital.printSaldo()
    clienteDigital.carteiraDigital.pagarBoleto(250.00)
    clienteDigital.carteiraDigital.printSaldo()
    clienteDigital.carteiraDigital.guardar(150.00)
    clienteDigital.carteiraDigital.printSaldo()
    clienteDigital.carteiraDigital.transferenciaPix(130.00, "CPF: 555.555.555-55")
    clienteDigital.carteiraDigital.printSaldo()
    println()

    val clientePremium = ClientePremium(
        nome = "Aucier",
        sobrenome = "Premium Crispim",
        cpf = "333.333.333-33",
        senha = "senhaPremium",
        saldoInicialFisico = 1500.00,
        saldoInicialDigital = 2000.00,
    )
    clientePremium.carteiraFisica.deposito(100.00)
    clientePremium.carteiraFisica.printSaldo()
    clientePremium.carteiraFisica.saque(230.00)
    clientePremium.carteiraFisica.printSaldo()
    clientePremium.carteiraFisica.pagarBoleto(180.00)
    clientePremium.carteiraFisica.printSaldo()
    clientePremium.carteiraDigital.investir(1300.00)
    clientePremium.carteiraDigital.printSaldo()
    clientePremium.carteiraDigital.pagarBoleto(500.00)
    clientePremium.carteiraDigital.printSaldo()
    clientePremium.carteiraDigital.guardar(1000.00)
    clientePremium.carteiraDigital.printSaldo()
    clienteDigital.carteiraDigital.transferenciaPix(50.00, "Fone: (85) 99999-9999")
    clienteDigital.carteiraDigital.printSaldo()
}

