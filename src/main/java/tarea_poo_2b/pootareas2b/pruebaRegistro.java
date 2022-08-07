/*
En un centro de video juegos se desea llevar el registro de puntajes de los jugadores en cada juego con el fin de premiar al mejor dentro de un tiempo determinado por gerencia (un mes o 1 año). Para ello le solicitan elaborar una propuesta, un programa en java que permita gestionar toda la información relacionada al problema.
    1.	Identificar al menos 3 clases dentro del planteamiento. Las clases deber ser abstracciones de objetos dentro del problema. Las clases deben contener variables, métodos, constructores.  Adicional identificar y codificar al menos un caso de herencia usando alguno de las 3 formas mediante: Interfaces, Clases normal o Clases Abstractas.
    2.	Codificar el ingreso de data para crear objetos de las clases programas. Ingreso de la información deberá ser mediante Scanner o algún otro método. Deber permitir, listar, agregar y eliminar de la lista de objetos presentes en sus clases (Ej. Si tengo la clase Jugador, me debe permitir: Crear un jugador, listar jugadores, buscar un jugador, eliminar un jugador).
A nivel de consola el programa Java debería estar ejecutándose, mostrando un listado de acciones disponibles, por ejemplo:
    1.	Listar jugadores.
    2.	Agregar un jugador.
    3.	Listas juegos.
    4.	Salir

NOTA* Las especificaciones no definidas en el planteamiento las deberán definir a su criterio que se adapten al contexto del ejercicio.
 */
package tarea_poo_2b.pootareas2b;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 *
 * @author svramirez
 */
public class pruebaRegistro {
    public static ArrayList <jugador> JugadorList = new ArrayList(5);
    public static int opcion;
    public static String var;
    
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calendar fecha = new GregorianCalendar();
           
        String juego;
        float score;
        String nombre;
        
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
         MenuPrincipal();       
        
    }  
    
            public static void coleccionJuegos() {
         
        ArrayList<String> coleccionJuegos = new ArrayList<>();

            coleccionJuegos.add("Pacman");
            coleccionJuegos.add("Tetris");
            coleccionJuegos.add("PES");

            String juego1 = coleccionJuegos.get(0);
            String juego2 = coleccionJuegos.get(1);
            String juego3 = coleccionJuegos.get(2);

            System.out.println("Juego: " + juego1);
            System.out.println("Juego: " + juego2);
            System.out.println("Juego: " + juego3);


            System.out.println("Listado de juegos");
                    for (int i = 0; i < coleccionJuegos.size(); i++) {
			String juego = coleccionJuegos.get(i);
			System.out.println("Juego: " + juego);
}
        }
    
    public static void IngresarJugador(){
        Scanner entrada = new Scanner(System.in);
        jugador _jugador= new jugador();
        System.out.println("\nIngrese la edad del jugador: ");_jugador.setEdad(entrada.nextInt());
        System.out.println("""
                           Ingrese la Nivel del jugador: 
                                Principiante 
                                Intermedio
                                Experto """);_jugador.setNivel(entrada.next());
        System.out.println("\nIngrese la Nombre del jugador: ");_jugador.setNombre(entrada.next());
        System.out.println("\nIngrese la Id del jugador: ");_jugador.setIdJugador(entrada.next());
        System.out.println("\nIngrese la Id de persona: ");_jugador.setIdPerson(entrada.next());           
        JugadorList.add(_jugador);
    }
    
      public static void MenuPrincipal(){
            Scanner entrada = new Scanner(System.in);
            System.out.println("""
                    Menu principal
                    Debe seguir los pasos del menú para probar su funcionamiento\n""");
            System.out.println("1. Ingresar jugador.\n");
            System.out.println("2. Ingresar puntaje.\n");
            System.out.println("3. Listar Jugadores.\n");
            System.out.println("4. Ver ranking.\n");           
            System.out.println("Ingrese la opcion: ");
            opcion = entrada.nextInt();            
            
            if (opcion==1){
                System.out.println("Lista de jugadores");
                System.out.println("\tDesea ingresar un nuevo jugador s/n: ");
                var = entrada.next();

                while(var.equals("s")){
                    IngresarJugador();
                    System.out.println("Desea ingresar un nuevo jugador s/n: "); var = entrada.next();
                }

                RegresarMenu("");
            }  
            if (opcion==2){
                System.out.println("Ingresar puntaje");
                System.out.println("Desea ingresar un nuevo puntaje s/n: ");
                 var = entrada.next();

                while(var.equals("s")){
                    IngresarPuntaje();
                    System.out.println("Desea ingresar un nuevo puntaje s/n: "); var = entrada.next();
                }

                RegresarMenu("");
            }
             if (opcion==3){
                System.out.println("Listar Jugadores");                
                if(JugadorList.size()>0){
                    System.out.println("Id Jugador\t\t\tNombre\t\t\tEdad");
                    for(int i=0; i<JugadorList.size()-1; i++){
                       jugador Silvia = JugadorList.get(i);
                       System.out.println(Silvia.getIdJugador()+"\t\t\t\t" + Silvia.getNombre() + "\t\t\t" + Silvia.getedad());
                       
                    }   
                    RegresarMenu("");
                }
                else{
                    RegresarMenu("No existen jugadores ingresados.");
                }
                        
            }else if (opcion==4) {
                System.out.println("Ranking");                             
                if(JugadorList.size()>0){
                    System.out.println("Id Jugador\t\t\tJuego\t\t\tNombre\t\t\tPuntuaje");
                    for(int i=0; i<JugadorList.size()-1; i++){
                       jugador Silvia = JugadorList.get(i);
                       System.out.println(Silvia.getIdJugador()+"\t\t\t\t" + Silvia.getJuego().getGameName() + "\t\t\t" + Silvia.getNombre() + "\t\t\t" + Silvia.getJuego().getGameTop());
                       
                    }   
                    RegresarMenu("");
                }
                else{
                    RegresarMenu("No existen jugadores ingresados.");
                }
                        
            }
            
            
       }
    public static void IngresarPuntaje(){
        Scanner entrada = new Scanner(System.in);
        jugador _jugador= new jugador();
        games juegos = new games();
        
        System.out.println("\nIngrese el id jugador: ");_jugador.setIdJugador(entrada.next());
        System.out.println("""
                           Ingrese el nombre del juego: 
                           Pacman
                           Tetris
                           PES
                           """);juegos.setGameName(entrada.next());
        System.out.println("\nIngrese el puntaje del jugador: ");juegos.setGameTop(entrada.nextInt());         
        
        for(int i=0; i<JugadorList.size(); i++){
                       jugador Silvia = JugadorList.get(i);
                       if (Silvia.idJugador.equals(_jugador.getIdJugador())) {
                           Silvia.setJuego(juegos);
                       }
                      
        }
        
        JugadorList.add(_jugador);
    }      
      public static void RegresarMenu(String msg){
          Scanner entrada = new Scanner(System.in);
              System.out.println(msg + " Desea regresar al menu principal s/n: ");
                var = entrada.next();
                if(var.equals("s")){
                    MenuPrincipal();
                }
}
    
}
