package assignment1;
import stanford.karel.SuperKarel;

public class Problem3 extends SuperKarel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void run()
	{
		putBeeper();
	 while(frontIsClear())
	 {
		 move();
		 putBeeper();		 
	 }
	 
	 pickingbeeper();
	 while(beepersPresent())
	 {
		findingmid(); 
	 }
	 turnAround();
	 move();
	 putBeeper();
	 
	
	}
	 public void pickingbeeper()
	 {
		turnAround();
		pickBeeper();
		while(frontIsClear())
		{
			move();
		}
		
		pickBeeper();
		turnAround();
        move();
	 }
	 public void findingmid()
	 {
        
        while(beepersPresent())
        {
          move();
        }
        turnAround();
        move();
        pickBeeper();
        move();
        }
		
	}

