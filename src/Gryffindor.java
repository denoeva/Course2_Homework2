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

    public String printGryffindor() {
        return "Имя: " + getFullName()
                + ", факультет: " + getFaculty()
                + ", мощность колдовства: " + getPowerSorcery()
                + ", расстояние трансгрессии: " + getDistanceTransgression()
                + ", благородство: " + getNobility()
                + ", честь: " + getHonor()
                + ", храбрость: " + getCourage();
    }
}
