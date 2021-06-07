
package clases;


public class Clase_Cuadrilatero {
    public static int resultado(int a){
        int resul=a*a;
        return resul;
    }
    public static int resultado2(int b){
        int result=4*b;
        return result;
    }
    public static void main(String[] args){
        int a=10;
        int b=10;
        int res = resultado(a);
        int res2 = resultado2(b);
        System.out.println("El area del cuadrilatero es: "+res);
        System.out.println("El perimetro del cuadrilatero es: "+res2);
    }   
}
