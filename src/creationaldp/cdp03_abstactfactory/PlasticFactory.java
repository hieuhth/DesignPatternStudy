package creationaldp.cdp03_abstactfactory;

public class PlasticFactory extends FurnitureAbstractFactory{

	@Override
	public Chair createChair() {
		// TODO Auto-generated method stub
		return new PlasticChair();
	}

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new PlasticTable();
	}

}
