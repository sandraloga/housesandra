/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle pradera;
    private Person persona;
    private Circle cara;
    private Square ojo1;
    private Square ojo2;
    private Circle boca;
    
 

    /**
     * Constructor for objects of class Picture
     */
    public void mueveObjetos()
    {
       wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);
        sun.changeSize(80);
        sun.makeVisible();
        
        pradera = new Circle();
        pradera.changeColor("green");
        pradera.moveHorizontal(-550);
        pradera.moveVertical(160);
        pradera.changeSize(1200);
        pradera.makeVisible();
        
        sun.slowMoveVertical(160);
        setBlackAndWhite();
        pradera.changeColor("black");
        
        persona = new Person();
        persona.moveHorizontal(-265);
        persona.moveVertical(30);
        persona.makeVisible();
        persona.slowMoveHorizontal(140); 
        
        cara = new Circle();
        cara.changeSize(80);
        cara.moveHorizontal(-150);
        cara.moveVertical(-70);
        cara.makeVisible();
        
        ojo1 = new Square();
        ojo1.changeSize(10);
        ojo1.changeColor("black");
        ojo1.moveHorizontal(-210);
        ojo1.moveVertical(-80);
        ojo1.makeVisible();
        
        ojo2 = new Square();
        ojo2.changeSize(10);
        ojo2.changeColor("black");
        ojo2.moveHorizontal(-185);
        ojo2.moveVertical(-80);
        ojo2.makeVisible();
        
        boca = new Circle();
        boca.changeColor("red");
        boca.changeSize(20);
        boca.moveHorizontal(-120);
        boca.moveVertical(-20);
        boca.makeVisible();
        
        ojo2.slowMoveHorizontal(30);
        ojo1.slowMoveHorizontal(-30);
        boca.slowMoveVertical(30);
        ojo2.slowMoveHorizontal(-30);
        ojo1.slowMoveHorizontal(30);
        boca.slowMoveVertical(-30);
        
        
    }  
    public void movePerson()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);
        sun.changeSize(80);
        sun.makeVisible();
        
        pradera = new Circle();
        pradera.changeColor("green");
        pradera.moveHorizontal(-550);
        pradera.moveVertical(160);
        pradera.changeSize(1200);
        pradera.makeVisible();
        
        sun.slowMoveVertical(160);
        setBlackAndWhite();
        pradera.changeColor("black");
        
        persona = new Person();
        persona.moveHorizontal(-265);
        persona.moveVertical(30);
        persona.makeVisible();
        persona.slowMoveHorizontal(140);
        
    }  
  public void creaCara()
     {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);
        sun.changeSize(80);
        sun.makeVisible();
        
        pradera = new Circle();
        pradera.changeColor("green");
        pradera.moveHorizontal(-550);
        pradera.moveVertical(160);
        pradera.changeSize(1200);
        pradera.makeVisible();
        
        sun.slowMoveVertical(160);
        setBlackAndWhite();
        pradera.changeColor("black");
        
        persona = new Person();
        persona.moveHorizontal(-265);
        persona.moveVertical(30);
        persona.makeVisible();
        persona.slowMoveHorizontal(140); 
        
        cara = new Circle();
        cara.changeSize(80);
        cara.moveHorizontal(-150);
        cara.moveVertical(-70);
        cara.makeVisible();
        
        ojo1 = new Square();
        ojo1.changeSize(10);
        ojo1.changeColor("black");
        ojo1.moveHorizontal(-210);
        ojo1.moveVertical(-80);
        ojo1.makeVisible();
        
        ojo2 = new Square();
        ojo2.changeSize(10);
        ojo2.changeColor("black");
        ojo2.moveHorizontal(-185);
        ojo2.moveVertical(-80);
        ojo2.makeVisible();
        
        boca = new Circle();
        boca.changeColor("red");
        boca.changeSize(20);
        boca.moveHorizontal(-120);
        boca.moveVertical(-20);
        boca.makeVisible();
    } 
  
  public void moveSun()
  
    {
         wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);
        sun.changeSize(80);
        sun.makeVisible();
        
        pradera = new Circle();
        pradera.changeColor("green");
        pradera.moveHorizontal(-550);
        pradera.moveVertical(160);
        pradera.changeSize(1200);
        pradera.makeVisible();
        
        sun.slowMoveVertical(160);
        setBlackAndWhite();
        pradera.changeColor("black");
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);
        sun.changeSize(80);
        sun.makeVisible();
        
        pradera = new Circle();
        pradera.changeColor("green");
        pradera.moveHorizontal(-550);
        pradera.moveVertical(160);
        pradera.changeSize(1200);
        pradera.makeVisible();
        
        
        
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
