package structuraldp.sdp01_adapter;

public class TranslatorAdapter implements VietnameseTarget {

	private JapaneseAdaptee adaptee;
	
	public TranslatorAdapter(JapaneseAdaptee adaptee) {
		// TODO Auto-generated constructor stub
		this.adaptee = adaptee;		
	}
	
	
	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Reading Words ...");
        System.out.println(message);
        String vietnameseWords = this.translate(message);
        System.out.println("Sending Words ...");
        adaptee.receive(vietnameseWords);
	}

	private String translate(String message) {
		System.out.println("Translated!");
        return "Message in Japanese " + message;
	}
	
}
