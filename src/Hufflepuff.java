public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, String faculty, int powerSorcery, int distanceTransgression, int industriousness, int loyalty, int honesty) {
        super(fullName, faculty, powerSorcery, distanceTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", трудолюбие - " + getIndustriousness()
                + ", верность - " + getLoyalty()
                + ", честность - " + getHonesty();
    }

    private int getHufflepuffTotalPower() {
        return industriousness + loyalty + honesty;
    }

    public void compareTwoHufflepuffStudents(Hufflepuff other) {
        if (other.getHufflepuffTotalPower() < this.getHufflepuffTotalPower()) {
            System.out.println("Ученик " + this.getFullName() + " сильнее, чем ученик " + other.getFullName());
        } else if (other.getHufflepuffTotalPower() > this.getHufflepuffTotalPower()) {
            System.out.println("Ученик " + other.getFullName() + " сильнее, чем ученик " + this.getFullName());
        } else {
            System.out.println("Ученики имеют равную силу");
        }
    }
}
