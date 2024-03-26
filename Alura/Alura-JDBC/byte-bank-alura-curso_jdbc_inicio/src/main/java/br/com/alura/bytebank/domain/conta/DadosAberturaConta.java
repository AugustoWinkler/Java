package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
