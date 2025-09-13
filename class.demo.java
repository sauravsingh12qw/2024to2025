class ThsDemo {
    int a, b;

    // Method to set values
    public void get(int x, int y) {
        a = x;
        b = y;
    }

    // Method to display values
    public void put() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        ThsDemo obj = new ThsDemo(); // create object
        obj.get(10, 20);             // call method to assign values
        obj.put();                   // call method to display values
    }
}
