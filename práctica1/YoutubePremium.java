import java.util.*;
public class YoutubePremium extends Youtube{

  public YoutubePremium(List<Usuario> usuarios) {
    super(6,usuarios);
  }


  @Override
  public void cobrar(Usuario usuario){
    if (usuario.getDinero()>= 6){
      usuario.setDinero(usuario.getDinero()-6);
      System.out.println(usuario.getNombre() + ", te hemos cobrado 6 pesos de tu membresia de Youtube Premium");
    }else{
      removerUsuario(usuario);
    }
  }

  @Override
  public void registrarUsuario(Usuario usuario){
    usuarios.add(usuario);
    System.out.println("Bienvenido, " + usuario.getNombre() + ",al servicio de Youtube Premium ");
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
     return "Youtube Premium";
   }





  }
