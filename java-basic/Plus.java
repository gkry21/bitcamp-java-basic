import java.util.Scanner;
class Plus{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("첫번째 수?");
        a = scanner.nextInt();
        System.out.println("두번째 수?");
        b = scanner.nextInt();
        int c = a + b;
        System.out.print(String.format("%d + %d = %d", a, b, c));
    }
}