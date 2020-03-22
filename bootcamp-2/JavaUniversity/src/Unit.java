
public class Unit {
	
    public String unitName;
    public String unitCode;
    public String unitDescription;
    
    public Unit(String code, String name) {
    	unitName = name;
    	unitCode = code;
    	unitDescription = code + " " + name; 
    }
	
    
    public String getUnitDescription() {
        return unitDescription;
    }
	
}
