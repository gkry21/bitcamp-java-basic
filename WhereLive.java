import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디사세요?");
        String name = "";
        Scanner scanner = new scanner(System.in);
        name = scanner.next();
        System.out.println("사는 곳은"+ name + "입니다.");
    }
}