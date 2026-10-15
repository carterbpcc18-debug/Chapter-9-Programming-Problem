public class Artifact {
    String material;

    public Artifact(String material) {
        this.material = material;
        System.out.println("A relic of " + material + " is being forged.");
    }

    public static void main(String[] args) {
        Artifact relic = new Artifact("Silver");
    }
}