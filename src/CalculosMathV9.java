public class CalculosMathV9 {
    public static void main(String[] args) {
        double raiz=Math.sqrt(10);//el metodo te devuelve un double
        // se debe guardar este dati=o en un double tb
        System.out.println(raiz);

        raiz=5.85;
        int resultado=(int)Math.round(raiz);//refundicion a un double a int (int)
        System.out.println(resultado);

        raiz=5;
        int raiz1=3;
        int pow=(int)Math.pow(raiz,(double)raiz1);
        // tranformamos a double dentro del metodo Mat.pow
        System.out.println(pow);


    }
}
