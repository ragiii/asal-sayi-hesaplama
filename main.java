import java.util.Scanner;

public class recursiveAs {

    static boolean sayi(int numb) {
        int sayac = 0;
        for(int i = 2; i < numb; i++){
            if(numb%i == 0){
                sayac++;
            }
        }
        if (sayac == 0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int numb = input.nextInt();
        if(sayi(numb))
        System.out.println("Girilen sayı asaldır.");
        else
        System.out.println("Girilen sayı asal değildir.");

    
        
    }
    
}
