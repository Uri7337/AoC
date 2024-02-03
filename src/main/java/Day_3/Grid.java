package Day_3;

import java.awt.Point;

public class Grid {

    private House[][] map;

    public Grid(House[][] grid) {
        this.map = grid;
    }

    public House[][] getMap() {
        return map;
    }
    
    public House getHouse(Point p) {
        return map[p.x][p.y];
    }
    
    public void placeHouse(Point p) {
        map[p.x][p.y] = new House(new Point(p.x, p.y),1);
    }
    
    public void deliverGift(Point p) {
        map[p.x][p.y].addGift();
    }
    
    public boolean houseExist(Point p){
        boolean houseExist = false;
//        houseExist = getHouse(p).checkHouse(p);
        houseExist = getHouse(p) == null ? false : true ;
        return houseExist;
    }
    
    public Integer houseGiftReport(House[][] allHouseMap) {
        int nogifts = 0;
        int count = 0;
        
        for (int i = 0; i < allHouseMap.length; i++) {
            for (int j = 0; j < allHouseMap[i].length; j++) {
                nogifts = allHouseMap[i][j]==null ? 0 : allHouseMap[i][j].getNumberOfGifts();
                if(nogifts>=1){
                    count++;
                }
            }
            
        }
        return count;
    }
}
