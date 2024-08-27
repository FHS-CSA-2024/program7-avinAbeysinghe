package src.main.java;
import java.util.Scanner; 



public class Program7
{
    //klevin -> schrute buck
    final double klevinConvert(int k){
        double decimal = (double)k / 20;
        return decimal;
    }
    //stanley -> shrute buck
    final double snConvert(int sn){
        double decimal = (double)sn / 12 / 20; 
        return decimal;
    }
    

    public static void main(String[] args){
        int schruteBuck, klevin, stanleyNickel;
        double myTestVal = 0.0;
        Program7 tester = new Program7();
        Scanner reader = new Scanner(System.in);
        
        
        
        System.out.println("Enter schrute-bucks: ");
        schruteBuck = reader.nextInt();
        System.out.println("Enter klevins: ");
        klevin = reader.nextInt();
        System.out.println("Enter stanley-nickels: ");
        stanleyNickel = reader.nextInt();
        
        myTestVal = tester.convertMoney(schruteBuck,stanleyNickel,klevin);
        
        System.out.println("Decimal schrute-bucks: $"+ myTestVal);
    }
    
    
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        double conversion = (double)schruteBucks + klevinConvert(klevins) + snConvert(stanleyNickels);
        return conversion;
    }
    
    
}
