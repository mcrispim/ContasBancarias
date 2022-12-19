package com.contasbancarias

enum class TipoCarteira { FISICA, DIGITAL }

abstract class Carteira {
    abstract val proprietario: Cliente
    var senha: String = ""
    abstract val tipo: TipoCarteira
    var saldo: Double = 0.0
    fun pagarBoleto(valor: Double) {
        saldo = saldo - valor
        println("Conta: ${proprietario.nomeCompleto} (Carteira ${tipo.name.lowercase()})")
        println("   Pago boleto de R$ ${"%.2f".format(valor)}.")
    }
    fun printSaldo() {
        println("Conta: ${proprietario.nomeCompleto} (Carteira ${tipo.name.lowercase()})")
        println("   Saldo: R$ ${"%.2f".format(saldo)}.")
    }
}

class CarteiraFisica(override val proprietario: Cliente) : Carteira() {
    override val tipo = TipoCarteira.FISICA
    fun deposito(valor: Double) {
        saldo = saldo + valor
        println("Conta: ${proprietario.nomeCompleto} (Carteira ${tipo.name.lowercase()})")
        println("   Efetuado depósito de R$ ${"%.2f".format(valor)}.")
    }
    fun saque(valor: Double) {
        saldo = saldo - valor
        println("Conta: ${proprietario.nomeCompleto} (Carteira ${tipo.name.lowercase()})")
        println("   Efetuado saque de R$ ${"%.2f".format(valor)}.")
    }
}

class CarteiraDigital(override val proprietario: Cliente) : Carteira() {
    override val tipo = TipoCarteira.DIGITAL

    fun transferenciaPix(valor: Double, chavePix: String) {
        saldo = saldo - valor
        println("Conta: ${proprietario.nomeCompleto} (Carteira ${tipo.name.lowercase()})")
        println("   Transferência PIX no valor de R$ ${"%.2f".format(valor)} para $chavePix.")
    }
    fun investir(valor: Double) {
        saldo = saldo - valor
        println("Conta: ${proprietario.nomeCompleto} (Carteira ${tipo.name.lowercase()})")
        println("   Investido o valor de R$ ${"%.2f".format(valor)}.")
    }
    fun guardar(valor: Double) {
        saldo = saldo + valor
        println("Conta: ${proprietario.nomeCompleto} (Carteira ${tipo.name.lowercase()})")
        println("   Guardado (desinvestido) o valor de R$ ${"%.2f".format(valor)}.")
    }
}