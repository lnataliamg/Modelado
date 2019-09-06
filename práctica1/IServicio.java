import java.util.*;
public interface IServicio extends Sujeto{


  @Override
  public void registrarUsuario(Usuario usuario);

 @Override
  public void removerUsuario(Usuario usuario);

 @Override
  public void notificarUsuarios();

  public String getState();

  public void setState(String estado);

  public void cobrar(Usuario usuario);

  public String getNameServicio();
}
