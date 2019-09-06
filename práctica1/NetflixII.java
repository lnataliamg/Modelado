import java.util.*;
public class NetflixII extends Netflix{

  public NetflixII(List<Usuario> usuarios){
    super(2,10,usuarios);
  }

  @Override
  public void cobrar(Usuario usuario){
    if (usuario.getDinero()>= 10){
      usuario.setDinero(usuario.getDinero()-10);
      System.out.println(usuario.getNombre() + ", te hemos cobrado 10 pesos de tu membresia de dos diapositivos en Netflix");
    }else{
      removerUsuario(usuario);
    }
  }

  @Override
  public void registrarUsuario(Usuario usuario){
    usuarios.add(usuario);
    System.out.println("Bienvenido, " + usuario.getNombre() + ",al servicio de Netflix para 2 dispositivo");
  }

  @Override
  public void removerUsuario(Usuario usuario){
    usuarios.remove(usuario);
    System.out.println(usuario.getNombre() + " tu cuenta ha sido cancelada.");
  }

  @Override
  public void notificarUsuarios(){
    for ( Usuario usuario : usuarios) {
      usuario.update();
     }
   }
   @Override
   public String getNameServicio(){
     return "Netflix para 2 dispositivos";
   }
  }
