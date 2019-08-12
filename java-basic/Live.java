import java.util.Scanner;
class Live{
    public static void main(String[] args){
        System.out.println("어디사니?");
        String name = "";
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("사는 곳은 " + name + "입니다.");
        System.out.println("one과 two를 입력해주세요");
        int one = 0;
        one = scanner.nextInt();
        int two = 0;
        two = scanner.nextInt();
        System.out.println("답은" + (one-two) + "입니다");
    }
}