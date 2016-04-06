import java.util.Date;

public class EmEspera implements Estado
{
	private Date dataPgto;

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
	public void pagar(Produto produto, Date date) 
	{
		Pago pago = new Pago();
		produto.setEstado(pago);
		System.out.println("O produto foi pago no dia " + date);
	}

	@Override
	public void naoEfetuarPagamento(Produto produto) 
	{
		Cancelado cancelado = new Cancelado();
		produto.setEstado(cancelado);
		System.out.println("Produto nao foi pago dentro do prazo estipulado");
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
	public void setDate(Date date) 
	{
		dataPgto = date;
	}

	@Override
	public Date getDate() {
		
		return dataPgto;
	}

	@Override
	public void disponibilizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String informarEstado() {
		return "Em espera";
	}

}
