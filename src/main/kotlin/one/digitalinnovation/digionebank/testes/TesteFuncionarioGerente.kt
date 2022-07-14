package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario
import one.digitalinnovation.digionebank.testes.TesteAutenticacao


fun main(){
    val maria = Gerente("Maria","222.222.222-36", 5000.0, "senha123" )
    ImprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}

