package MODULE3;

    public class sts_attributes {
        String name;
        int marks;
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }
        public static void main(String[] args) {
            sts_attributes  s1 = new sts_attributes ();
            s1.name = "Manu";
            s1.marks = 80;
            s1.display();
        }
    }
