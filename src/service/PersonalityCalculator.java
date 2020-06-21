package service;

//Progression 1
public class PersonalityCalculator{
	
//	//Progression 2
	public String findYourBrainType(String string) {
//		//String options = "5,2,3,1,4,3,2,1,5,4,3,2,1,5,4,3,2,1,2,2";
//		//Split function delimiter - ','
//		
		int ansInInt[]=findAnswers(string);
		int A = ansInInt[0]+ansInInt[1]+ansInInt[2]+ansInInt[3]+ansInInt[4]+ansInInt[7]+ansInInt[9]+ansInInt[10]+ansInInt[11]+ansInInt[13]+ansInInt[17]+ansInInt[19];
		int B = ansInInt[3]+ansInInt[5]+ansInInt[6]+ansInInt[8]+ansInInt[12]+ansInInt[14]+ansInInt[15]+ansInInt[16]+ansInInt[18];
		int x = 66 - A - B;
//		return options;
		if(x>=20 && x<=55)
			return "Left-brained";
		else if (x >= 56 && x<=64)
			return "No clear preference";
		else if (x>=65 && x<=100)
			return "Right-brained";
		else 
			return "#";
	}
//	//Progression 3
	public static int[] findAnswers(String options) {
		String splitAns[] = options.split(",");
		int[] ansInInt = new int[splitAns.length];
		for(int i =0; i< splitAns.length;i++) {
			ansInInt[i] = Integer.parseInt(splitAns[i]);
		}
		return ansInInt;
	}
		
}



/*Range Results:
20-55 Left-brained 
56-64 No clear preference 
65-100 Right-brained
*/