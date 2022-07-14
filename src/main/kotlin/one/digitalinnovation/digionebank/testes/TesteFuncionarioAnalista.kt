package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main(){
    val joao = Analista("João","321.123.456-78", 2000.0 )
    ImprimeRelatorioFuncionario.imprime(joao)
}

