import java.util.Scanner;
public class ass6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.next();
        input = input.toLowerCase();
        for(int i = 0; i < input.length(); i++){
            char c= input.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c =='u') {

                continue;
            }
                System.out.println(c);
            }
        }
    }

