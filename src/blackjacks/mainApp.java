package blackjacks;

import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        int points=0;
        Deck deck = new Deck();
        deck.draw();
        PlayerHand name = new PlayerHand();
        System.out.println(" Player name : " + name.getName());
        Card card1 = deck.getCard();
        Card card1CPU = deck.getCard();
        Card card2 = deck.getCard();
        Card card2CPU = deck.getCard();
        System.out.println("card1 = " + card1);
        System.out.println("card2 = " + card2);
        points = card1.rank+ card2.rank;
        int pointsCPU = card1CPU.rank+ card2CPU.rank;
        System.out.println("points = " + points);
        if (pointsCPU<16){
            System.out.println("CPU take card!");
            Card card3CPU = deck.getCard();
            pointsCPU = card1CPU.rank+ card2CPU.rank+card3CPU.rank;
            if (pointsCPU<16){
                System.out.println("CPU take card!");
                Card card4CPU = deck.getCard();
                pointsCPU = card1CPU.rank+ card2CPU.rank+card3CPU.rank+card4CPU.rank;
            }
        }
        if (points ==21){
            System.out.println("Congratulation you win!!!!!!");
        }if (points > 21){
            System.out.println("You lose!!!!!!");
        }
        if ( points< 21){
            System.out.println("Take card : yes/no");
            deck.draw();
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            deck.draw();
            switch (choice){
                case "yes":
                    Card card3 = deck.getCard();
                    System.out.println("card3 = " + card3);
                    points = card1.getRank() + card2.rank + card3.rank;
                    System.out.println("points = " + points);
                    deck.draw();
                    if ( points< 21){
                        System.out.println("Take card : yes/no");
                        deck.draw();
                        Scanner scanner1 = new Scanner(System.in);
                        String choice1 = scanner.next();
                        switch (choice1){
                            case "yes":
                                Card card4 = deck.getCard();
                                System.out.println("card4 = " + card4);
                                points = card1.getRank() + card2.rank + card3.rank + card4.rank;
                                System.out.println("points3 = " + points);
                                System.out.println("Take card : yes/no");
                                Scanner scanner2 = new Scanner(System.in);
                                String choice2 = scanner.next();
                                switch (choice2){
                                    case "yes":
                                        Card card5 = deck.getCard();
                                        System.out.println("card5 = " + card5);
                                        points = card1.getRank() + card2.rank + card3.rank + card4.rank+ card5.rank;
                                        System.out.println("points4 = " + points);

                                    case "no":
                                        System.out.println("pointsCPU = " + pointsCPU);
                                        if (points>pointsCPU & points <=21){
                                            System.out.println("Congratulation you win!!!!!!");
                                        }
                                        if (points>21){
                                            System.out.println("You lose!!!!!!");
                                        }
                                        if (pointsCPU>points & pointsCPU<=21) {
                                            System.out.println("You lose!!!!!!");
                                        }if (points == pointsCPU){
                                        System.out.println("points = " + points);
                                        System.out.println(" CPU WIN" );
                                    }
                                        if (points <=21 & pointsCPU>21 ){
                                            System.out.println("You Win : points = " + points);
                                        }
                                        if ( points> 21 & pointsCPU >21){
                                            System.out.println("points = " + points);
                                            System.out.println("pointsCPU = " + pointsCPU);
                                            System.out.println(" CPU WIN WIN WIN " );
                                        }
                                        break;
                                }
                            case "no":
                                System.out.println("pointsCPU = " + pointsCPU);
                                if (points>pointsCPU & points <=21){
                                    System.out.println("Congratulation you win!!!!!!");
                                }
                                if (points>21){
                                    System.out.println("You lose!!!!!!");
                                }
                                if (pointsCPU>points & pointsCPU<=21) {
                                    System.out.println("You lose!!!!!!");
                                }
                                if (points == pointsCPU){
                                    System.out.println("points = " + points);
                                    System.out.println(" CPU WIN" );
                                }
                                if (points <=21 & pointsCPU>21 ){
                                    System.out.println("You Win : points = " + points);
                                }
                                if ( points> 21 & pointsCPU >21){
                                    System.out.println("points = " + points);
                                    System.out.println("pointsCPU = " + pointsCPU);
                                    System.out.println(" CPU WIN WIN WIN " );
                                }
                            }break;
                        }

                case "no":
                    System.out.println("pointsCPU = " + pointsCPU);
                    if (points>pointsCPU & points <=21  ){
                        System.out.println("Congratulation you win!!!!!!");
                    }
                    if (points>21){
                        System.out.println("You lose!!!!!!");
                    }
                    if (pointsCPU>points & pointsCPU<=21){
                        System.out.println("You lose!!!!!!");
                    }
                    if (points == pointsCPU){
                        System.out.println("points = " + points);
                        System.out.println(" CPU WIN" );
                    }
                    if (points <=21 & pointsCPU>21 ){
                        System.out.println("You Win : points = " + points);
                    }
                    if ( points> 21 & pointsCPU >21){
                        System.out.println("points = " + points);
                        System.out.println("pointsCPU = " + pointsCPU);
                        System.out.println(" CPU WIN WIN WIN " );
                    }
                }
            } deck.draw();
        }
    }



