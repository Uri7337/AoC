
package Day_23;


public class Spot { 
    private Znak znak; 
    private int x; 
    private int y;
    private boolean footprint;
    
    public Spot(Znak znak, int x, int y, boolean footprint) {
        this.znak = znak;
        this.x = x;
        this.y = y;
        this.footprint = footprint;
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

    public boolean getFootprint() {
        return footprint;
    }

    public void setFootprint(boolean footprint) {
        this.footprint = footprint;
    }
    
    
} 
