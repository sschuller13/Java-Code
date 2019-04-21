import java.io.*;
import javax.swing.*;
public class FunWithFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunWithFiles fwf = new FunWithFiles();
		//reference file via local folder, where the source code is
		File f = new File("noon.png");
		
		f = new File("C:/users/Sam/eclipse-workspace/src/noon.png");
		//or reference file via complete filepath, make sure the pictures actually there
		
		System.out.println("Does F exist?" +f.exists());
		
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		
		int status = new JFileChooser().showOpenDialog(null);
		if(status == JFileChooser.APPROVE_OPTION) {
			System.out.println("You selected" + chooser.getSelectedFile().getName());
			System.out.println("at complete path: " +chooser.getSelectedFile().getAbsolutePath());
		}
		else {
			System.out.println("You clicked cancel");
		}
		
	}

}
