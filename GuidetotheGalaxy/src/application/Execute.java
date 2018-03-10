package application;

import galaxyobject.EarthResource;

import java.io.IOException;
import java.util.List;

import util.DataInputUtil;
import util.QuestionsAnalysisUtil;
import util.SyntaxAnalysisUtil;


public class Execute {
	
	/**
	 * 1 to input data from file
	 * 2 to set galaxy language to roman number and calculate earth resource value
	 * 3 to calculate numbers and earth resource value
	 * 4 go seperately show answer
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			List<String> inputData=DataInputUtil.DataReader("src/data/input.txt");
			List<EarthResource> resList=SyntaxAnalysisUtil.extractQuestions(inputData);
			QuestionsAnalysisUtil.processQuestions(inputData, resList);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
