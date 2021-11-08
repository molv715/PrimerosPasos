import java.util.*;

public class EntradaEjemplo1V14 {
    public static void main(String[] args){
        System.out.println("introduce tu nombre, por favor");
        Scanner entrada=new Scanner(System.in);
        String nombre_usuario=entrada.nextLine();
        System.out.println("hola "+nombre_usuario);
    }
}
