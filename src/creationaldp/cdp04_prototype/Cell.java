package creationaldp.cdp04_prototype;

public class Cell implements Cloneable {
	private String color;
    private String coordinate;
 
    public Cell(String color) {
        this.color = color;
    }
    
    public void setCoordinate(String xy) {
    	this.coordinate = xy;
    }
    
    
 
    @Override
	protected Cell clone() {
		// TODO Auto-generated method stub
    	try {
            return (Cell) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
	}

	@Override
    public String toString() {
        return "Cell " + coordinate + " [color=" + color + "]";
    }
}
