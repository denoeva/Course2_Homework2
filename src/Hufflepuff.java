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
}
