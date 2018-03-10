package util;

import galaxyobject.EarthResource;
import galaxyobject.RomanNumber;

import java.util.Iterator;
import java.util.List;

public class QuestionsAnalysisUtil {
	
	public static void processQuestions(List<String> syntaxInput,List<EarthResource> resList){
		for(String eachSyn:syntaxInput){
			if(eachSyn.endsWith("?")){
				if(eachSyn.startsWith("how much")){
					String countSyntax=eachSyn.substring(eachSyn.indexOf("is")+3,eachSyn.length()-1);
					String count=SyntaxAnalysisUtil.replaceToNumber(countSyntax);
					if(count!=""){
						String[] convertRoman=count.split("\\D+");
				    	int[] romanFomula =new int[convertRoman.length];
				    	for(int i=0;i<convertRoman.length;i++){
				    		romanFomula[i]=Integer.valueOf(convertRoman[i]);
						}
				    	int sum=RomanNumber.formulaCalculation(romanFomula);
				    	System.out.println(countSyntax+"is "+sum);
					}
				}else if(eachSyn.startsWith("how many")){
					int credits=0;
					String countSyntax=eachSyn.substring(eachSyn.indexOf("is")+3,eachSyn.length()-2);
					String count=SyntaxAnalysisUtil.replaceToNumber(countSyntax);
			    	String[] convertRoman=count.split("\\D+");//^a-z^A-Z
			    	int[] romanFomula =new int[convertRoman.length];
			    	for(int i=0;i<convertRoman.length;i++){
			    		romanFomula[i]=Integer.valueOf(convertRoman[i]);
					}
			    	int sum=RomanNumber.formulaCalculation(romanFomula);
			    	
			    	String[] resourceNameArray=count.split("[^a-z^A-Z]");
			    	StringBuffer sb=new StringBuffer();
			    	for(String s:resourceNameArray){
			    		if(s==null||s.length()==0)
			    			continue;
			    		else
			    			sb.append(s);
			    	}
			    	String resourceName=sb.toString();
					Iterator<EarthResource> iter=resList.listIterator();
					while(iter.hasNext()){
						EarthResource res=iter.next();
						if(resourceName.equals(res.getName())){
							credits=(int) (res.getValue()*sum);
							System.out.println(countSyntax+" is "+credits+" Credits");
						}
					}
				}
			}
		}
	}
}
