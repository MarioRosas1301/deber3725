package clases;

public class Clase_de_prueba {
    //Declaramos las variables
   int ancho;
   int alto;
   int profundo;
        
       public Clase_de_prueba(){
           
       }
       public Clase_de_prueba(int ancho,int alto,int profundo){
       //Realiza la operacion de calcular volumen
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
       }
       public int Clase_de_prueba(){
       int resul = this.ancho*this.alto*this.profundo;
       return resul;
       }
   }

