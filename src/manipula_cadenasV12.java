public class manipula_cadenasV12 {
    public static void main(String[] args){
        String frase="hoy es un estupendo dia para aprender a programar en java";
        //usaremos substring
        String frase_resumen=frase.substring(29,57);
        System.out.println(frase_resumen);

        String alumno1="hola",alumno2="Hola";

        System.out.println(alumno1.equals(alumno2));

        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
