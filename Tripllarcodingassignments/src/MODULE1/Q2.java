package MODULE1;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("the addition of 2 numbers is " +add);
        int sub = a-b;
        System.out.println("the subtraction of 2 numbers is " +sub);
        int mul = a*b;
        System.out.println("the multiplication of 2 numbers is " +mul);
        double div = (double) a / b;
        System.out.println("the division of 2 numbers is " +div);
    }
}
