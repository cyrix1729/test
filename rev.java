import java.util.*;
class rev{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        print("Enter text to reverse...");
        String txt = scanner.nextLine();
        String acc = "";
        for(int i=txt.length()-1; i>-1; i--){
            acc += (txt.charAt(i));
        }
        print(acc);
    }
    public static <T> void print(T val){
        System.out.println(val);
    }

}