import java.util.*;
public class NetflixIII extends Netflix{

  public NetflixIII(List<Usuario> usuarios){
    super(4,15, usuarios);
  }

  @Override
  public void cobrar(Usuario usuario){
    if (usuario.getDinero()>= 15){
      usuario.setDinero(usuario.getDinero()-15);
      System.out.println(usuario.getNombre() + ", te hemos cobrado 15 pesos de tu membresia de 4 diapositivos en Netflix");
    }else{
      removerUsuario(usuario);
    }
  }

  @Override
  public void registrarUsuario(Usuario usuario){
    usuarios.add(usuario);
    System.out.println("Bienvenido, " + usuario.getNombre() + ",al servicio de Netflix para 4 dispositivos");
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
     return "Netflix para 4 dispositivos";
   }
}
