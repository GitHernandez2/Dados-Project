
/**
 * Write a description of class DadoGrafico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DadoGrafico
{
    // instance variables - replace the example below with your own
    private Square cuadrado;
    private Circle c1;
    private Circle c2;
    private Circle c3;
    private Circle c4;
    private Circle c5;
    private Circle c6;

    /**
     * Constructor for objects of class DadoGrafico
     */
    public DadoGrafico()
    {
        c1=new Circle();
        c2=new Circle();
        c3=new Circle();
        c4=new Circle();
        c5=new Circle();
        c6=new Circle();
        cuadrado=new Square(100,100,150,150,"yellow");
        
    }
    public DadoGrafico(int xPosition, int yPosition){
        c1=new Circle();
        c2=new Circle();
        c3=new Circle();
        c4=new Circle();
        c5=new Circle();
        c6=new Circle();
        cuadrado=new Square(100,100,xPosition,yPosition,"yellow");
    }
    
    public void dibujarCara(int cara){
        switch(cara){
            case 1:
                c1=new Circle(20,0,0,"green");
                int xPosition=cuadrado.getXPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                int yPosition=cuadrado.getYPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                
                c1.moveHorizontal(xPosition);
                c1.moveVertical(yPosition);
                cuadrado.makeVisible();
                c1.makeVisible();
                break;
            case 2:
                c1=new Circle(20,0,0,"green");
                c2=new Circle(20,0,0,"green");
                xPosition=cuadrado.getXPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                yPosition=cuadrado.getYPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                
                c1.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c1.moveVertical(yPosition-cuadrado.getHeight()/4);
                c2.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c2.moveVertical(yPosition+cuadrado.getHeight()/4);
                cuadrado.makeVisible();
                c1.makeVisible();
                c2.makeVisible();
                break;
            case 3:
                c1=new Circle(20,0,0,"green");
                c2=new Circle(20,0,0,"green");
                c3=new Circle(20,0,0,"green");
                xPosition=cuadrado.getXPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                yPosition=cuadrado.getYPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                
                c1.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c1.moveVertical(yPosition-cuadrado.getHeight()/4);
                c2.moveHorizontal(xPosition);
                c2.moveVertical(yPosition);
                c3.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c3.moveVertical(yPosition+cuadrado.getHeight()/4);
                cuadrado.makeVisible();
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                break;
            case 4:
                c1=new Circle(20,0,0,"green");
                c2=new Circle(20,0,0,"green");
                c3=new Circle(20,0,0,"green");
                c4=new Circle(20,0,0,"green");
                xPosition=cuadrado.getXPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                yPosition=cuadrado.getYPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                
                c1.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c1.moveVertical(yPosition-cuadrado.getHeight()/4);
                c2.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c2.moveVertical(yPosition-cuadrado.getHeight()/4);
                c3.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c3.moveVertical(yPosition+cuadrado.getHeight()/4);
                c4.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c4.moveVertical(yPosition+cuadrado.getHeight()/4);
                cuadrado.makeVisible();
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                c4.makeVisible();
                break;
            case 5:
                c1=new Circle(20,0,0,"green");
                c2=new Circle(20,0,0,"green");
                c3=new Circle(20,0,0,"green");
                c4=new Circle(20,0,0,"green");
                c5=new Circle(20,0,0,"green");
                xPosition=cuadrado.getXPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                yPosition=cuadrado.getYPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                
                c1.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c1.moveVertical(yPosition-cuadrado.getHeight()/4);
                c2.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c2.moveVertical(yPosition-cuadrado.getHeight()/4);
                c3.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c3.moveVertical(yPosition+cuadrado.getHeight()/4);
                c4.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c4.moveVertical(yPosition+cuadrado.getHeight()/4);
                c5.moveHorizontal(xPosition);
                c5.moveVertical(yPosition);
                cuadrado.makeVisible();
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                c4.makeVisible();
                c5.makeVisible();
                break;
            case 6:
                c1=new Circle(20,0,0,"green");
                c2=new Circle(20,0,0,"green");
                c3=new Circle(20,0,0,"green");
                c4=new Circle(20,0,0,"green");
                c5=new Circle(20,0,0,"green");
                c6=new Circle(20,0,0,"green");
                xPosition=cuadrado.getXPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                yPosition=cuadrado.getYPosition()+(cuadrado.getHeight()-c1.getDiameter())/2;
                
                c1.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c1.moveVertical(yPosition-cuadrado.getHeight()/4);
                c2.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c2.moveVertical(yPosition-cuadrado.getHeight()/4);
                c3.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c3.moveVertical(yPosition+cuadrado.getHeight()/4);
                c4.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c4.moveVertical(yPosition+cuadrado.getHeight()/4);
                c5.moveHorizontal(xPosition-cuadrado.getHeight()/4);
                c5.moveVertical(yPosition);
                c6.moveHorizontal(xPosition+cuadrado.getHeight()/4);
                c6.moveVertical(yPosition);
                cuadrado.makeVisible();
                c1.makeVisible();
                c2.makeVisible();
                c3.makeVisible();
                c4.makeVisible();
                c5.makeVisible();
                c6.makeVisible();
                break;
            default:
                break;
        }
        
    }
}
