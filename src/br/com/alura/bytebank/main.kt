import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua paraiso",
        numero = 1000,
        bairro = "Centro",
        cidade = "São Paulo",
        estado = "SP",
        cep = "11111111",
        complemento = "próximo a estação de metrô"
    )

    val objeto: Any = Any()

    imprime("hash ${endereco.hashCode()}")

    imprime(endereco)
}

fun imprime(valor: Any): Any? {
    println(valor)
    return valor
}
