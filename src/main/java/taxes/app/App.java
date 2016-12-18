package taxes.app;

import java.io.FileWriter;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVWriter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new App();
    }
    
    public App(){

        FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("data.csv", true);
			CSVWriter writer = new CSVWriter(fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
}
