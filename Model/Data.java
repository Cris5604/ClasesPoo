package Model;
import java.io.*;
import java.util.*;

public class Data {
    private ArrayList<Usuario> listaUsuarios;
    public Data(){
        listaUsuarios=new Arraylist<>();

    }
    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    public void eliminarUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
    }
    public void eliminarUsuario(String id){
        Usuario aux =buscarUsuario(id);
        eliminarUsuario(aux);
    }
    public Usuario buscarUsuario(String id){
        Usuario aux=new Usuario();
        for(Usuario u : listaUsuarios){
            if(u.getId()==id){
                aux=u;

            }

        }
        return aux;
    }
    public void lecturaUsuarios(String directorio){
        try(BufferedReader br = new BufferedReader(new FileReader(directorio))){
            br.readLine();
            String linea;
            while((linea=br.readLine())!=null){
                String [] datos=linea.split(",");
                Usuario aux = new Usuario(datos[0],datos[1],datos[2],datos[3]);
                listaUsuarios.add(aux);
            }
            br.close();
        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        }
    }
    public void escrituraUsuarios(String directorio){
        try(BufferedReader br = new BufferedReader(new FileWriter(directorio))){
            bw.write("ID,Nombre,Correo,Contraeña\n");
            for(Usuario u:listaUsuarios){
                bw.write(u.toString());
            }
            bw.close();
        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        }
    }
    public void imprimirUsuarios(){
        for(Usuario u:listaUsuarios){
            System.err.println(u.toString());
        }
    }
}
     