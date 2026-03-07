package MODULE2;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the three numbers num1,num2,num3:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>num2&&num1>num3){
            System.out.println("num1 is greater number");
        } else if (num2>num1&&num2>num3){
            System.out.println("num2 is greater number");
        }else{
            System.out.println("num3 is greater number");
        }


    }
}
