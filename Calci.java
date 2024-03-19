import java.util.*;

class Final
{
	public static void main(String args[]) 
    	{
        	Scanner scan = new Scanner(System.in);

        	try 
        	{
        		System.out.println();
		    	System.out.println("7  8  9  d  C  s  r\n");
		    	System.out.println("4  5  6  x  /   c   b\n");
		    	System.out.println("1  2  3  +  -   t   \n");
		    	System.out.println("0  .  %  ^  l   f   \n");

		    	char choice;
		    	
		    	//StringBuilder inputStringBuilder = new StringBuilder(); 

		    	do 
		    	{
		    		/*
				System.out.println();
				int a = scan.nextInt();
				
				System.out.print("");
				choice = scan.next().charAt(0);
				
				
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
				
					// If a valid operator is pressed, append it to the input string
					//inputStringBuilder.append(choice);

					System.out.print("");
					int b = scan.nextInt();
					*/
					System.out.print("");
					int a = scan.nextInt();

					System.out.print("");
					choice = scan.next().charAt(0);

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
					       		
					       	case 'l':
					       		log(a,b);
					       		break;
					       	//case 'x':
					      	
					      	case 's':
					       		sin(a);
					       		break;
					       		
					       	case 'c':
					       		cos(a);
					       		break;
					       		
					       	case 't':
					       		tan(a);
					       		break;
					       	
					       	case 'f':
					       		fact(a,b);
					       		break;
					       	     
					       	case 'r':
					       		sqroot(a,b);
					       		break;
					       		
					       	case 'e':
					       		expo(a);
					       		break;
					       		
					       	case 'b' : 
					       		cuberoot(a);
					       		
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
		System.out.println("="+(x * y)+"\n");
    	}
    	
    	private static void div(int x, int y) 
    	{
		if (y != 0) 
		{
                    System.out.println("= "+(double) x / y+"\n");
                } 
                else 
                {
                    System.out.println("= "+"Math Error");
                }
    	}
    	
    	private static void perc(int x, int y) 
    	{
		System.out.println("= "+(x % y)+"\n");
		//System.out.print();
    	}
    	
    	private static void sq(int x, int y) 
    	{
        	System.out.println("= " + Math.pow(x, y)+"\n");
    	}
    	
    	private static void log(int x , int y ) 
    	{
    		System.out.println("= "+ (x/(double)y));
    	}
    	
    	private static void sin(int x) 
    	{
        	System.out.println("= " + (int)Math.sin(x)+"\n");
    	}
	
	private static void cos(int x) 
    	{
        	System.out.println("= " + (int)Math.cos(x)+"\n");
    	}
    	
    	private static void tan(int x) 
    	{
        	System.out.println("= " + (int)Math.tan(x)+"\n");
    	}    	
    	
    	private static void fact(int x,int y)
    	{
    		int i , f = 1;
    		
    		for(i=1;i<=x;i++)
    		{
    			f = f*i;
    		}
    		
    		System.out.println("= "+f);
    	}
    	
    	private static void sqroot(int a , int b)
    	{
    		System.out.println("= "+Math.sqrt(a));
    	}
    	
    	private static void expo(int x )
    	{
    		System.out.println("= "+Math.exp(x));
    	}
    	
    	private static void cuberoot(int x)
    	{
    		System.out.println("= "+(int)Math.cbrt(x));
    	}
    	
    	
}










