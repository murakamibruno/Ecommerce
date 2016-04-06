import java.util.Date;

public class Separado implements Estado
{

	private Date dataDespacho;
	
	@Override
	public void adicionar(Produto produto) {
		// TODO Auto-generated method stub
		
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
	public void despachar(Produto produto, Date date, String destino)
	{
		Despachado despachado = new Despachado();
		produto.setEstado(despachado);
		System.out.println("Produto foi despachado no dia " + date + " para o endereco " + destino);
	}

	@Override
	public void cancelar(Produto produto)
	{
		Disponivel disponivel = new Disponivel();
		produto.setEstado(disponivel);
		System.out.println("Pedido foi cancelado");
		
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
	public void setDate(Date date)
	{
		dataDespacho = date;
	}

	@Override
	public Date getDate() {
		return dataDespacho;
	}

	@Override
	public String informarEstado() {
		// TODO Auto-generated method stub
		return "Separado";
	}

}
