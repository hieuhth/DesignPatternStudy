package creationaldp.cdp03_abstactfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
		 
        Chair chair = factory.createChair();
        System.out.println(chair.create());
 
        Table table = factory.createTable();
        System.out.println(table.create());
        
        factory =  FurnitureFactory.getFactory(MaterialType.WOOD);
        chair = factory.createChair();
        System.out.println(chair.create());
 
        table = factory.createTable();
        System.out.println(table.create());
	}

}
