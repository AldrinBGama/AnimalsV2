public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        Dog dog = new Dog();
        dog.setName("Rax");
        dog.eats();
        dog.sounds();

        System.out.println(" ");

        Cat cat = new Cat();
        cat.setName("Stormy");
        cat.eats();
        cat.sounds();

        Home home =new Home();
        Dog dog1= new Dog();
        Dog dog2= new Dog();
        Cat cat1= new Cat();

        System.out.println(" ");

        home.makeAllSounds();
        home.adoptPet(dog1);
        home.makeAllSounds();

        home.adoptPet(cat1);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();

    }

}
