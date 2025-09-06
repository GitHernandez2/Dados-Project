import java.util.*;

/**
 * Write a description of class Dado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dado
{
    // instance variables - replace the example below with your own
    private int caras;
    private String color;
    private String colorDados;
    private int caraActual;

    public Dado()
    {
        caras=6;
    }
    public Dado(int cantidadCaras){
        caras=cantidadCaras;
    }
    public String toString(){
        return("Dado1: "+caraActual);
    }
    public int getCaras(){
        return caras;
    }
    public int lanzar(){
        Random rmd=new Random();
        caraActual=rmd.nextInt(caras)+1;
        return caraActual;
        
 
    }
    public int getCaraActual(){
        return caraActual;
    }

}
