import java.util.*;
public class AmazonPremium extends Spotify{

  public AmazonPremium(List<Usuario> usuarios) {
    super(13,usuarios);
  }


  @Override
  public void cobrar(Usuario usuario){
    if (usuario.getDinero()>= 13){
      usuario.setDinero(usuario.getDinero()-13);
      System.out.println(usuario.getNombre() + ", te hemos cobrado 13 pesos de tu membresia de Amazon Premium");
    }else{
      removerUsuario(usuario);
    }
  }

  @Override
  public void registrarUsuario(Usuario usuario){
    usuarios.add(usuario);
    System.out.println("Bienvenido, " + usuario.getNombre() + ",al servicio de Amazon Premium ");
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
     return "Amazon Premium";
   }





  }
