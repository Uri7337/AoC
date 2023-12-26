package Day_23;

public class Znak {
//    '#':0              
//    '.':1                
//    '^':2                
//    '>':3                
//    'v':4               
//    '<':5
//    'S':6
//    'O':7
//    'F':8
    int z = 0;
    char zn;
    
    public Znak(Character znak) {
        switch (znak) {
            case '#':
                z=0;
                zn = '#';
                break;
            case '.':
                z=1;
                zn = '.';
                break;
            case '^':
                z=2;
                zn = '^';
                break;
            case '>':
                z=3;
                zn = '>';
                break;
            case 'v':
                z=4;
                zn = 'v';
                break;
            case '<':
                z=5;
                zn = '<';
                break;
            case 'S':
                z=6;
                zn = 'S';
                break;
            case 'O':
                z=7;
                zn = 'O';
                break;
            case 'F':
                z=8;
                zn = 'F';
                break;
        }
    }

}
