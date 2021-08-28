package structuraldp.sdp01_adapter;

public class VietnameseClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
		client.send("Message");
	}

}
