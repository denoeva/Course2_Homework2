public abstract class Hogwarts {
    private String fullName;
    private String faculty;
    private int powerSorcery;
    private int distanceTransgression;

    public Hogwarts(String fullName, String faculty, int powerSorcery, int distanceTransgression) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.powerSorcery = powerSorcery;
        this.distanceTransgression = distanceTransgression;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getPowerSorcery() {
        return powerSorcery;
    }

    public void setPowerSorcery(int powerSorcery) {
        this.powerSorcery = powerSorcery;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    @Override
    public String toString() {
        return "Ученик школы Хогвартс: " +
                "имя - " + fullName +
                ", факультет - " + faculty +
                ", мощность колдовства - " + powerSorcery +
                ", дистанция трансгрессии - " + distanceTransgression;
    }

    private int getTotalPower() {
        return powerSorcery + distanceTransgression;
    }

    public void compareTwoHogwartsStudents(Hogwarts other) {
        if (other.getTotalPower() < this.getTotalPower()) {
            System.out.println("Ученик " + this.getFullName() + " факультета " + this.getFaculty() + " сильнее, чем ученик " + other.getFullName() + " факультета " + other.getFaculty());
        } else if (other.getTotalPower() > this.getTotalPower()) {
            System.out.println("Ученик " + other.getFullName() + " факультета " + other.getFaculty() + " сильнее, чем ученик " + this.getFullName() + " факультета " + this.getFaculty());
        } else {
            System.out.println("Ученики " + other.getFullName() + " и " + this.getFullName() + " имеют равную силу");
        }
    }
}
