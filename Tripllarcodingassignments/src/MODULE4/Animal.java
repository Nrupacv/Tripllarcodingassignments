package Module4;

class Animal {
    void eat(){
        System.out.println("I am veg");
    }
}

class Dog extends Animal {
    void eat(){
        System.out.println("I am nonveg");
    }
}

class display {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}