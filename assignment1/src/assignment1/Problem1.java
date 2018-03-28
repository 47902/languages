package assignment1;
import stanford.karel.*;

public class Problem1 extends Karel { 
public void run() {
    for(int i=0;i<2;i++) {
    move();
 }
    for(int i=0;i<3;i++) {
        turnLeft();
    }
    move();
  
        turnLeft();
    
    move();
    pickBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        for(int i=0;i<3;i++) {
            turnLeft();
        }
        move();
        putBeeper();
        for(int i=0;i<3;i++) {
            turnLeft();}
        
}}

	
	

	





