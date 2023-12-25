package Day_23;

public class Znak {
//    '#':0              
//    '.':1                
//    '^':2                
//    '>':3                
//    'v':4               
//    '<':5              
    int z = 0;
    
    public Znak(Character znak) {
        switch (znak) {
            case '#':
                z=0;
                break;
            case '.':
                z=1;
                break;
            case '^':
                z=2;
                break;
            case '>':
                z=3;
                break;
            case 'v':
                z=4;
                break;
            case '<':
                z=5;
                break;
        }
    }

}
