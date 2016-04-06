import java.util.Date;

public class Despachado implements Estado
{

	private Date dataEnvio;
	
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
	public void enviar(Produto produto, Date date, String destino) 
	{
		Enviado enviado = new Enviado();
		produto.setEstado(enviado);
		System.out.println("O produto foi enviado na data: " + date + " para o endereco " + destino);
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
		dataEnvio = date;
	}

	@Override
	public Date getDate() 
	{
		return dataEnvio;
	}

	@Override
	public String informarEstado() {
		// TODO Auto-generated method stub
		return "Despachado";
	}

}
