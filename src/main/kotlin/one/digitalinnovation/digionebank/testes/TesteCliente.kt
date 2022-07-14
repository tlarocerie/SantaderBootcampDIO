package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
        val jose = Cliente(
            nome = "Jose",
            cpf = "666.555.888-54",
            clienteTipo = ClienteTipo.PF,
            senha = "123456"
        )

    println(jose)
    TesteAutenticacao().autentica(jose)

}