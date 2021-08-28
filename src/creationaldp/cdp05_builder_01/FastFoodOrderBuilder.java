package creationaldp.cdp05_builder_01;

import creationaldp.cdp05_builder_01.Contants.BreadType;
import creationaldp.cdp05_builder_01.Contants.OrderType;
import creationaldp.cdp05_builder_01.Contants.SauceType;
import creationaldp.cdp05_builder_01.Contants.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {

	private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;
	
	@Override
	public OrderBuilder orderType(OrderType orderType) {
		// TODO Auto-generated method stub
		this.orderType = orderType;
		return this;
	}

	@Override
	public OrderBuilder orderBread(BreadType breadType) {
		// TODO Auto-generated method stub
		this.breadType = breadType;
		return this;
	}

	@Override
	public OrderBuilder orderSauce(SauceType sauceType) {
		// TODO Auto-generated method stub
		this.sauceType = sauceType;
		return this;
	}

	@Override
	public OrderBuilder orderVegetable(VegetableType vegetableType) {
		// TODO Auto-generated method stub
		this.vegetableType = vegetableType;
		return this;
	}

	@Override
	public Order build() {
		// TODO Auto-generated method stub
		Order order = new Order(orderType, breadType, sauceType, vegetableType);
		return order;
	}

}
