import java.util.Scanner;
import java.util.Arrays;
public class Harmonik {


    public static void main(String[] args) {
        int arrayVariableCount;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç değerli bir dizi gireceksin?:  ");
        arrayVariableCount = input.nextInt();

        double[] myArray = new double [arrayVariableCount];

        for(int i = 0; i < arrayVariableCount;i++){
            myArray[i] = 1D/(i+1);

        }

        for (double i : myArray
             ) {

            sum += i;

        }
        System.out.println("Harmonik seri:  ");
        System.out.println("Dizimiz:   "+Arrays.toString(myArray));
        System.out.print("Harmonik ortalaması: "+sum/arrayVariableCount);
    }
}








/*          Bu eski hali
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

 */
