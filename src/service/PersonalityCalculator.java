package service;

public class PersonalityCalculator{
//	String[] options = {"5","2","3","1","4","3","2","1","5","4","3","2","1","5","4","3","2","1","2","2"};
//	int[] optionsInt=new int[options.length];
	
	//FUNCTION findYourBrainType
	public String findYourBrainType(String input)
	{
		System.out.println(input);
		int x = findAnswers(input);
		String result ="";
	      if(x>=20 && x <= 55)
	    	  result = "leftbrained";
	      if(x>=56 && x <=64)
	    	  result = "noclearpreference";
	      if(x>=65 && x<=100)
	    	  result = "rightbrained";
	      System.out.println(result);
		return result;
	}
	
	//FUNCTION findAnswers
	public int findAnswers(String input)
	{
		 String[] values = input.split(",");
	     int size = values.length;
	     System.out.println(size);
	      int [] arrInt = new int [size];
	      for(int i=0; i<size; i++) {
	         arrInt[i] = Integer.parseInt(values[i]);
	         System.out.println(arrInt[i]);
	      }
	      int A = (arrInt[0]+arrInt[1]+arrInt[2]+arrInt[4]+arrInt[7]+arrInt[9]+arrInt[10]+arrInt[11]+arrInt[13]+arrInt[17]+arrInt[19]);
	      System.out.println(A);
	      int B = arrInt[3]+arrInt[5]+arrInt[6]+arrInt[8]+arrInt[12]+arrInt[14]+arrInt[15]+arrInt[16]+arrInt[18];
	      System.out.println(B);
	      int x = 66 - A + B;
	      return x;
	}
}