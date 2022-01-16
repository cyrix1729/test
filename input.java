import java.util.*;
class test{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        print("Say something...");
        String input = scanner.nextLine();
        print(input);
    }
    public static <T> void print(T value){
        System.out.println(value);
    }
}