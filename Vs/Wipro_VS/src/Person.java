class Person {
    public static void main(String[] args) {
        stuu s1 = new stuu();
        s1.set_name("Jatin");
        s1.set_roll(1);
        s1.info();
    }
}

class persoonn {
    String name;

    public void set_name(String n) {
        name = n;
    }

    public void info() {
        System.out.println("Parent class Name is: " + name);
    }
}

class stuu extends persoonn {
    int roll;

    public void set_roll(int n) {
        roll = n;
    }

    public void info() {
        super.info();
        System.out.println("Child class Name: " + name);
        System.out.println("Roll no.: " + roll);
    }
}