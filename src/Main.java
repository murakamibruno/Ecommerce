import java.util.Date;

public class Main 
{
	public static void main(String[] args)
	{
		Produto produto = new Produto(); //Exemplo sendo retornado
		Produto produto2 = new Produto(); // Exemplo sendo extraviado
		Produto produto3 = new Produto(); // Exemplo sendo Entregue
		Date date = new Date();
		String destino = "Rua dos bobos, nº 0";
		
		produto.informarEstado();
		produto.getEstado().adicionar(produto);
		produto.informarEstado();
		produto.getEstado().remover(produto);
		produto.informarEstado();
		//------------------------------------------------------------------- Produto volta a estar disponivel
		produto.getEstado().adicionar(produto);
		produto.informarEstado();
		produto.getEstado().efetuarPagamentoBoleto(produto);
		produto.informarEstado();
		produto.getEstado().naoEfetuarPagamento(produto);
		produto.informarEstado();
		//------------------------------------------------------------------- Produto volta a estar disponivel
		produto.getEstado().adicionar(produto);
		produto.informarEstado();
		produto.getEstado().efetuarPagamentoCartao(produto);
		produto.informarEstado();
		produto.getEstado().pagar(produto, date);
		produto.informarEstado();
		produto.getEstado().checar(produto);
		produto.informarEstado();
		produto.getEstado().separarItem(produto);
		produto.informarEstado();
		produto.getEstado().cancelar(produto);
		produto.informarEstado();
		//------------------------------------------------------------------- Produto volta a estar disponivel
		produto.getEstado().adicionar(produto);
		produto.informarEstado();
		produto.getEstado().efetuarPagamentoCartao(produto);
		produto.informarEstado();
		produto.getEstado().pagar(produto, date);
		produto.informarEstado();
		produto.getEstado().checar(produto);
		produto.informarEstado();
		produto.getEstado().separarItem(produto);
		produto.informarEstado();
		produto.getEstado().despachar(produto, date, destino);
		produto.informarEstado();
		produto.getEstado().enviar(produto, date, destino);
		produto.informarEstado();
		produto.getEstado().retornar(produto, date);
		produto.informarEstado();
		//------------------------------------------------------------------- Produto foi retornado
		produto2.getEstado().adicionar(produto2);
		produto2.informarEstado();
		produto2.getEstado().efetuarPagamentoCartao(produto2);
		produto2.informarEstado();
		produto2.getEstado().pagar(produto2, date);
		produto2.informarEstado();
		produto2.getEstado().checar(produto2);
		produto2.informarEstado();
		produto2.getEstado().separarItem(produto2);
		produto2.informarEstado();
		produto2.getEstado().despachar(produto2, date, destino);
		produto2.informarEstado();
		produto2.getEstado().enviar(produto2, date, destino);
		produto2.informarEstado();
		produto2.getEstado().extraviar(produto2);
		produto2.informarEstado();
		//------------------------------------------------------------------- Produto foi extraviado
		produto3.getEstado().adicionar(produto3);
		produto3.informarEstado();
		produto3.getEstado().efetuarPagamentoCartao(produto3);
		produto3.informarEstado();
		produto3.getEstado().pagar(produto3, date);
		produto3.informarEstado();
		produto3.getEstado().checar(produto3);
		produto3.informarEstado();
		produto3.getEstado().separarItem(produto3);
		produto3.informarEstado();
		produto3.getEstado().despachar(produto3, date, destino);
		produto3.informarEstado();
		produto3.getEstado().enviar(produto3, date, destino);
		produto3.informarEstado();
		produto3.getEstado().entregar(produto3, date, destino);
		produto3.informarEstado();
	}
}
