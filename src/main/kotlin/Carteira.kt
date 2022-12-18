package  com.contasbancarias
import java.math.BigDecimal

enum class TipoCarteira { FISICA, DIGITAL }
interface Carteira {
    var senha: String
    val tipo: TipoCarteira
    var saldo: BigDecimal
    val extrato: MutableList<String>
    fun pagarBoleto()
}

interface CarteiraFisica : Carteira {
    fun deposito()
    fun saque()
}

interface CarteiraDigital : Carteira {
    fun transferenciaPix()
    fun investir()
    fun guardar()
}