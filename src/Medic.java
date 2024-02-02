public class Medic extends Hero {
    int healPoints;
    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health,damage,superAbilityType);
        this.healPoints = healPoints;

    }
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность DAMAGE");
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1 ;
    }
}
