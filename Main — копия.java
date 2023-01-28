package Dodatkowe1;

public class Main {

    public static void main(String[] args) {

        Santa santa = new Santa("Santa", "Clouse", 65);

        Child Lukasz = new Child("Lukasz", "Kowalczyk", 12, 6, "Telefon");
        Child Magda = new Child("Magda", "Lukaszewska", 10, 4, "Zabawka");
        Child Jan = new Child("Jan", "Stsepura", 18, 12,"Monitor");
        Child Alesza = new Child("Alesza", "Barboskin", 18, 12, "IPhone");

        Gift telefon = new Gift("Telefon", 100);
        Gift zabawka = new Gift("Zabawka", 60);
        Gift laptop = new Gift( "Laptop", 400);
        Gift iphone = new Gift("IPhone", 300);

        santa.startWork();

        santa.addGift(telefon);
        santa.addGift(zabawka);
//        santa.addGift(laptop);
        santa.addGift(iphone);

        santa.stopWork();

        System.out.println(santa.joke());
        System.out.println(santa.findHeaviest().content);

        santa.visitCity("Warszawa");
        santa.visitCity("Katowice");
        santa.visitCity("Warszawa");

        santa.stopWork();
//        santa.showarr();
        santa.giveGifts(Alesza);
        santa.giveGifts(Magda);
        santa.giveGifts(Jan);

//        santa.showarr();

        santa.stopWork();


    }

}
