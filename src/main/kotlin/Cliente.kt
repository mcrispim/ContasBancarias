package com.contasbancarias

enum class TipoPlano { FISICO, DIGITAL, PREMIUM }

abstract class Cliente(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: String,
    val plano: TipoPlano,
) {
    val nomeCompleto
        get() = "$nome $sobrenome"
    private var saldo = 0.0
    private val extrato = mutableListOf<String>()
}

class ClienteNormal(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String,
    saldoInicialFisico: Double
) : Cliente(nome, sobrenome, cpf, senha, plano = TipoPlano.FISICO) {
    val carteiraFisica = CarteiraFisica(this)
    init {
        carteiraFisica.saldo = saldoInicialFisico
        println("Criada carteira física de $nomeCompleto com saldo inicial de ${"%.2f".format(carteiraFisica.saldo)}.")
    }
}

class ClienteDigital(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String,
    saldoInicialDigital: Double
) : Cliente(nome, sobrenome, cpf, senha, TipoPlano.DIGITAL) {
    val carteiraDigital = CarteiraDigital(this)
    init {
        carteiraDigital.saldo = saldoInicialDigital
        println("Criada carteira digital de $nomeCompleto com saldo inicial de ${"%.2f".format(carteiraDigital.saldo)}.")
    }
}

class ClientePremium(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String,
    saldoInicialFisico: Double = 0.0,
    saldoInicialDigital: Double = 0.0,
    ) : Cliente(nome, sobrenome, cpf, senha, TipoPlano.PREMIUM) {
    val carteiraDigital = CarteiraDigital(this)
    val carteiraFisica = CarteiraFisica(this)
    init {
        carteiraFisica.saldo = saldoInicialFisico
        carteiraDigital.saldo = saldoInicialDigital

        println("Criadas carteiras física e digital de $nomeCompleto com saldos iniciais de R$ ${"%.2f".format(carteiraFisica.saldo)} e R$ ${"%.2f".format(carteiraDigital.saldo)}, respectivamente.")
    }
}