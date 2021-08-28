package creationaldp.cdp05_builder_02;

/* BUILDER OBJECT IMMUTABLE
 * 
 * Với Product class
 * 	- Constructor là private, điều này có nghĩa là class này không thể gọi khởi tạo trực tiếp từ bên ngoài.
 * 	- Tất cả các thuộc tính đều là private final, vì vậy nó chỉ được gán giá trị trong constructor và nó chỉ
 * 	có thể được cung cấp các phương thức getter().
 * 	- Việc khởi tạo đối tượng chỉ có thể thông qua Builder
 * 
 * Với Builder Class
 * 	- Tạo một static nested class (đây được gọi là builder class) và copy tất cả các tham số từ class bên ngoài vào.
 * 	Chúng ta nên đặt tên class này theo định dạng: [tên class] + Builder. Ví dụ class là BankAccount thì builder class
 *  sẽ là BankAccountBuilder.
 * 	- Class Builder có một hàm khởi tạo public với tất cả các thuộc tính bắt buộc.
 * 	- Class Builder có các method setter() cho các tham số tùy chọn.
 *	- Cung cấp method build() trong Class Builder để trả về đối tượng mà client cần.
 */


/*
 * Một tài khoản ngân hàng bao gồm các thông tin: Tên chủ tài khoản, số tài khoản, địa chỉ email, 
 * nhận thông báo, sử dụng mobile banking. Một tài khoản được tạo phải có tên chủ tài khoản và số 
 * tài khoản. Các thông tin khác tùy theo nhu cầu của khách hàng có thể đăng ký sử dụng.
 */

public class BankAccount {
 
    private final String name; // required
    private final String accountNumber; // required
    private final String address;
    private final String email;
    private final boolean newsletter;
    private final boolean mobileBanking;
 
    private BankAccount(String name, String accountNumber, String address, String email, boolean newsletter,
            boolean mobileBanking) {
        super();
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.email = email;
        this.newsletter = newsletter;
        this.mobileBanking = mobileBanking;
    }
    
    
 
    // Builder class
    public static class BankAccountBuilder {
         
        private String name; // required
        private String accountNumber; // required
        private String address;
        private String email;
        private boolean newsletter;
        private boolean mobileBanking;
 
        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }
 
        public BankAccountBuilder withAddress(String address) {
            this.address = address;
            return this;
        }
 
        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }
 
        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }
 
        public BankAccountBuilder wantMobileBanking(boolean mobileBanking) {
            this.mobileBanking = mobileBanking;
            return this;
        }
 
        public BankAccount build() { 
            validateUserObject();
             
            BankAccount bankAccount = new BankAccount(
                    this.name, this.accountNumber, 
                    this.address, this.email,
                    this.newsletter, this.mobileBanking);
             
            return bankAccount;
        }
 
        private void validateUserObject() {
            // Do some basic validations to check
            if (this.newsletter && email == null) {
                throw new IllegalArgumentException("Email can't be null when client want to receive the new letter");
            }
        }
    }
 
    
    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", address=" + address + ", email="
                + email + ", newsletter=" + newsletter + ", mobileBanking=" + mobileBanking + "]";
    }
    
    
    //Getter() methods
    public String getName() {
    	return name;
    }
    
    public String getAccountNumber() {
    	return accountNumber;
    }
 
    public String getAddress() {
    	return address;
    }
    
}
