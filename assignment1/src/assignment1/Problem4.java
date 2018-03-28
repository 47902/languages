package assignment1;
import stanford.karel.SuperKarel;

public class Problem4 extends SuperKarel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		while(frontIsClear()) {
			
			firstrow();
		
		if(frontIsClear()) {
			
			secondrow();
		}turnRight();
		if(frontIsClear()) {

		  move();
		  turnRight();}
		  
		}
	}
	
	public void firstrow() {
		putBeeper();
		coomoncode();
		turnLeft();
		}
		public void secondrow() {
		if(beepersPresent()) {
			move();
			
		}
		else {
			move();
			putBeeper();
		}
		turnLeft();
        if(beepersPresent())
        {
        	coomoncode();
                 	
        }		
        else {
        	move();
        	putBeeper();
            coomoncode();
              }
        }
		public void coomoncode() {
			while(frontIsClear()) {
				move();
	  			if(frontIsClear()) {
	  				move();
				
				putBeeper();
		}
		}
		}}