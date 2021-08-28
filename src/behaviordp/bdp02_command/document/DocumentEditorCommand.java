package behaviordp.bdp02_command.document;

public class DocumentEditorCommand implements Command {

	Document document;
	String text;
	
	public DocumentEditorCommand(Document document, String text) {
		// TODO Auto-generated constructor stub
		this.document = document;
		this.text = text;
		this.document.write(text);
	}
	
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		document.eraseLast();
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		document.write(text);
	}

}
