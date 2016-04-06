import java.util.Date;

public interface Estado
{
	public void adicionar(Produto produto);
	public void remover(Produto produto);
	public void efetuarPagamentoBoleto(Produto produto);
	public void efetuarPagamentoCartao(Produto produto);
	public void pagar(Produto produto, Date date);
	public void naoEfetuarPagamento(Produto produto);
	public void checar(Produto produto);
	public void separarItem(Produto produto);
	public void despachar(Produto produto,Date date, String destino);
	public void cancelar(Produto produto);
	public void enviar(Produto produto, Date date, String destino);
	public void entregar(Produto produto, Date date, String destino);
	public void retornar(Produto produto, Date date);
	public void extraviar(Produto produto);
	public void disponibilizar(Produto produto);
	public void setDate(Date date);
	public Date getDate();
	public String informarEstado();
}
