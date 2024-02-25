import java.util.Scanner;

public class ucDortBolunen {

	public static void main(String[] args) {
		
		int sayi,i;
	
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();
        
        for (i=1 ; i<=sayi ; i++) {
        	
        	if (i%3==0 && i%4==0) System.out.println(i+" sayısı 3'e ve 4'e tam bölünmektedir."); 	
        }
	}

}
