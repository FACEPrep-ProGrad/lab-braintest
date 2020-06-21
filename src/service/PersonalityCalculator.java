package service;
public class PersonalityCalculator{
	public String findYourBrainType(String options) {
		int []array = findAnswers(options);
		int a =0 ,b=0 , x=0;
		for(int i=0;i<array.length;i++) {
			switch(i) {
			case 0:
			case 1:
			case 2:
			case 4:
			case 7:
			case 9:
			case 10:
			case 11:
			case 13:
			case 17:
			case 19:
				a = a+array[i];
				break;
			case 3:
			case 5:
			case 6:
			case 8:
			case 12:
			case 14:
			case 15:
			case 16:
			case 18:
				b = b+ array[i];
				
			}
		}
		x = 66 -a+b;
		/*
		  	20-55 Left-brained 
			56-64 No clear preference 
			65-100 Right-brained
		  */
		if(x >= 20 && x <= 55) {
			options = "leftbrained";
		}
		else if(x >= 56 && x <= 64) {
			options = "noclearpreference";
		}
		else if(x>=65&&x<=100) {
			options="rightbrained";
		}
		return options;
	}

	private int[] findAnswers(String options) {
		// TODO Auto-generated method stub
		String [] str = options.split(",");
		int [] array = new int[str.length];
		for(int i=0;i<array.length;i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		return array;
	}
}
