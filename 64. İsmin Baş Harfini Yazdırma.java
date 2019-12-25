import java.util.Scanner;

class App{
    public static void main(String[] args) {
        System.out.println(StringUtil.run());
    }
}

class StringUtil {
    public static String run()
    {
        Scanner kb = new Scanner(System.in);
        String str ="";
        for (;;){
            System.out.println("yazı Girmeye başlayınız");
            String text = kb.nextLine();
            if (text.equals("exit"))
                break;

            str += text.substring(0,1);

        }
        return str;
    }
}
