public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "Teleportation"),
                new Medic(120, 15, "Healing", 55),
                new Warrior(150, 25, "CRITICAL DAMAGE")};
        for (Hero hero : heroes) {
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();}
        }
    }
}