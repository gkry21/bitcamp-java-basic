import java.util.Scanner;
class Je{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("첫번째 수는?");
        a = scan.nextInt();
        System.out.println("두번째 수는?");
        b = scan.nextInt();
        System.out.println("연산종류를 선택하세요. +, -, *, /");
        String op = "";
        op = scan.next();
        if(op.equals("+")){
           c = a + b;
           System.out.println(String.format("%d + %d = %d", a, b, c));
        } else if(op.equals("-")){
           c = a - b;
           System.out.println(String.Format("%d - %d = %d", a, b, c));
        } else if(op.equals("*")){
           c = a * b;
           System.out.println(String.Format("%d * %d = %d", a, b, c));
        } else if(op.equals("/")){
          c = a / b;
          System.out.println(String.Format("%d / %d = %d", a, b, c));
        }
    }
}