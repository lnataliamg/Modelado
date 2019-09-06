import java.util.*;
public abstract class Amazon implements IServicio{
    private int monto;
    protected List<Usuario> usuarios;
    protected String ultimoSuceso;

	/**
	* Default empty Amazon constructor
	*/
	public Amazon() {
		super();
	}

	/**
	* Default Amazon constructor
	*/
	public Amazon(int monto, List<Usuario> usuarios) {
		super();
		this.monto = monto;
		this.usuarios = usuarios;
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

	/**
	* Returns value of ultimoSuceso
	* @return
	*/
	public String getUltimoSuceso() {
		return ultimoSuceso;
	}

	/**
	* Sets new value of ultimoSuceso
	* @param
	*/
	public void setUltimoSuceso(String ultimoSuceso) {
		this.ultimoSuceso = ultimoSuceso;
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
