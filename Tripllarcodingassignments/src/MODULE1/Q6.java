package MODULE1;

public class Q6 {
    public class swap_without {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two numbers to swap");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Before swapping: a ="+ a + " ,b="+ b);
            a=a^b;
            b=a^b;
            a=a^b;
            System.out.println("after swapping: a="+ a +" ,b="+b);
        }
}
