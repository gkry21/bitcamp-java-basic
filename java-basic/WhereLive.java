import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디사세요?");
        String place = "";
        Scanner scanner = new Scanner(System.in);
        place = scanner.next();
        System.out.println(String.format("나는 %s에 삽니다", place));
    }
}