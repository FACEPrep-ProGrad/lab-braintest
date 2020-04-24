package service;

public class PersonalityCalculator{
	public String findYourBrainType( String options ) {
		int[] arr = findAnswers(options);
		/*A= (Q1)+(Q2)+(Q3)+(Q5)+(Q8)+(Q10)+(Q11)+(Q12)+(Q14)+(Q18)+(Q20) = _____
				  
				B = (Q4) +(Q6)+(Q7) + (Q9) + (Q13) + (Q15) + (Q16) +(Q17)+ (Q19)  = _____ 
				            
				X = 66 - _A_ + _B_ =*/
		
		int a = arr[0] +arr[1] +arr[2] +arr[4] +arr[7] +arr[10] +arr[11] +arr[13] +arr[17] +arr[19];
		int b = arr[3] +arr[5] +arr[6] +arr[8] +arr[12] +arr[14] +arr[15] +arr[16] +arr[18];
		int x = 66 - a + b;
		/*
				Range Results:
				20-55 Left-brained 
				56-64 No clear preference 
				65-100 Right-brained

		 */
		System.out.println("Total score is : "+ x);
		
		String sided = null;
		if(x > 19 ) {
			if(x > 19 && x < 56) {
				//System.out.println("Left Brained");
				sided = "Left Brained";
			}
			else if(x > 55 && x < 65) {
				//System.out.println("No clear preference");
				sided =  "No clear preference";
				
			}
			else {
				//System.out.println("Right-brained");
				sided =  "Right-brained";
			}
		}
		return sided;
		
	}
	public int[] findAnswers( String options ) {
		String selectedAnswers[] = options.split(",");
		
		int answers[] = new int [selectedAnswers.length];
		
		for(int i = 0; i<selectedAnswers.length;i++ ) {
			answers[i] = Integer.parseInt(selectedAnswers[i]);
		}
		
		for(int i=0; i<answers.length; i++) {
			System.out.println(answers[i]);
		}
		System.out.println(answers);
		
		return answers;
		
	}
}
