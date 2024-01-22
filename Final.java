import java.util.*;

class Final
{
	public static void main(String args[]) 
    	{
        	Scanner scan = new Scanner(System.in);

        	try 
        	{
        		System.out.println();
		    	System.out.println("7  8  9  d  C\n");
		    	System.out.println("4  5  6  x  /\n");
		    	System.out.println("1  2  3  +  -\n");
		    	System.out.println("0  .  %  ^");

		    	char choice;
		    	
		    	StringBuilder inputStringBuilder = new StringBuilder(); 

		    	do 
		    	{
				System.out.println();
				int a = scan.nextInt();
				
				System.out.print("");
				choice = scan.next().charAt(0);
				
				/*
				if (choice == 'd') 
				{
					    // If 'd' is pressed, delete the last character from the input string
					if (inputStringBuilder.length() > 0) 
					{	
					  	inputStringBuilder.deleteCharAt(inputStringBuilder.length() - 1);
					}
				}
				else 
				{
				*/
					// If a valid operator is pressed, append it to the input string
					//inputStringBuilder.append(choice);

					System.out.print("");
					int b = scan.nextInt();

					switch (choice) 
					{
					 	case '+':
							add(a,b);
							break;
						
						case '-':
							sub(a,b);
							break;
						
						case 'x':
							mul(a,b);
							break;
						
						case '/':
							div(a,b);
					       		break;	
					       	
					       	case '%':
					       		perc(a,b);
					       		break;
					       		
					       	case '^':
					       		sq(a,b);
					       		break;
					       	      
						default:
							break;
					}
				//}
				//System.out.println("Input: " + inputStringBuilder.toString());

			} while (choice != 'C');
		}		 
		catch (InputMismatchException e) 
		{
			System.out.println("");
		}
    	}
    	private static void add(int x, int y) 
    	{
		System.out.print("=");
		System.out.print(x + y);
    	}
    	
    	private static void sub(int x, int y) 
    	{
		System.out.print("=");
		System.out.print(x - y);
    	}
    	
    	private static void mul(int x, int y) 
    	{
		System.out.print("=");
		System.out.print(x * y);
    	}
    	
    	private static void div(int x, int y) 
    	{
		if (y != 0) 
		{
                    System.out.print("=");
                    System.out.println((double) x / y);
                } 
                else 
                {
                    System.out.print("=");
                    System.out.println("Math Error");
                }
    	}
    	
    	private static void perc(int x, int y) 
    	{
		System.out.print("=");
		System.out.print(x % y);
    	}
    	
    	private static void sq(int x,int y) 
    	{
		System.out.print("=");
		System.out.print(Math.pow(x,y));
    	}
}

