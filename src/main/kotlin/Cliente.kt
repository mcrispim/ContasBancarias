package com.contasbancarias

import java.math.BigDecimal

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
) : Cliente(nome, sobrenome, cpf, senha, plano = TipoPlano.FISICO), CarteiraFisica {

    override val tipo: TipoCarteira
        get() = TipoCarteira.DIGITAL
    override var saldo = BigDecimal.ZERO
        get() = saldo
        set(value) { field = value }

    override fun pagarBoleto(valor: Double) {
        super.pagarBoleto(valor)
        println("$nomeCompleto pagou um boleto de R$ $valor")
    }
}

class ClienteDigital(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String,
) : Cliente(nome, sobrenome, cpf, senha, TipoPlano.DIGITAL), CarteiraFisica {

    override val tipo: TipoCarteira
        get() = TipoCarteira.DIGITAL
    override var saldo = BigDecimal.ZERO
    override val extrato = mutableListOf<String>()
    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }

}

class ClientePremium(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String
) : Cliente(nome, sobrenome, cpf, senha, TipoPlano.PREMIUM), CarteiraFisica {

//    override fun deposito(d: Double) {
//        TODO("Not yet implemented")
//    }
//
//    override fun saque() {
//        TODO("Not yet implemented")
//    }

    override val tipo: TipoCarteira
        get() = TODO("Not yet implemented")
    override var saldo: BigDecimal
        get() = TODO("Not yet implemented")
        set(value) {}
    override val extrato: MutableList<String>
        get() = TODO("Not yet implemented")

    override fun pagarBoleto() {
        TODO("Not yet implemented")
    }

}