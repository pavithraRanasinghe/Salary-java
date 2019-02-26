import java.util.*;
class Salary {
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input a salary : " );
		int salary=input.nextInt();
		System.out.println("Salary : "+salary);

		int r5000,r2000,r1000,r500,r200,r100,r50,r20,r10,r5,r2,r1;
		//Find minimum notes and coins
		r5000=salary/5000;
		salary=salary%5000;
		r2000=salary/2000;		
		salary=salary%2000;
		r1000=salary/1000;
		salary=salary%1000;
		r500=salary/500;
		salary=salary%500;
		r200=salary/200;
		salary=salary%200;
		r100=salary/100;
		salary=salary%100;
		r50=salary/50;
		salary=salary%50;
		r20=salary/20;
		salary=salary%20;
		r10=salary/10;
		salary=salary%10;
		r5=salary/5;
		salary=salary%5;
		r2=salary/2;
		salary=salary%2;
		r1=salary/1;

		System.out.println("R5000 : "+r5000);
		System.out.println("R2000 : "+r2000);
		System.out.println("R1000 : "+r1000);
		System.out.println("R500  : "+r500);
		System.out.println("R200  : "+r200);
		System.out.println("R100  : "+r100);
		System.out.println("R50   : "+r50);
		System.out.println("R20   : "+r20);
		System.out.println("R10   : "+r10);
		System.out.println("R5    : "+r5);
		System.out.println("R2    : "+r2);
		System.out.println("R1    : "+r1);
    }
}
