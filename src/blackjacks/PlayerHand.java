package blackjacks;

import java.util.Scanner;

public class PlayerHand {
    public PlayerHand() {
    }

    String name = name();

    public String name() {
        System.out.println("Enter the player name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }
    public PlayerHand(String name) {
        this.name = name ;
    }

    public String getName() {
        return name;
    }
}



