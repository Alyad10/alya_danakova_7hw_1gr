public class Medic extends Hero{

    private double healPoints;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }


    public void increaseExperience(){
        setHealPoints(healPoints + (healPoints * 0.10));
        System.out.println("Medic healPoints: " + healPoints);
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic applied superAbility : MEDICAL DAMAGE");

    }
}
