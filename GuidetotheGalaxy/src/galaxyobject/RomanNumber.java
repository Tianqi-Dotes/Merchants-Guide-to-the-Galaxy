package galaxyobject;

public enum RomanNumber {
	
	I("---------",1),
	V("---------",5),
	X("---------",10),
	L("---------",50),
	C("---------",100),
	D("---------",500),
	M("---------",1000);
	
	
	private int value;
	private String galacticNum;

	RomanNumber(String galacticNum,int value){
	        this.value = value;
	        this.galacticNum = galacticNum;
	}
	
	public boolean formulaChecking(){
		
		return false;
	}
	public static int formulaCalculation(int[] galacticNumFomula){
		int sum=0;
		for(int i=0;i<galacticNumFomula.length-1;i++){
			if(galacticNumFomula[i]<galacticNumFomula[i+1]){
				sum-=galacticNumFomula[i];
			}else{
				sum+=galacticNumFomula[i];
			}
		}
		return sum+galacticNumFomula[galacticNumFomula.length-1];
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getGalacticNum() {
		return galacticNum;
	}

	public void setGalacticNum(String galacticNum) {
		this.galacticNum = galacticNum;
	}
}
