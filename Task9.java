package assignment1;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number=new int[5];
		number[0]=12;
		number[1]=34;
		number[2]=68;
		number[3]=85;
		number[4]=900;
		for(int i=0;i<5;i++) {
		if(number[i]==85)
		{
		System.out.println("Number is :"  + number[i])	;
		break;
		}
		
		System.out.println("Number is not 85 and number is : " + number[i])	;
		}
		
		}

}

