import java.util.Scanner;

class App{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Lütfen bir Sayi giriniz..");
        int n = Integer.parseInt(kb.nextLine());
        int sum = 0;

        for(int i = 1 ; i <= n ; ++i)
             sum += i*i;
        
        System.out.printf("Girilen sayi = %d%nKareler Toplami = %d ",n,sum);

    }
}
