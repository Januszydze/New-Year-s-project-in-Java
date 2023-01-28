package Dodatkowe1;

public class Santa extends Osoba{

    private boolean isWorking = false;
    private String cityLocation = null;
    private String [] cityHistory = new String[0];
    private static String [] naughtyKids = {"Lukasz"};
    private Gift[] gifts = new Gift[0];
    private String [] jokes = {"Dlaczego sklep rozdaje darmowe baterie w czasie świąt? Bo są za darmo!", "Dokąd idą elfy, by oddać swój głos? Udają się na Plebiscyt Północny.",
                                "Kto dostarcza kotom prezenty świąteczne? Santa Paws.", "Strach na wróble dostał w tym roku dużą premię świąteczną. Był bardzo wybitny w swojej dziedzinie.",
                                "Dlaczego Rudolph dostał złą ocenę z historii? Bo się w niej pogrążył."};

    public Santa(String name, String surname, int age) {
        super.name = name;
        super.surname = surname;
        super.age = age;
    }

    public void startWork() {
        if (isWorking == true) {
            System.out.println("Santa is already working");
        }
        else {
            isWorking = true;
        }
    }


    public void showarr() {
        for (int i = 0; i < gifts.length; i++) {
            System.out.print(gifts[i].content + " ");
        }
    }
    public void stopWork() {
        if (gifts.length > 0) {
            System.out.println("There are still gifts");
        }
        else {
            System.out.println("Santa finished the job");
        }
    }

    public void giveGifts(Child child) {
        boolean naughty = false;
        for (int i = 0; i < naughtyKids.length; i++) {
            if (naughtyKids[i].equals(child.getName())) {
                naughty = true;
            }
        }
        if (naughty == true) {
            System.out.println(child.name + " - This is a naughty child");
        }
        else {
            System.out.println(child.name + " - Dziekuje za prezent");
            if (gifts[gifts.length - 1].content.equals(child.dreamGift)) {
                System.out.println(child.name + " - Marzyl o tym prezencie");
            }
            Gift [] copy = new Gift[gifts.length - 1];
            for (int i = 0; i < copy.length; i++) {
                copy[i] = gifts[i];
            }
            gifts = copy;
        }
    }


    public void visitCity(String city) {
        boolean inList = false;
        for (int i = 0; i < cityHistory.length; i++) {
            if (cityHistory[i].equals(city)) {
                inList = true;
            }
        }
        if (inList == true) {
            System.out.println("Santa has already been to this city - " + city);
        }
        else {
            cityLocation = city;
            String [] copy = cityHistory;
            cityHistory = new String[copy.length + 1];
            for (int i = 0; i < copy.length; i++) {
                cityHistory[i] = copy[i];
            }
            cityHistory[cityHistory.length - 1] = city;
            System.out.println("Santa is on his way to the city - " + city);
        }
    }

    public Gift findHeaviest() {
        Gift max = gifts[0];
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i].weight > max.weight) {
                max = gifts[i];
            }
        }
        return max;
    }

    public void addGift(Gift gift) {
        Gift copy [] = gifts;
        gifts = new Gift[copy.length + 1];
        for (int i = 0; i < copy.length; i++) {
            gifts[i] = copy[i];
        }
        gifts[gifts.length - 1] = gift;
    }

    public void addGift() {
        Gift gift = new Gift("Uscisk prezesa", 0);
        Gift copy [] = gifts;
        gifts = new Gift[copy.length + 1];
        for (int i = 0; i < copy.length; i++) {
            gifts[i] = copy[i];
        }
        gifts[gifts.length - 1] = gift;
    }

    public String joke() {
        int num = (int)(Math.random()*5);
        String joke = null;
        for (int i = 0; i < jokes.length; i++) {
            if (num == i) {
                joke = jokes[i];
            }
        }
        return joke;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCityLocation() {
        return cityLocation;
    }
}