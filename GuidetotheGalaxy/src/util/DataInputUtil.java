package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataInputUtil {
	
	public static List DataReader(String filePath) throws IOException{
			List dataInputs=null;
			BufferedReader reader = new BufferedReader(new FileReader(filePath));		//read the data from the filepath and wrap it into bufferedreader
			
			
			Stream<String> allLineStream= reader.lines();
			dataInputs=allLineStream.collect(Collectors.toList());
			reader.close();
			return dataInputs;
		}
}
