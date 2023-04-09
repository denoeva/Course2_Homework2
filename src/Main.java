public class Main {

    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри Поттер", "Гриффиндор", 50, 15, 60, 60, 60);
        Gryffindor granger = new Gryffindor("Гермиона Грейнджер", "Гриффиндор", 45, 10, 80, 80, 80);
        Gryffindor weasley = new Gryffindor("Рон Уизли", "Гриффиндор", 15, 1, 30, 30, 30);

        Hufflepuff smith = new Hufflepuff("Захария Смит", "Пуффендуй", 35, 10, 65, 55, 75);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори", "Пуффендуй", 45, 20, 75, 65, 85);
        Hufflepuff finch = new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 25, 10, 55, 40, 60);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", "Когтевран", 22, 12, 72, 52, 22, 82);
        Ravenclaw patil = new Ravenclaw("Падма Патил", "Когтевран", 45, 20, 52, 72, 72, 62);
        Ravenclaw belby = new Ravenclaw("Маркус Белби", "Когтевран", 42, 22, 42, 22, 32, 72);

        Slytherin malfoy = new Slytherin("Драко Малфой", "Слизерин", 35, 10, 77, 77, 77, 77, 77);
        Slytherin montague = new Slytherin("Грэхэм Монтегю", "Слизерин", 45, 16, 34, 67, 56, 67, 34);
        Slytherin goyle = new Slytherin("Грегори Гойл", "Слизерин", 54, 10, 54, 43, 76, 54, 65);

        System.out.println("=== Информация по ученикам разных факультетов ===");
        System.out.println(potter.toString());
        System.out.println(diggory.toString());
        System.out.println(belby.toString());
        System.out.println(malfoy.toString());

        System.out.println();

        System.out.println("=== Сравнение учеников одного факультета (Гриффиндор) ===");
        potter.compareTwoGryffindorStudents(weasley);
        granger.compareTwoGryffindorStudents(potter);

        System.out.println();

        System.out.println("=== Сравнение учеников одного факультета (Слизерин) ===");
        malfoy.compareTwoSlytherinStudents(goyle);
        montague.compareTwoSlytherinStudents(goyle);

        System.out.println();

        System.out.println("=== Сравнение учеников разных факультетов ===");
        potter.compareTwoHogwartsStudents(malfoy);
        patil.compareTwoHogwartsStudents(diggory);
    }
}

