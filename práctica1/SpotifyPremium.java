import java.util.*;
public class SpotifyPremium extends Spotify{

  public SpotifyPremium(List<Usuario> usuarios) {
    super(4,usuarios);
  }


  @Override
  public void cobrar(Usuario usuario){
    if (usuario.getDinero()>= 4){
      usuario.setDinero(usuario.getDinero()-4);
      System.out.println(usuario.getNombre() + ", te hemos cobrado 4 pesos de tu membresia de Spotify Premium");
    }else{
      removerUsuario(usuario);
    }
  }

  @Override
  public void registrarUsuario(Usuario usuario){
    usuarios.add(usuario);
    System.out.println("Bienvenido, " + usuario.getNombre() + ",al servicio de Spotify Premium ");
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
     return "Spotify Premium";
   }





  }
