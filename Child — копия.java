package Dodatkowe1;

public class Child extends Osoba{

    int schoolClass;
    String dreamGift;
    private String [] hobbies = {"Video Games", "Making Videos", "Making Art", "Colouring", "Cooking", "Bike Riding", "Card Collecting", "Coding", "Running"};

    public Child(String name, String surname, int age, int schoolClass, String dreamGift) {
        super.name = name;
        super.surname = surname;
        super.age = age;
        this.schoolClass = schoolClass;
        this.dreamGift = dreamGift;
    }

    public String getHobby() {
        String hisHobby = null;
        int num = (int)(Math.random()*hobbies.length);
        for (int i = 0; i < hobbies.length; i++) {
            if (i == num) {
                hisHobby = hobbies[i];
            }
        }
        return hisHobby;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public String getDreamGift() {
        return dreamGift;
    }



}
