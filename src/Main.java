public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        medic.setHealPoints(80.0);


        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }
            heroes[i].applySuperAbility();
        }


    }
}
