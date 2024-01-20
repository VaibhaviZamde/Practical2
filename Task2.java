import java.util.*;

class Task2
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
		    	System.out.println("0  .   ");

		    	char choice;

		    	do 
		    	{
				System.out.println();
				int a = scan.nextInt();
				
				System.out.print("");
				choice = scan.next().charAt(0);
				
				System.out.print("");
				int b = scan.nextInt();

				switch (choice) 
				{
				 	case 'x':
						mul(a,b);
						break;
					
					case '/':
						div(a,b);
				       		break;	
						
					default:
						break;
				}
			} while (choice != 'C');
        	}		 
		catch (InputMismatchException e) 
		{
			System.out.println("");
		}
		
		//scan.close();
    	}
    	private static void mul(int x, int y) 
    	{
		System.out.print("=");
		System.out.print(x * y+"\n");
    	}
    	
    	private static void div(int x, int y) 
    	{
		if (y != 0) 
		{
                    System.out.print("=");
                    System.out.println((double) x / y+"\n");
                } 
                else 
                {
                    System.out.print("=");
                    System.out.println("Math Error \n");
                }
    	}
}
