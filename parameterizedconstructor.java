class Geeks {
    String name;
    int id;

    
    Geeks() {
        System.out.println("My name is this");
    }

    
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public static void main(String[] args) {
        Geeks geek = new Geeks("Rishabh", 99);
        System.out.println("Name = " + geek.name + "  id = " + geek.id);

        Geeks gee = new Geeks(); // Calls default constructor
    }
}
