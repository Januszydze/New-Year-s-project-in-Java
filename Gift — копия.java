package Dodatkowe1;

public class Gift {

    static int id;
    String content;
    int weight;

    public Gift(String content, int weight) {
        id = (int)(Math.random()*10000);
        this.content = content;
        this.weight = weight;
    }


}
