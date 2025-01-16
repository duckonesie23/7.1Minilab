import java.util.*;
public class Main{
    public static void main(String[]args){
        ArrayList<String>favorites = new ArrayList<String>();
        Scanner userInput = new Scanner(System.in);
        

        for(int i = 0;i<=5;i++){
            System.out.println("What is your favorite drink");
            favorites.add(userInput.nextLine());
        }
        for(String str : favorites){
            System.out.println(str);
        }
    }
}