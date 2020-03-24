package service;
public class PersonalityCalculator
{
	public String findYourBrainType(String inp)
	{
		System.out.println(inp);
		int x = findAnswers(inp);
		String str ="";
	      if(x>=20 && x <= 55)
	    	  str = "leftbrained";
	      if(x>=56 && x <=64)
	    	  str = "No clear preference";
	      if(x>=65 && x<=100)
	    	  str = "rightbrained";
	      System.out.println(str);
		return str;
	}
	public int findAnswers(String inp)
	{
		 String[] values = inp.split(",");
	     int size = values.length;
	     System.out.println(size);
	      int [] arr = new int [size];
	      for(int i=0; i<size; i++) {
	         arr[i] = Integer.parseInt(values[i]);
	         System.out.println(arr[i]);
	      }
	      int a = (arr[0]+arr[1]+arr[2]+arr[4]+arr[7]+arr[9]+arr[10]+arr[11]+arr[13]+arr[17]+arr[19]);
	      System.out.println(a);
	      int b = arr[3]+arr[5]+arr[6]+arr[8]+arr[12]+arr[14]+arr[15]+arr[16]+arr[18];
	      System.out.println(b);
	      int x = 66 - a + b;
	      return x;
	}
}
