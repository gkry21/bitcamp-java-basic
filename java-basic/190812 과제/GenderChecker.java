import java.util.Scanner;
/**
������ �츮���� �ֹι�ȣ ü���Դϴ�.
9 : 1800 ~ 1899�⿡ �¾ ����
0 : 1800 ~ 1899�⿡ �¾ ����
1 : 1900 ~ 1999�⿡ �¾ ����
2 : 1900 ~ 1999�⿡ �¾ ����
3 : 2000 ~ 2099�⿡ �¾ ����
4 : 2000 ~ 2099�⿡ �¾ ����
5 : 1900 ~ 1999�⿡ �¾ �ܱ��� ����
6 : 1900 ~ 1999�⿡ �¾ �ܱ��� ����
7 : 2000 ~ 2099�⿡ �¾ �ܱ��� ����
8 : 2000 ~ 2099�⿡ �¾ �ܱ��� ����

�Է¹��� �ֹε�Ϲ�ȣ�� ������ ��� ������� �������� ���α׷��� �ۼ��Ͻÿ�.
String ssn = 900101-123456 �̶�� �ֹε�Ϲ�ȣ�� �Է¹�����
String num = ssn.substring(7,8) �̶�� �ϸ�
1�� ���ɴϴ�
��Ʈ�� �ѹ��� 1�� ��� ���� 1900 ~ 1999�⿡ �¾ ����
*/
class GenderChecker{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("�ֹε�Ϲ�ȣ�� �Է��Ͽ� �ֽʽÿ�");
String ssn = "";
ssn = scan.next();
String num = ssn.substring(7,8);
if (num.equals("9")){
System.out.println("1800 ~ 1899�⿡ �¾ ����");
} else if (num.equals("0")){
System.out.println("1800 ~ 1899�⿡ �¾ ����");
} else if (num.equals("1")){
System.out.println("1900 ~ 1999�⿡ �¾ ����");
} else if (num.equals("2")){
System.out.println("1900 ~ 1999�⿡ �¾ ����");
} else if (num.equals("3")){
System.out.println("2000 ~ 2099�⿡ �¾ ����");
} else if (num.equals("4")){
System.out.println("2000 ~ 2099�⿡ �¾ ����");
} else if (num.equals("5")){
System.out.println("1900 ~ 1999�⿡ �¾ �ܱ��� ����");
} else if (num.equals("6")){
System.out.println("1900 ~ 1999�⿡ �¾ �ܱ��� ����");
} else if (num.equals("7")){
System.out.println("2000 ~ 2099�⿡ �¾ �ܱ��� ����");
} else {
System.out.println("2000 ~ 2099�⿡ �¾ �ܱ��� ����");
}
}
}