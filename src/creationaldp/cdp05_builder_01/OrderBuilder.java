package creationaldp.cdp05_builder_01;

import creationaldp.cdp05_builder_01.Contants.*;

public interface OrderBuilder {
	OrderBuilder orderType(OrderType orderType);
	 
    OrderBuilder orderBread(BreadType breadType);
 
    OrderBuilder orderSauce(SauceType sauceType);
 
    OrderBuilder orderVegetable(VegetableType vegetableType);
 
    Order build();
}
