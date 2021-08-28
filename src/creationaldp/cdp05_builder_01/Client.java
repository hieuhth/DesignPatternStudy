package creationaldp.cdp05_builder_01;

import creationaldp.cdp05_builder_01.Contants.*;


/* 1 builder gồm:
 * - Product: đối tượng cần khởi tạo, phức tạp, nhiều thuộc tính. Order class
 * - Builder: Interface/abstract class khai báo các phương thức cần thiết để tạo đối tượng Product. OrderBuilder class
 * - Specific Builder: các lớp cụ thể implement Builder, chi tiết để tạo ra Product. FastFoodOrderBuilder class.
 */

/*
 * - Hỗ trợ, loại bớt việc phải viết nhiều constructor.
 * - Code dễ đọc, dễ bảo trì hơn khi số lượng thuộc tính (propery) bắt buộc để tạo một object từ 4 hoặc 5 propery.
 * - Giảm bớt số lượng constructor, không cần truyền giá trị null cho các tham số không sử dụng.
 * - Ít bị lỗi do việc gán sai tham số khi mà có nhiều tham số trong constructor: bởi vì người dùng đã biết được
 * chính xác giá trị gì khi gọi phương thức tương ứng.
 * - Đối tượng được xây dựng an toàn hơn: bởi vì nó đã được tạo hoàn chỉnh trước khi sử dụng.
 * - Cung cấp cho bạn kiểm soát tốt hơn quá trình xây dựng: chúng ta có thể thêm xử lý kiểm tra ràng buộc trước khi
 * đối tượng được trả về người dùng.
 * - Có thể tạo đối tượng immutable.
 * 
 */


public class Client {
	public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
