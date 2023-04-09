public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, String faculty, int powerSorcery, int distanceTransgression, int mind, int wisdom, int wit, int creativity) {
        super(fullName, faculty, powerSorcery, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", ум - " + getMind()
                + ", мудрость - " + getWisdom()
                + ", остроумие - " + getWit()
                + ", творчество - " + getCreativity();
    }

    private int getRavenclawTotalPower() {
        return wisdom + wit + creativity;
    }

    public void compareTwoRavenclawStudents(Ravenclaw other) {
        if (other.getRavenclawTotalPower() < this.getRavenclawTotalPower()) {
            System.out.println("Ученик " + this.getFullName() + " сильнее, чем ученик " + other.getFullName());
        } else if (other.getRavenclawTotalPower() > this.getRavenclawTotalPower()) {
            System.out.println("Ученик " + other.getFullName() + " сильнее, чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученики имеют равную силу");
        }
    }
}
