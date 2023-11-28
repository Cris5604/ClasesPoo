import  Controller.*;

public class Main{
    public static void main(String[] args) {
        String directorio= "./Data/Usuarios.csv";
        Data data = new Data();
        data.lecturaUsuarios(directorio);
        data.imprimirUsuarios();
        Usuario aux = new Usuario("16","Carlos2","Carlos@gmail.com","123456");
        datos.agregarUsuario(aux);
        
    }
}