import java.util.*;
public class Usuario implements Observador{
  private String nombre;
  private int dinero;
  private String estadoDeUsuario;
  private List<IServicio> servicios;
	/**
	* Default empty Usuario constructor
	*/
	public Usuario() {
		super();
	}

	/**
	* Default Usuario constructor
	*/
	public Usuario(String nombre, int dinero ) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
    servicios = new ArrayList<IServicio>();
	}

	/**
	* Returns value of nombre
	* @return
	*/
	public String getNombre() {
		return nombre;
	}

  public void addServicio(IServicio servicio){
    servicios.add(servicio);
  }

  public List<IServicio> getServicios(){
    return servicios;
  }

	/**
	* Sets new value of nombre
	* @param
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Returns value of dinero
	* @return
	*/
	public int getDinero() {
		return dinero;
	}

	/**
	* Sets new value of dinero
	* @param
	*/
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}



  public void update(){
    for (IServicio serv : servicios ) {
      serv.getState();
    }
  }

}
