public class manipula_cadenasV11 {
    public static void main(String[] args){
        String nombre="manfred";
        System.out.println("mi nombre es " + nombre);

        System.out.print("mi nombre tiene " + nombre.length()+ " letras");
        System.out.println(" y la primera letra de mi nombre es "+nombre.charAt(0));

        int ultLetra=nombre.length();
        System.out.println("la ultima letra es la "+nombre.charAt(ultLetra-1));



    }
}
