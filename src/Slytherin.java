public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, String faculty, int powerSorcery, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, faculty, powerSorcery, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", хитрость - " + getCunning()
                + ", решительность - " + getDetermination()
                + ", амбициозность - " + getAmbition()
                + ", находчивость - " + getResourcefulness()
                + ", жажда власти - " + getLustForPower();
    }

    private int getSlytherinTotalPower() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareTwoSlytherinStudents(Slytherin other) {
        if (other.getSlytherinTotalPower() < this.getSlytherinTotalPower()) {
            System.out.println("Ученик " + this.getFullName() + " сильнее, чем ученик " + other.getFullName());
        } else if (other.getSlytherinTotalPower() > this.getSlytherinTotalPower()) {
            System.out.println("Ученик " + other.getFullName() + " сильнее, чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученики имеют равную силу");
        }
    }
}
