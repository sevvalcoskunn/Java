import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Değer giriniz: ");
        String str = input.next();
        System.out.println(convertRepeats(str));
    }

    public static String convertRepeats(String str) throws IllegalArgumentException {
       
        if (str == null || str.length() == 0 || str.trim() == "") {
            throw new IllegalArgumentException("Değer boş!");
        }
          Scanner input = new Scanner(System.in);
        String result = "";

    
        int sayi =1;
        for (int i = 0; i < str.length()+1; i++) {
            int j = i+1;

            if(j < str.length())
            {

                if(str.charAt(i) != str.charAt(j))
                {
                    if(sayi == 1)
                    {
                        result = result + String.valueOf(str.charAt(i));
                        
                    }
                    else
                    {
                        result = result + String.valueOf(str.charAt(i))+sayi;
                        sayi = 1;
                    }
                   
                }
                else
                {
                    sayi++;
                }
            }
            
            else 
            {
                if(j == str.length()){
                    result = result + String.valueOf(str.charAt(i));
                }
                break;
            }
            
        }
        return result;
    }
}
