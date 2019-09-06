import java.util.*;
public class NetflixI extends Netflix{
  public NetflixI(List<Usuario> usuarios){
    super(1,7,usuarios);
  }

  @Override
  public void cobrar(Usuario usuario){
    if (usuario.getDinero()>= 7){
      usuario.setDinero(usuario.getDinero()-7);
      System.out.println(usuario.getNombre() + ", te hemos cobrado 7 pesos de tu membresia de un diapositivo en Netflix");
    }else{
      removerUsuario(usuario);
    }
  }

  @Override
  public void registrarUsuario(Usuario usuario){
    usuarios.add(usuario);
    System.out.println("Bienvenido, " + usuario.getNombre() + ",al servicio de Netflix para 1 dispositivo");
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
     return "Netflix para un dispositivo";
   }





}
