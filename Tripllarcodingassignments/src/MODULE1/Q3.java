package MODULE1;

public class Q3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        int r = sc.nextInt();
        double area = (double)Math.PI*r*r;
        System.out.println("the area of circle is " +area);
    }
}

