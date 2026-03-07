package MODULE1;

public class Q5 {
    public class swap_with {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two numbers to swap");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Before swapping: a ="+ a + " ,b="+ b);
            int temp =a;
            a=b;
            b=temp;
            System.out.println("after swapping: a="+ a +" ,b="+b);
        }
}
