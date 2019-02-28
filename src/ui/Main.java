package ui;
import model.*;
import java.util.*;

public class Main {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		boolean goOut = false;
		
		while(!goOut) {
			System.out.println("Welcome to the program");
			System.out.println("1. Create a magic square");
			System.out.println("2. Go out");
			
			int option = input.nextInt();
			
			switch(option) {
			    case 1:{
			    	System.out.println("Type the order of the magic square");
			    	int order = input.nextInt();
			    	System.out.println("Where do you to start");
			    	System.out.println("1.Right"+"\n"+"2.Left"+"\n"+"3.Above"+"\n"+"4.Down");
			    	int centralBox = input.nextInt();
			    	System.out.println("In what direction?");
			    	System.out.println("1.NO"+"\n"+"2.NE"+"\n"+"3.SO"+"\n"+"4.SE");
			    	int sense = input.nextInt();
			    	
			    	MagicSquare magicSquare = new MagicSquare(order,sense, centralBox);
			    	magicSquare.fillBox(order, sense, centralBox);
			    	System.out.println(""+magicSquare.magicSquare());
			    	break;
			    }case 2:{
			    	goOut = true;
			    	break;
			    }default:{
			    	System.out.print("Option not valid");
			    }	
			}
		}input.close();
	}
}

