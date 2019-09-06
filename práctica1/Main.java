import java.util.Scanner;
import java.util.*;
public class Main{
  private IServicio netflixI;
  private IServicio netflixII;
  private IServicio netflixIII;
  private IServicio amazonNormal;
  private IServicio amazonPremium;
  private IServicio spotifyGratis;
  private IServicio spotifyPremium;
  private IServicio youtubeGratis;
  private IServicio youtubePremium;
  private List <Usuario> usuariosNetflixI;
  private List <Usuario> usuariosNetflixII;
  private List <Usuario> usuariosNetflixIII;
  private List <Usuario> usuariosAmazonNormal;
  private List <Usuario> usuariosAmazonPremium;
  private List <Usuario> usuariosSpotifyGratis;
  private List <Usuario> usuariosSpotifyPremium;
  private List <Usuario> usuariosYoutubeGratis;
  private List <Usuario> usuariosYoutubePremium;
  public Scanner scanner;
  private int númeroDías;


  public void bienvenida(Usuario usuario){
    System.out.println("\n                        " + usuario.getNombre() + "Estás suscrita a estos servicios: ");
    int i = 1;
    for (IServicio servicio : usuario.getServicios()) {
      System.out.println(i +".- " + servicio.getNameServicio());
      i++;

    }
    System.out.println("¿Quieres cancelar o contratar un servicio?");
    System.out.println("            1.- Contratar");
    System.out.println("            2.- Cancelar");
    System.out.println("            3.- Ninguna de las opciones");
    int respuesta = scanner.nextInt();
    if(respuesta == 1){
      contratarSuscripcion(usuario);
    }else if(respuesta == 2){
      cancelarSuscripción(usuario);
    }else if (respuesta ==3){
      System.out.println("Ten un buen día.");
    }
  }
  /*
  * 1 Netflix 1 diapositivo
  */
  public void cancelarSuscripción(Usuario usuario){
    int i = 1;
    scanner  = new Scanner(System.in);
    for (IServicio servicio : usuario.getServicios()) {
      System.out.println(i +".- " + servicio.getNameServicio());
      i++;
    }

    System.out.println("¿"+ usuario.getNombre() + ", qué servicio quieres cancelar?");
    int eliminarServicio = scanner.nextInt();
    usuario.getServicios().get(eliminarServicio-1).removerUsuario(usuario);
  }

  public void contratarSuscripcion(Usuario usuario){
    scanner  = new Scanner(System.in);

    System.out.println("¿"+ usuario.getNombre() + ", qué servicio quieres contratar?");
    System.out.println("1.-Netflix para 1 dispositivo");
    System.out.println("2.- Netflix para 2 dispositivos");
    System.out.println("3.- Netflix para 4 dispositivos");
    System.out.println("4.- Amazon versión de usuario normal");
    System.out.println("5.- Amazon premium");
    System.out.println("6.- Spotify versión gratuita");
    System.out.println("7.- Spotify versión premium");
    System.out.println("8.- Youtube versión de usuario normal");
    System.out.println("9.- Youtube versión premium");

    int contratarServicio = scanner.nextInt();
    if((contratarServicio == 1) && !(usuario.getServicios().get(contratarServicio-1) instanceof NetflixI)  ){
      netflixI.registrarUsuario(usuario);
      usuario.addServicio(netflixI);
    }else if (contratarServicio ==2 && !(usuario.getServicios().get(contratarServicio-1)  instanceof NetflixII)){
      netflixII.registrarUsuario(usuario);
      usuario.addServicio(netflixII);
    }else if (contratarServicio ==3 && !(usuario.getServicios().get(contratarServicio-1)  instanceof NetflixIII)){
      netflixIII.registrarUsuario(usuario);
      usuario.addServicio(netflixIII);
    }else if (contratarServicio ==4 && !(usuario.getServicios().get(contratarServicio-1)  instanceof AmazonNormal)){
      amazonNormal.registrarUsuario(usuario);
      usuario.addServicio(amazonNormal);
    }else if (contratarServicio ==5 && !(usuario.getServicios().get(contratarServicio-1) instanceof AmazonPremium)){
      amazonPremium.registrarUsuario(usuario);
      usuario.addServicio(amazonPremium);
    }else if (contratarServicio ==6 && !(usuario.getServicios().get(contratarServicio-1)  instanceof SpotifyGratis)){
      spotifyGratis.registrarUsuario(usuario);
      usuario.addServicio(spotifyGratis);
    }else if (contratarServicio ==7 && !(usuario.getServicios().get(contratarServicio-1)  instanceof SpotifyPremium)){
      spotifyPremium.registrarUsuario(usuario);
      usuario.addServicio(spotifyPremium);
    }else if (contratarServicio ==8 && !(usuario.getServicios().get(contratarServicio-1)  instanceof YoutubeGratis)){
      youtubeGratis.registrarUsuario(usuario);
      usuario.addServicio(youtubeGratis);
    }else if (contratarServicio ==9 && !(usuario.getServicios().get(contratarServicio-1)  instanceof YoutubePremium)){
      youtubePremium.registrarUsuario(usuario);
      usuario.addServicio(youtubePremium);
    }else{
      System.out.println("Ya tienes contratado ese servicio");
    }


  }

  public String recomendacionesAleatoriasNetflix(int numeroDia){
    String [] recomendaciones = {"Te recomendamos ver nuestra nueva película original de Netflix 'Roma' ","Te recomendamos ver una serie original de Netflix 'Orange is the new Black',temporada final","Te recomendamos ver nuestra pelicula original de Netflix 'Shirkers' con una excelente crítica","Te recomendamos ver la serie 'Las Chicas del Cable' ","Te recomendamos ver la serie 'Stranger Things', nueva temporada "};
    return recomendaciones[numeroDia];
  }

  public String recomendacionesAleatoriasAmazon(int numeroDia){
    String [] recomendaciones = {"Te recomendamos ver la película de 'El hombre araña'" ,"Te recomendamos ver una serie original de AmazonPrime 'La maravillosa Sra. Maisel'","Te recomendamos ver la serie 'Doctor House' en AmazonPrime","Te recomendamos ver 'Jack Ryan' exclusivo por AmazonPrimer","Te recomendamos ver la película 'Batman Inicia' en AmazonPrime"};
    return recomendaciones[numeroDia];
  }

  public String recomendacionesAleatoriasSpotify(int numeroDia){
    String [] recomendaciones = {"Te "};
    return recomendaciones[numeroDia];
  }

  public void menu(){
      scanner  = new Scanner(System.in);
    númeroDías = 0;
    usuariosNetflixI = new ArrayList<Usuario>();
    System.out.println("----------------------Bienvenido al sistema de contratación de servicios----------------------\n");
    Usuario Alicia = new Usuario("Alicia",500);
    netflixIII = new NetflixI(usuariosNetflixI);

    netflixI.registrarUsuario(Alicia);
    Alicia.addServicio(netflixI);
    //cancelarSuscripción(Alicia);

    netflixI.notificarUsuarios();
    netflixI.setState(recomendacionesAleatoriasNetflix(númeroDías));
    netflixI.cobrar(Alicia);


    númeroDías++;

  }

  public static void main(String[] args) {
    Main menu = new Main();
    menu.menu();
}
}
