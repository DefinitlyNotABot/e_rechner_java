import java.util.*;

public class e {
	
	public static void main(String[] args) {
		long t1 = 0;
		long t2 = 0;
		
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.print("Wie oft soll es durchlaufen werden?  ");
		
		long x = scn.nextLong();
		
		t1 = System.nanoTime();
		
		double y = 0;
		int z = 0;
		double b = 0;
		
		for(long i = 0; i < x; i++) {
			
			while(y < 1) {

				y += rnd.nextDouble();
				z++;
			}

			b = b+z;

			z = 0;
			y = 0;
		}
		b = b/x;
		t2 = System.nanoTime();
		System.out.println(b);
		
		double tg = t2-t1;
		
		if(tg >= 1000) {
			tg = tg/1000;
			if(tg >= 1000) {
				tg = tg/1000;
				if(tg >= 1000) {
					tg = tg/1000;
					System.out.println("Took " + tg + " s");
				}else {
				System.out.println("Took " + tg + " ms");
				}
			}else {
				System.out.println("Took " + tg + " us");
			}
			
		}else {
			System.out.println("Took " + tg + " ns");
		}
		
		
		
	}

}
