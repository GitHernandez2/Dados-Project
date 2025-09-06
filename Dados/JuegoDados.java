
/**
 * Write a description of class JuegoDados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JuegoDados
{
    // instance variables - replace the example below with your own
    private Dado d1;
    private Dado d2;
    private Dado d3;
    private DadoGrafico dado1;
    private DadoGrafico dado2;
    private DadoGrafico dado3;

    public JuegoDados()
    {
        d1=new Dado();
        d2=new Dado();
        d3=new Dado();
        
    }
    public String toString(){
        return("Dado1: "+d1.getCaraActual()+" Dado2: "+d2.getCaraActual()+" Dado3: "+d3.getCaraActual());
    }
    
    public void lanzar3Dados(){
        d1.lanzar();
        d2.lanzar();
        d3.lanzar();
    }
    public boolean sonLos3Iguales(){
        if(d1.getCaraActual()==d2.getCaraActual() && d1.getCaraActual()==d3.getCaraActual()){
        return true;
        }
        else{
            return false;
        }
    }
    public int suma3Dados(){
        return(d1.getCaraActual()+d2.getCaraActual()+d3.getCaraActual());
    }
    public boolean ganador(){
        if(suma3Dados()>14 || sonLos3Iguales()){
            return true;
        }
        else{
            return false;
        }
    }
    public void jugar(){
        lanzar3Dados();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("La suma es: "+suma3Dados());
        String resultado=ganador()? "Felicidades ganaste":"Has perdido";
        System.out.println(resultado);
        
        dado1=new DadoGrafico(10,10);
        dado1.dibujarCara(d1.getCaraActual());
        dado2=new DadoGrafico(120,10);
        dado2.dibujarCara(d2.getCaraActual());
        dado3=new DadoGrafico(230,10);
        dado3.dibujarCara(d3.getCaraActual());
    }
}
