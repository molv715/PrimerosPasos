public class DeclaracionesOperadoresVideo7 {
    public static void main(String[] args) {
        int a=5;//declaramos e iniciamos variable en una solo linea
        int b;//declaramos
        b=7;//iniciamos

        int c=b+a;  // declaramos "c" en la cual almacenamos el valor de "a" + "b"
        c++;//incrementamos en uno al valor de c

        System.out.println(c);// usamos println imprime una linea despues de imprimir el dato
        // comportamiento INTELLISENSE a las sugerencias q te brinda el programa

        c+=6;// incrementamos en 6 el valor de c
        System.out.println(c);//se imprimira el valor de c final

        int d=b/a;// este valor es una division con decimal
        //java por defecto desecha los decimales y solo toma el entero (5,99999 sera 5)
        //si desea trabajar con decimales solo se debera usar variables del mismo dato
        double b1=7;
        double a1=5;
        double f=b1/a1;
         // todas las variables son double si no fuera el caso nos daria error
        System.out.println(f);


    }
}
