package MODULE3;

    public class positivenum {
        void num ( int n){
            if (n > 0) {
                System.out.println(n + " is positive");
            } else if (n < 0) {
                System.out.println(n + " is negative");
            } else {
                System.out.println("the number is zero");
            }
        }
        public static void main(String[] args) {
            positivenum obj = new positivenum();
            obj.num(10);
            obj.num(-7);
            obj.num(0);
        }
}
