public class Main {

    public static void main(String[] args) {
    Gryffindor[] gryffindor = {
            new Gryffindor("Гарри Поттер", "Гриффиндор", 50, 15, 60, 60, 60),
            new Gryffindor("Гермиона Грейнджер", "Гриффиндор", 45, 10, 80, 80, 80),
            new Gryffindor("Рон Уизли", "Гриффиндор", 15, 1, 30, 30, 30),
    };

    Hufflepuff[] hufflepuff = {
            new Hufflepuff("Захария Смит", "Пуффендуй", 35, 10, 65, 55, 75),
            new Hufflepuff("Седрик Диггори", "Пуффендуй", 45, 20, 75, 65, 85),
            new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 25, 10, 55, 40, 60),
    };

    Ravenclaw[] ravenclaw = {
            new Ravenclaw("Чжоу Чанг", "Когтевран", 22, 12, 72, 52, 22, 82),
            new Ravenclaw("Падма Патил", "Когтевран", 32, 22, 52, 72, 72, 62),
            new Ravenclaw("Маркус Белби", "Когтевран", 42, 22, 42, 22, 32, 72),
    };

    Slytherin[] slytherin = {
            new Slytherin("Драко Малфой", "Слизерин", 35, 10, 77, 77, 77, 77, 77),
            new Slytherin("Грэхэм Монтегю", "Слизерин", 45, 16, 34, 67, 56, 67, 34),
            new Slytherin("Грегори Гойл", "Слизерин", 54, 10, 54, 43, 76, 54, 65),
    };

    for (Gryffindor gryffindors : gryffindor) {
        System.out.println("Имя: " + gryffindors.getFullName()
                + ", факультет: " + gryffindors.getFaculty()
                + ", мощность колдовства: " + gryffindors.getPowerSorcery()
                + ", расстояние трансгрессии: " + gryffindors.getDistanceTransgression()
                + ", благородство: " + gryffindors.getNobility()
                + ", честь: " + gryffindors.getHonor()
                + ", храбрость: " + gryffindors.getCourage());
    }

        System.out.println();

    for (Hufflepuff hufflepuffs : hufflepuff) {
        System.out.println("Имя: " + hufflepuffs.getFullName()
                + ", факультет: " + hufflepuffs.getFaculty()
                + ", мощность колдовства: " + hufflepuffs.getPowerSorcery()
                + ", расстояние трансгрессии: " + hufflepuffs.getDistanceTransgression()
                + ", трудолюбие: " + hufflepuffs.getIndustriousness()
                + ", верность: " + hufflepuffs.getLoyalty()
                + ", честность: " + hufflepuffs.getHonesty());
    }

        System.out.println();

    for (Ravenclaw ravenclaws : ravenclaw) {
        System.out.println("Имя: " + ravenclaws.getFullName()
                + ", факультет: " + ravenclaws.getFaculty()
                + ", мощность колдовства: " + ravenclaws.getPowerSorcery()
                + ", расстояние трансгрессии: " + ravenclaws.getDistanceTransgression()
                + ", ум: " + ravenclaws.getMind()
                + ", мудрость: " + ravenclaws.getWisdom()
                + ", остроумие: " + ravenclaws.getWisdom()
                + ", творчество: " + ravenclaws.getCreativity());
    }

        System.out.println();

    for (Slytherin slytherins : slytherin) {
        System.out.println("Имя: " + slytherins.getFullName()
                + ", факультет: " + slytherins.getFaculty()
                + ", мощность колдовства: " + slytherins.getPowerSorcery()
                + ", расстояние трансгрессии: " + slytherins.getDistanceTransgression()
                + ", хитрость: " + slytherins.getCunning()
                + ", решительность: " + slytherins.getDetermination()
                + ", амбициозность: " + slytherins.getAmbition()
                + ", находчивость: " + slytherins.getResourcefulness()
                + ", жажда власти: " + slytherins.getLustForPower());
    }
    }
}

