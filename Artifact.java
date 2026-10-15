public class Artifact {
    String material;

    public Artifact(String material) {
        this.material = material;
        System.out.println("A relic of " + material + " is being forged.");
    }

    public static void main(String[] args) {
        DivineWeapon stormWeapon = new DivineWeapon("Storm");
        System.out.println();

        DivineWeapon defaultWeapon = new DivineWeapon();
    }
}

class DivineWeapon extends Artifact {
    private String essenceType;

    public DivineWeapon(String essenceType) {
        super("Celestial Bronze");
        this.essenceType = essenceType;
        System.out.println("Its essence is now glowing with "
                + essenceType + " energy.");
    }

    public DivineWeapon() {
        this("Pure Sunlight");
    }
}