import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harmonik sayıyı ver:  ");
        int harmonik = input.nextInt();
        // harmonik değerlerin toplamını total değişkeninde toplayacağız
        double total = 0;
        for(int i = 1 ; i <= harmonik;i++){
            // sayıları daha net görmek için tek tek ve yan yana önünde 1/ olacak şekilde yazdırıyoruz.
            System.out.print("1/"+i+" , ");
            total += 1D/i;
        }
        System.out.println("'in Toplamı:  ");
        System.out.println(total);
    }
}
