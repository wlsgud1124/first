package codeupload;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		int aa =3;
		double bb = 4.94;
		char cc = 'a';
		String ss = "aaaaa";
		
		//명시적 형변환
		//bb = (double)aa;
		//System.out.println(bb);
		//aa =(int)bb;
		//System.out.println(aa); 
		
		//자동형변환
		//bb = aa;
		//System.out.println(bb);
		// aa = bb; //안됨
		//System.out.println(aa);
		
		System.out.println();
		
		System.out.printf("%d, %f ,%c, %s ",aa,bb,cc,ss);
		
	Scanner wlsgud=new Scanner(System.in);
	//String abc=wlsgud.nextLine();
	//System.out.println(abc);
		
	int i=1;
	int j=0;
	j=i++;
	System.out.printf("%d %d", i,j);
	
		
	}

}
