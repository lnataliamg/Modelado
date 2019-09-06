import java.util.*;
public class YoutubeGratis extends Youtube{

  public YoutubeGratis(List<Usuario> usuarios) {
    super(0,usuarios);
  }


  @Override
  public void cobrar(Usuario usuario){
    if (usuario.getDinero()>= 0){
      usuario.setDinero(usuario.getDinero()-0);
      System.out.println(usuario.getNombre() + ", te hemos cobrado 0 pesos de tu membresia de Youtube gratis");
    }else{
      removerUsuario(usuario);
    }
  }

  @Override
  public void registrarUsuario(Usuario usuario){
    usuarios.add(usuario);
    System.out.println("Bienvenido, " + usuario.getNombre() + ",al servicio de Youtube gratuito ");
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
     return "Youtube gratuito";
   }





  }
