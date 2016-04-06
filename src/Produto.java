
public class Produto 
{
	private Estado estado;
	
	public Produto()
	{
		estado = new Disponivel();
	}
	
	public void setEstado(Estado estado)
	{
		this.estado = estado;
	}
	
	public Estado getEstado()
	{
		return estado;
	}
	
	public void informarEstado()
	{
		System.out.println("O Estado do produto é: " + getEstado().informarEstado());
	}
}
