package creationaldp.cdp03_abstactfactory;

public class WoodFactory extends FurnitureAbstractFactory{

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new WoodChair();
	}

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new WoodTable();
	}

}
