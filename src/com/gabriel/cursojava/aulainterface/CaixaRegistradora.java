package com.gabriel.cursojava.aulainterface;

public class CaixaRegistradora {

	// Aceita qualquer classe que implemente FormaPagamento
	public static void fecharConta(FormaPagamento forma, double total) {
		System.out.println("Iniciando transação...");
		forma.processar(total);
		System.out.println("Transação finalizada com sucesso!\n");
	}

	public static void main(String[] args) {
		FormaPagamento pagamento1 = new CartaoCredito("1234-5678-9876-5432");
		FormaPagamento pagamento2 = new Pix("meuemail@teste.com");
		BoletoBancario pagamento3 = new BoletoBancario("Gabriel Marques");

		fecharConta(pagamento1, 150.00);
		fecharConta(pagamento2, 85.50);
		fecharConta(pagamento3, 300.00);

		// Boleto também pode usar o método da interface Notificavel
		pagamento3.enviarComprovante("cliente@teste.com");
	}
}