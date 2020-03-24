package service;

public class PersonalityCalculator{
	String[] options = {"5","2","3","1","4","3","2","1","5","4","3","2","1","5","4","3","2","1","2","2"};
	int[] optionsInt=new int[options.length];
	
	//FUNCTION findAnswers
	public int[] findAnswers(String options) {
		for(int i=0;i<this.options.length;i++) {
			optionsInt[i]=Integer.parseInt(this.options[i]);
		}
		return optionsInt;
	}
	
	//FUNCTION findYourBrainType
	public String findYourBrainType(String options) {
		int A=0,B=0;
		findAnswers(options);
		for(int i=0;i<optionsInt.length;i++) {
			A+=optionsInt[i];
		}
		int x=66-A+B;
		
		if(x>=20 && x<=55) {
			return "leftbrained";
		}
		else if(x>=56 && x<=64) {
			return "noclearpreference";
		}
		else {
			return "rightbrained";
		}
	}
}