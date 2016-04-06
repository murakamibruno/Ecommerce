import java.util.Date;

public class Adicionado implements Estado
{

	@Override
	public void adicionar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Produto produto) 
	{
		Disponivel disponivel = new Disponivel();
		produto.setEstado(disponivel);
		System.out.println("Produto foi removido do carrinho");
		
	}

	@Override
	public void efetuarPagamentoBoleto(Produto produto)
	{
		EmEspera emEspera = new EmEspera();
		produto.setEstado(emEspera);
		System.out.println("Produto sera pago por boleto");
	}

	@Override
	public void efetuarPagamentoCartao(Produto produto)
	{
		EmEspera emEspera = new EmEspera();
		produto.setEstado(emEspera);
		System.out.println("Produto sera pago por cartao");
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
	public String informarEstado() {
		return "Adicionado";
	}
	
}
