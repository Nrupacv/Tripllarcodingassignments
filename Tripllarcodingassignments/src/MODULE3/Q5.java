package MODULE3;

public class constructor {
        String NAME;                   //attributes
        int USN;
        constructor(String name, int usn ) {   //parameterized constructor
            this.NAME = name;
            this.USN = usn;
        }
        void printdetails(){                     //function
            System.out.println("Student name is " +NAME);
            System.out.println("Student usn is " +USN);
        }
        public static void main(String[] args) {
            constructor s1 = new  constructor("sanju",123);
            constructor s2 = new  constructor("raju",259);
            s1.printdetails();
            s2.printdetails();
        }
    }
