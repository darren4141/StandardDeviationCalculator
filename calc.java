import java.io.*;
public class calc{
    public static void main (String[]args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int terms;
        double mean=0, SDev=0, variance;
        System.out.println("# of terms in set: ");
        terms = Integer.parseInt(br.readLine());
        System.out.println("Enter numbers: ");
        double num[] = new double[terms];
        for(int i = 0; i < terms; i++){
            num[i] = Double.parseDouble(br.readLine());
        }

        for(int i = 0; i<terms; i++) mean+=num[i];
        mean/=terms;

        for(int i = 0; i<terms; i++){
            SDev+=Math.pow((num[i]-mean), 2);
        }

        variance = SDev/(terms-1);
        SDev = Math.sqrt(variance);

        System.out.println("The variance is: "+(double)Math.round(variance*10000)/10000);
        System.out.println("The standard deviation is: "+(double)Math.round(SDev*10000)/10000);

    }
}