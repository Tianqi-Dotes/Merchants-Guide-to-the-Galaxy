package util;

import java.util.ArrayList;
import java.util.List;

import galaxyobject.EarthResource;
import galaxyobject.RomanNumber;

public class SyntaxAnalysisUtil {
	
	public static List<EarthResource> extractQuestions(List<String> syntaxInput){
		List<EarthResource> EarthResources=new ArrayList<EarthResource>();
		
		for(String eachSyn:syntaxInput){
			if(eachSyn.endsWith("is "+RomanNumber.I)||eachSyn.endsWith("is "+RomanNumber.V)||eachSyn.endsWith("is "+RomanNumber.X)
					||eachSyn.endsWith("is "+RomanNumber.L)||eachSyn.endsWith("is "+RomanNumber.C)||eachSyn.endsWith("is "+RomanNumber.D)||eachSyn.endsWith("is "+RomanNumber.M)){
				String[] str=eachSyn.split(" ");
				switch(str[2]){
					case "I":
						RomanNumber.I.setGalacticNum(str[0]);
						break;
					case "V":
						RomanNumber.V.setGalacticNum(str[0]);
						break;
					case "X":
						RomanNumber.X.setGalacticNum(str[0]);
						break;
					case "L":
						RomanNumber.L.setGalacticNum(str[0]);
						break;
					case "C":
						RomanNumber.C.setGalacticNum(str[0]);
						break;
					case "D":
						RomanNumber.D.setGalacticNum(str[0]);
						break;
					case "M":
						RomanNumber.M.setGalacticNum(str[0]);
						break;
					default:
						System.out.println("syntax wrong");
						break;
				}	
			}else if(eachSyn.endsWith("Credits")){
				double totalValue=0;
				String[] valueSection=eachSyn.split("[a-zA-Z]");  
			    String ne="";
		        for(String s:valueSection){
		        	if(s!=""){
		        		ne=ne+s;
		        	}
		        }
		        totalValue=Integer.valueOf(ne.trim());
		        
				eachSyn=replaceToNumber(eachSyn);
				
				String resource=eachSyn.substring(0,eachSyn.indexOf("is")-1);
				String resourceName=resource.replaceAll("\\d+","").trim();
				String[] convertRoman=resource.split("[a-zA-Z\\s]");
				int[] romanFomula =new int[convertRoman.length];
				for(int i=0;i<convertRoman.length;i++){
					romanFomula[i]=Integer.valueOf(convertRoman[i]);
				}
				int count=RomanNumber.formulaCalculation(romanFomula);
				EarthResource res=new EarthResource(resourceName);
				res.setValue(totalValue/count);
				
				EarthResources.add(res);
				
			}
		}
		return EarthResources;
	}
	public static String replaceToNumber(String eachSyn){
		String originalSyn=eachSyn;
		if(eachSyn.contains(RomanNumber.I.getGalacticNum())){
			eachSyn=eachSyn.replaceAll(RomanNumber.I.getGalacticNum(), String.valueOf(RomanNumber.I.getValue()));
		}
		if(eachSyn.contains(RomanNumber.V.getGalacticNum())){
			eachSyn= eachSyn.replaceAll(RomanNumber.V.getGalacticNum(), String.valueOf(RomanNumber.V.getValue()));
		}
		if(eachSyn.contains(RomanNumber.X.getGalacticNum())){
			eachSyn=eachSyn.replaceAll(RomanNumber.X.getGalacticNum(), String.valueOf(RomanNumber.X.getValue()));
		}
		if(eachSyn.contains(RomanNumber.L.getGalacticNum())){
			eachSyn=eachSyn.replaceAll(RomanNumber.L.getGalacticNum(), String.valueOf(RomanNumber.L.getValue()));
		}
		if(eachSyn.contains(RomanNumber.C.getGalacticNum())){
			eachSyn=eachSyn.replaceAll(RomanNumber.C.getGalacticNum(), String.valueOf(RomanNumber.C.getValue()));
		}
		if(eachSyn.contains(RomanNumber.D.getGalacticNum())){
			eachSyn=eachSyn.replaceAll(RomanNumber.D.getGalacticNum(), String.valueOf(RomanNumber.D.getValue()));
		}
		if(eachSyn.contains(RomanNumber.M.getGalacticNum())){
			eachSyn=eachSyn.replaceAll(RomanNumber.M.getGalacticNum(), String.valueOf(RomanNumber.M.getValue()));
		}
		if(originalSyn==eachSyn){
			System.out.println("I have no idea what you are talking about");
			return "";
		}
		return eachSyn;
	}
	public void numeralSynChecking(String s){
		String[] str=s.split(" ");
		
	}
	public boolean questionSyntaxChecking(String eachQuestion){
		if(eachQuestion==null){
			return false;
		}
		String[] syntaxArray=eachQuestion.split(" ");
		if(eachQuestion.startsWith("how much is")){
		}
		if(eachQuestion.startsWith("how many Credits is")){
			
		}
		return true;
	}
}
