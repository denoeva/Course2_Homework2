public class Hogwarts {
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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
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
}
