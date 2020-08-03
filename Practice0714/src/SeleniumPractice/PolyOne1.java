package SeleniumPractice;

import java.util.*;

public class PolyOne1 {

			void area(double d )
			{
				float circlearea = (float) (3.13*(d*d));
				System.out.println("Area of circle is :" + circlearea)  ;
			}
			
			int area (int side)
			{
				int sqarea = side*side;
				return sqarea;
			}
			public static void main(String[] args) {
				PolyOne1 po = new PolyOne1();
				Scanner sc1 = new Scanner (System.in);
				double d = sc1.nextDouble();
						po.area(d);
						po.area(12.3);
				System.out.println(po.area(16));
				sc1.close();
				
						}

			

}
