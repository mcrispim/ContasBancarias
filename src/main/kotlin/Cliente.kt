package com.contasbancarias

import java.math.BigDecimal

enum class TipoPlano { FISICO, DIGITAL, PREMIUM }
abstract class Cliente(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val senha: String,
    val plano: TipoPlano
)

class ClienteNormal(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String,
) : Cliente(nome, sobrenome, cpf, senha, plano = TipoPlano.FISICO), CarteiraFisica {
    override fun deposito() {
        TODO("Not yet implemented")
    }

    override fun saque() {
        TODO("Not yet implemented")
    }

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

class ClienteDigital(
    nome: String,
    sobrenome: String,
    cpf: String,
    senha: String,
    plano: TipoPlano
) : Cliente(nome, sobrenome, cpf, senha, plano), CarteiraFisica {
    override fun deposito() {
        TODO("Not yet implemented")
    }

    override fun saque() {
        TODO("Not yet implemented")
    }

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

class ClientePremium(
    nome: String,
                         sobrenome: String,
                         cpf: String,
                         senha: String,
                         plano: TipoPlano
) : Cliente(nome, sobrenome, cpf, senha, plano), CarteiraFisica {
    override fun deposito() {
        TODO("Not yet implemented")
    }

    override fun saque() {
        TODO("Not yet implemented")
    }

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