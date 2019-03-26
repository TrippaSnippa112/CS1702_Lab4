
public class CS1702_Lab4 
{
	public static void main(String args[])
	{
		//Question 4.1
		System.out.println("Q4.1");
		int i;

		for(i=4;i<12;++i)
		{
			System.out.println(i);
		}
		
		//Question 4.2
		System.out.println("Q4.2");
		for(i=10;i<20;i = i + 3)
		{
			System.out.println(i);
		}
		
		//Question 4.3
		System.out.println("Q4.3");
		for(i=1;i<17;i = i + 3)
		{
			System.out.println(i);
		}
		
		//Question 4.4
		System.out.println("Q4.4");
		for(i=2;i<13;i = i + 2)
		{
			System.out.println(i);
		}
		
		//Question 4.5
		System.out.println("Q4.5");
		for(i=1;i<11;i = i + 1)
		{
			System.out.println(i*i);
		}
		
		//Question 4.6
		System.out.println("Q4.6");
		for(i=-10;i<11;i = i + 2)
		{
			System.out.println(i);
		}
		
		//Question 4.7
		System.out.println("Q4.7");
		for(i=-20;i<21;i = i + 5)
		{
			System.out.println(i);
		}
		
		//Question 5.1
		System.out.println("Q5.1");
		for(i=1;i<11;i = i + 1)
		{
			System.out.println("*");
		}
		
		//Question 5.2
		System.out.println("Q5.2");
		for(i=1;i<11;i = i + 1)
		{
			System.out.println("-");
		}	
		//Question 5.3
		System.out.println("Q5.3");	
		for(i=1;i<6;i = i + 1)
		{
			System.out.println("+-");
		}
		
		//Question 5.4
		System.out.println("Q5.4");	
		for(i=1;i<4;i = i + 1)
		{
			System.out.println("*+-");
		}	
		
		//Question 5.5
		System.out.println("Q5.5");	
		for(i=1;i<5;i = i + 1)
		{	  
			if (i%4==0)
		        {
		            System.out.println("*"); //Checks when the 4th iteration happens to println said number
		        }
		        else
		        {
		        	System.out.println("*+-");
		        }
		}
		
		//Question 5.6
		System.out.println("Q5.6");
		for(i=1;i<3;i = i + 1)
		{
				System.out.println("***+++---");
		}	
		
		//Question 5,7
		System.out.println("Q5.7");
		for(i=1;i<=5;++i)
        {
        	
        		if (i==1 || i==5)
        		{
        			System.out.println("***");
        		}
        		
        		else if (i%2==0)
        		{
        			System.out.println("+++");
        		}
        		
        		else if (i==3)
        		{
        			System.out.println("------");
        		}
        }
		
		//Question 6
		System.out.println("      ");
		System.out.println("HCF Question");
		int one = 54, two = 87, hcf = 1, x = 2;
		while (x <= one && x <= two) 
        {
         if (one % x == 0 && two % x == 0)
         hcf = x; //If matches if then update hcf value, then adds the iteration
         x++;     //Keeps adding one if it matches the if condition
        }
        
        System.out.println("The greatest common factor for " + one +
        " and " + two + " is " + hcf);
        
        //Question 7.1
        System.out.println("      ");
		System.out.println("Q7.1");
        int a,b;
		
        for(a=1;a<6;++a) //
        {
        	for(b=1;b<a+1;++b) // only one case where a being 1 where condition is true, so one iteration of this.
        	{
        		System.out.println(a);
        	}
        }
        
        //Question 7.2
        System.out.println("     ");
        System.out.println("Q7.2");
		
        for(a=2;a<7;++a)
        {
        	for(b=1;b<a+1;++b)
        	{
        		System.out.println(a);
        	}
        }
        
        //Question 7.3
        System.out.println("     ");
        System.out.println("Q7.3");
		
        for(a=1;a<7;a+=2)
        {
        	for(b=1;b<a+1;++b)
        	{
        		System.out.println(a);
        	}
        }
        
        //Question 7.4
        System.out.println("     ");
        System.out.println("Q7.4");
		
        for(a=1;a<=7;a+=2)
        {
        	for(b=2;b<a+2;b+=2)
        	{
        		System.out.println(a);
        	}
        }
        
        //Question 7.5
        System.out.println("     ");
        System.out.println("Q7.5");
		
        for(a=5;a>0;--a)
        {
        	for(b=1;b<a+1;++b)
        	{
        		System.out.println(a);
        	}
        }
        
        //Question 7.6
        System.out.println("     ");
        System.out.println("Q7.6");
		
        for(a=5;a>0;--a)
        {
        	for(b=5;b>a-1;--b)
        	{
        		System.out.println(a);
        	}
        
        }
        //Question 7.7
        //?
        
        //Question 7.8
        //?
        
        //Question 7.9.1
        System.out.println("          ");
		System.out.println("Pairs of numbers between 1-10");
 	
 		 for (a = 1; a <=10; a++)
 		 {

                for (b = 1; b <=10; b++)
                {
                	System.out.println(a + " " + b); //printlning out each pariring wiht a space
                }
 		 }
 		 
 		//Question 7.9.3
 		System.out.println("          ");
		System.out.println("pairs 1234 with 45678");
 	
 		 for (a = 1; a <=4; a++)
 		 {

                for (b = 4; b <=8; b++)
                {
                	System.out.println(a + " " + b);
                }
 		 }
 		 
 		//Question 7.9.2
 		//?
	}
}
