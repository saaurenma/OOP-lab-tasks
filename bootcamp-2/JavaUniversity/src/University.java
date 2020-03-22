
public class University {
	
	// other classes dont need to access the unit array directly, they can
	// access it via the methods
	private Unit[] unitArray = new Unit[3];
	
	public void createUnits() {
		
		// Q: do we make this method able to handle more than 3 units?
		Unit unit1 = new Unit("FIT2468","Databases");
		Unit unit2 = new Unit("FIT3692","Security");
		Unit unit3 = new Unit("FIT4826","Networking");
		
		unitArray[0] = unit1;
		unitArray[1] = unit2;
		unitArray[2] = unit3;
		
		
	}
	
	
	public void displayUnits() {
		   
        for (int i = 0; i < unitArray.length; i++) {
        	
            String description = unitArray[i].getUnitDescription(); 
            System.out.print(description+"\n");
            
        }
        
	}

    public void printStatus() {        
    	
        System.out.println("Welcome to Java University");
        createUnits();
        displayUnits();
        System.out.println("Thank you for using Java University");

    }
    
}
