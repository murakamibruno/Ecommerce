import java.util.Date;

public class Disponivel implements Estado
{

	@Override
	public void adicionar(Produto produto)
	{
		Adicionado adicionado = new Adicionado();
		produto.setEstado(adicionado);
		System.out.println("O produto foi adicionado ao carrinho");
	}

	@Override
	public void remover(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void efetuarPagamentoBoleto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void efetuarPagamentoCartao(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagar(Produto produto, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void naoEfetuarPagamento(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void separarItem(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void despachar(Produto produto, Date date, String destino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviar(Produto produto, Date date, String destino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entregar(Produto produto, Date date, String destino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retornar(Produto produto, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extraviar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disponibilizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String informarEstado() 	
	{
		return "Disponivel";
	}

}
