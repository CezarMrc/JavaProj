package AnimalRescue;

public class Animal {
    public static void main(String[] args) {

        Dog Rudolf = new Dog();
        Rudolf.name ="Rudolf";

        float age = 1.5f;
        Rudolf.levelofhealt = "10";
        Rudolf.levelofhunger = "4";
        Rudolf.levelofmood = "8";
        Rudolf.favoritefood = "Royal Canin";
        Rudolf.favoriteactivity = "bring the toy";


        System.out.println(Rudolf.name);
        System.out.println(Rudolf.levelofhealt);
        System.out.println(Rudolf.levelofhunger);
        System.out.println(Rudolf.levelofmood);
    }
}
