import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int boyut,sayac=0;
		System.out.print("Kaç boyutlu dizi gireceksiniz: ");
		boyut=input.nextInt();
		
		int [] dizi=new int[boyut];
		for(int i=0;i<boyut;i++){
			System.out.print((i+1)+". degeri giriniz: ");
			dizi[i]=input.nextInt();
		}
		
		do{
			sayac=0;
			for(int i=0;i<boyut-1;i++){
				if(dizi[i]>dizi[i+1]){
					int deger=dizi[i];
					dizi[i]=dizi[i+1];
					dizi[i+1]=deger;
					sayac++;
				}
			}
		}
		while(sayac!=0);
		
		for(int i=0;i<boyut;i++){
			if(i==boyut-1)
				System.out.print(dizi[i]);
			else
				System.out.print(dizi[i]+"-");
		}
		
	}

}
