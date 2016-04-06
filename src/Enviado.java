import java.util.Date;

public class Enviado implements Estado
{
	private Date dataEntrega;

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
	public void entregar(Produto produto, Date date, String destino)
	{
		Entregue entregue = new Entregue();
		produto.setEstado(entregue);
		System.out.println("Produto foi entregue no dia " + date + " no endereco "+ destino);
	}

	@Override
	public void retornar(Produto produto, Date date) 
	{
		Retornado retornado = new Retornado();
		produto.setEstado(retornado);
		System.out.println("Produto foi retornado no dia: " + date);
		
	}

	@Override
	public void extraviar(Produto produto) 
	{
		Extraviado extraviado = new Extraviado();
		produto.setEstado(extraviado);
		System.out.println("Produto foi extraviado!");	
	}

	@Override
	public void setDate(Date date) 
	{
		dataEntrega = date;
	}

	@Override
	public Date getDate()
	{
		return dataEntrega;
	}

	@Override
	public String informarEstado() {
		// TODO Auto-generated method stub
		return "Enviado";
	}

}
