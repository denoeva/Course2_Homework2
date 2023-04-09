public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    private String printGryffindor;

    public Gryffindor(String fullName, String faculty, int powerSorcery, int distanceTransgression, int nobility, int honor, int courage) {
        super(fullName, faculty, powerSorcery, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", благородство - " + getNobility()
                + ", честь - " + getHonor()
                + ", храбрость - " + getCourage();
    }

    private int getGryffindorTotalPower() {
        return nobility + honor + courage;
    }

    public void compareTwoGryffindorStudents(Gryffindor other) {
        if (other.getGryffindorTotalPower() < this.getGryffindorTotalPower()) {
            System.out.println("Ученик " + this.getFullName() + " сильнее, чем ученик " + other.getFullName());
        } else if (other.getGryffindorTotalPower() > this.getGryffindorTotalPower()) {
            System.out.println("Ученик " + other.getFullName() + " сильнее, чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученики имеют равную силу");
        }
    }
}
