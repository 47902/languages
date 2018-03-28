package assignment1;

import stanford.karel.SuperKarel;

public class Problem2 extends SuperKarel { 
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void run() {
	while(frontIsClear()) {
	conditions();
	loops();
	conditions();
	loops();
	}
	}

public void checkbeeper()
{
	turnLeft();
	if(noBeepersPresent())
	{
		putBeeper();
	}
	while(frontIsClear())
	{  move();
	   if(noBeepersPresent())
	   {
		putBeeper();	
	   }
	}
}
public void conditions() {
	checkbeeper();
	turnRight();
	if(frontIsClear()) {
	loops();
	
	turnAround();
	checkbeeper();
	turnLeft();}
	

}
public void loops() {
	for(int i=0;i<3;i++) {
		move();
		
	}
}
}