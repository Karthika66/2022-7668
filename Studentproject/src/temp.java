import java.util.Scanner;////3.	program to read temperature in centigrade and display a suitable message22-7
public class temp {
	

	public static void main(String[] args){

	 Print("Enter temperature in celcius: \n");

	 Scanner getInput = new Scanner(System.in);

	 int temperature = getInput.nextInt();

	 if(temperature <= 0)

	  Print("Freezing Weather");

	 else if(temperature >= 21 && temperature <= 30)

	  Print("Normal Weather");

	 else if(temperature >= 31 && temperature <= 40)

	  Print("Hot Weather");

	 else if(temperature > 40)

	  Print("Very Hot Weather");

	 else

	  Print("Cold Weather");

	 getInput.close();

	}


	public static void Print(Object _object_){

	 System.out.print(_object_);

	}

	}

