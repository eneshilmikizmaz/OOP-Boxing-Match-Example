
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter f1) {
        System.out.println("------------");
        System.out.println(this.name + " => " + f1.name + " " + this.damage + " hasar vurdu.");

        if (f1.dodge()) {
            System.out.println(f1.name + " gelen hasarı savurdu.");
            return f1.health;
        }

        if (f1.health - this.damage < 0)
            return 0;

        return f1.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
