import java.io.*;
import java.util.*;
public class FWF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FWF3 fwf3 = new FWF3();
		//fwf3.saveBytes();
		//fwf3.loadBytes();
		//fwf3.saveNumbers();
		fwf3.loadNumbers();
	}
	void saveBytes(){
	try {
		File  outFile   = new File("sample1.data");

		FileOutputStream 
	      outStream = new FileOutputStream( outFile );

	//data to save
		byte[] byteArray = {10, 20, 30, 40, 
			     50, 60, 70, 80};

	//write data to the stream
		outStream.write( byteArray );

	//output done, so close the stream
		outStream.close();
	}
	catch(IOException e)
	{
		System.out.println("Unscpeified I/O exception!");
	}
	}
	void loadBytes() {
		try {
		//set up file and stream
		File		 inFile	  = new File("sample1.data");
		FileInputStream inStream = new FileInputStream(inFile);

		//set up an array to read data in
		int    fileSize  = (int)inFile.length();
		byte[] byteArray = new byte[fileSize];

		//read data in and display them
		inStream.read(byteArray);
		for (int i = 0; i < fileSize; i++) {
			System.out.println(byteArray[i]);
		}

		//input done, so close the stream
		inStream.close();
		}
		catch(IOException e) {
			System.out.println("Unspecified I/O Exception!");
		}
	}
	void loadNumbers()
	{
		try {
			File             inFile       = new File( "sample2.data" );
			FileInputStream  inFileStream = new FileInputStream(inFile);
			DataInputStream  inDataStream = new DataInputStream(inFileStream);

			//read values back from the stream and display them
	    	System.out.println(inDataStream.readInt());
	    	System.out.println(inDataStream.readLong());
	    	System.out.println(inDataStream.readFloat());
	    	System.out.println(inDataStream.readDouble());
	    	System.out.println(inDataStream.readChar());
	    	System.out.println(inDataStream.readBoolean());

	    	//input done, so close the stream
	    	inDataStream.close();
		}
		catch(IOException e) {
			System.out.println("IOException Error");
		}
	}
	void saveNumbers()
	{
		try {
			File             outFile       = new File("sample2.data");
			FileOutputStream outFileStream = new FileOutputStream(outFile);
			DataOutputStream outDataStream = new DataOutputStream(outFileStream);
			
			outDataStream.writeInt(987654321);
			outDataStream.writeLong(11111111L);
			outDataStream.writeFloat(22222222F);
			outDataStream.writeDouble(3333333D);
			outDataStream.writeChar('A');
			outDataStream.writeBoolean(true);
			
			//output done, so close the stream
			outDataStream.close();

		}
		catch(IOException e) {
			System.out.println("Unspecified IO Exception");
		}
	}
}
