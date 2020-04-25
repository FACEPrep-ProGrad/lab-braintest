package service;

public class PersonalityCalculator{
	public String findYourBrainType(String options) {
		int[] answers=findAnswers(options);

		int A=0, B=0;
		A=answers[0]+answers[1]+answers[2]+answers[4]+answers[7]+answers[9]+answers[10]+answers[11]+answers[13]+answers[17]+answers[19];
		B=answers[3]+answers[5]+answers[6]+answers[8]+answers[12]+answers[14]+answers[15]+answers[16]+answers[18];
	int braintype=66-(A-B);
	if(braintype>=20 && braintype<=55)
		return "leftbrained";
	else if(braintype>=56 && braintype<=64)
		return "noclearpreference";
	else 
		return "rightbrained";
		
		
	}

	public int[] findAnswers(String options) {
		String[]  selectedAnswer=options.split(",");
		int[] answer=new int[selectedAnswer.length];
		for(int i=0;i<selectedAnswer.length;i++) {
			answer[i]=Integer.parseInt(selectedAnswer[i]);
		}
		return answer;
	}
		
		
	
}