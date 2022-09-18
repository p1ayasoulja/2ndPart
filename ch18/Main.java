import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum=0;
        System.out.println("Enter 0 for quit");
        do{ str=br.readLine();
            try{
                i=Integer.parseInt(str);
            }catch (NumberFormatException e){
                System.out.println("Wrong format!");
                i=0;
            }
            sum+=i;
            System.out.println("Summ is "+sum);
        }while (i!=0);
        int g1=12315;
        System.out.println("In 2 "+Integer.toBinaryString(g1));
        System.out.println("In 16 "+Integer.toHexString(g1));
        System.out.println("In 8 "+Integer.toOctalString(g1));
    }
}