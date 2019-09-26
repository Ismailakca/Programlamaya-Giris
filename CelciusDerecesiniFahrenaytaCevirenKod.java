import java.util.Scanner;

class App{
    public static void main(String [] args)
    {
            Fahrenayt.celcius();
    }
}

class Fahrenayt {
    public static void celcius(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Derece  giriniz");
        double c = Integer.parseInt(kb.nextLine());
        double f = c * 1.8 + 32;
        System.out.printf("Derece %f",f);
    }
}
