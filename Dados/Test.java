import java.util.*;

/**
 * Comprobacion del uso de ArrayList.
 * 
 * @author (AEHE) 
 * @version (1)
 */
public class Test
{
    public static void main(){
        ArrayList <Dado> misDados=new ArrayList();
        //Random rmd=new Random();
        for(int i=0; i<5; i++){
            misDados.add(new Dado(6));
        }
        
        for(Dado d:misDados){
            System.out.println(d);
        }
        
        System.out.println("Con la lambda:");
        misDados.forEach(d->System.out.println(d));
    }
}
