package assignment1;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] word=new String[5];
		word[0]="Java";
		word[1]="Javascript";
		word[2]="Selenium";
		word[3]="Python";
		word[4]="Mukesh";
		for(int i=0;i<5;i++) {
		if(word[i]=="Selenium")
		{
		System.out.println("word is :"  + word[i])	;
		break;
		}
		
		System.out.println("word is not selenium and word is : " + word[i])	;
		}
		

	}

}
