
package Day_23;


public class Spot { 
    private Znak znak; 
    private int x; 
    private int y; 
  
    public Spot(int x, int y, Znak znak) 
    { 
        this.setZnak(znak); 
        this.setX(x); 
        this.setY(y); 
    } 
  
    public Znak getZnak() 
    { 
        return this.znak; 
    } 
  
    public void setZnak(Znak z) 
    {
        this.znak = z; 
    } 
  
    public int getX() 
    { 
        return this.x; 
    } 
  
    public void setX(int x) 
    { 
        this.x = x; 
    } 
  
    public int getY() 
    { 
        return this.y; 
    } 
  
    public void setY(int y) 
    { 
        this.y = y; 
    } 
} 
