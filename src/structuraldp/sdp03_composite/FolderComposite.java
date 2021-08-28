package structuraldp.sdp03_composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileComponent {

	private List<FileComponent> files = new ArrayList<>();
	
	public FolderComposite(List<FileComponent> files) {
		// TODO Auto-generated constructor stub
		this.files = files;
	}
	
	@Override
	public void showProperty() {
		// TODO Auto-generated method stub
		for (FileComponent file : files) {
            file.showProperty();
        }
	}

	@Override
	public long totalSize() {
		// TODO Auto-generated method stub
		long total = 0;
        for (FileComponent file : files) {
            total += file.totalSize();
        }
        return total;
	}

}
