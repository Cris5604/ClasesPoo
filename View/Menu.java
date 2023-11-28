package View;

import java.util.*;
import Model.Usuario;

public class Menu {

     public void imprimirUsuarios(ArrayList<String> listaUsuarios){
        for(String u:listaUsuarios){
            System.out.println(u);
        }
     }
     public void menuInicial(){
        int opcion;
        boolean menu = true;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("1. imprimir.usuarios.");
            System.out.println("2.salir.");
            opcion=sc.nextInt();
            switch ( opcion) {
                case 1:
                    imprimirUsuarios(listaUsuarios);
                    break;
                case 2:
                     menu=false;+ 
                default:
                    break;
            }
        }while(menu);
     }
}