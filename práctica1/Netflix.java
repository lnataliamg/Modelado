import java.util.*;
public abstract class Netflix implements IServicio{
    private int numDisp;
    private int monto;
    protected List<Usuario> usuarios;
    protected String ultimoSuceso;
    
	/**
	* Default empty Netflix constructor
	*/
	public Netflix() {
		super();
	}

	/**
	* Default Netflix constructor
	*/
	public Netflix(int numDisp, int monto, List<Usuario> usuarios) {
		super();
		this.numDisp = numDisp;
		this.monto = monto;
		this.usuarios = usuarios;
	}



	/**
	* Returns value of numDisp
	* @return
	*/
	public int getNumDisp() {
		return numDisp;
	}

	/**
	* Sets new value of numDisp
	* @param
	*/
	public void setNumDisp(int numDisp) {
		this.numDisp = numDisp;
	}

	/**
	* Returns value of monto
	* @return
	*/
	public int getMonto() {
		return monto;
	}

	/**
	* Sets new value of monto
	* @param
	*/
	public void setMonto(int monto) {
		this.monto = monto;
	}

	/**
	* Returns value of usuarios
	* @return
	*/
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	* Sets new value of usuarios
	* @param
	*/
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

  @Override
  public String getState(){
    return(ultimoSuceso);
  }

  @Override
  public void setState(String ultimoSuceso){
    this.ultimoSuceso=ultimoSuceso;
    System.out.println(ultimoSuceso);

  }
  @Override
  public abstract String getNameServicio();
  @Override
  public abstract void registrarUsuario(Usuario usuario);

 @Override
  public abstract void removerUsuario(Usuario usuario);

 @Override
  public abstract void notificarUsuarios();

  @Override
  public abstract void cobrar(Usuario usuario);



}
