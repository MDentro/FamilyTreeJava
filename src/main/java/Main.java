public class Main {
    public static void main(String[] args) {
        Person jan = new Person("Jan", "Jansen", "male", 30);
        jan.addChildren("piet");
        jan.addChildren("henk");
        System.out.println(jan.getChildren());

        Pet max = new Pet("Max", 3, "Poedel");
        max.addOwner(jan.getName());
        System.out.println(max.getOwner());

        jan.addGrandChildren("Jantje");
        jan.addGrandChildren("Johanna");
        jan.addGrandChildren("Maria");
        System.out.println(jan.getGrandChildren());
    }
}
