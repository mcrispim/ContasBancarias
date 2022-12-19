package  com.contasbancarias
import java.math.BigDecimal

enum class TipoCarteira { FISICA, DIGITAL }

interface Carteira {
    var senha: String
    val tipo: TipoCarteira
    var saldo: BigDecimal
    fun pagarBoleto(valor: Double) {
        saldo = saldo - valor.toBigDecimal()
    }
}

interface CarteiraFisica : Carteira {
    fun deposito(valor: Double) {
        saldo = saldo + valor.toBigDecimal()
    }
    fun saque(valor: Double) {
        saldo = saldo - valor.toBigDecimal()
    }
}

interface CarteiraDigital : Carteira {
    fun transferenciaPix()
    fun investir()
    fun guardar()
}