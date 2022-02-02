package typeCasting;
	public class Main {
		public static void main(String[] args) {
		System.out.println("implicit Type Casting");
		char x='A';
			System.out.println("Value of x:"+x);
		int y=x;
			System.out.println("Value of y:"+y);
	float z=x;
			System.out.println("Value of z:"+z);
			long d=x;
			System.out.println("Value of d:"+d);
		double e=x;
			System.out.println("Value of e: "+e);
					
			System.out.println("\n");
			
			System.out.println("Explicit Type Casting");
			
		
		double p=45.5;
			int q=(int)p;
			System.out.println("Value of p: "+p);
			System.out.println("Value of q: "+q);	
		}
	}


