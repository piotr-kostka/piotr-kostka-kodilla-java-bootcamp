package com.kodilla.rps;


import java.util.*;

public class Game extends Details {

    public Game() {

        Details details = new Details();
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean end = false;

        HashMap<String, Move> playerChoiceMap = new HashMap<>();
        playerChoiceMap.put("1", new Kamien());
        playerChoiceMap.put("2", new Papier());
        playerChoiceMap.put("3", new Nozyce());

        List<Move> computerChoiceList = new ArrayList<>();
        computerChoiceList.add(new Kamien());
        computerChoiceList.add(new Papier());
        computerChoiceList.add(new Nozyce());

        details.getStartTitle();
        details.setPlayerName();
        details.setRoundsToWin();

        while (!end) {

            System.out.println("Wybierz: 1 - Kamień, 2 - Papier, 3 - Nożyce" + "\n" + "X - Zamknij grę, N - Nowa gra");
            String playerChoice = input.nextLine();
            Move playerMove = playerChoiceMap.get(playerChoice);

            if (playerChoice.equals("X")) {
                System.out.println("Czy chcesz zakończyć grę? T - tak, N - nie");
                String choice = input.nextLine().toUpperCase();

                if (choice.equals("T")) {
                    System.out.println("Koniec gry. Aplikacja zamknięta");
                    end = true;
                } else {
                    continue;
                }
            } else if (playerChoice.equals("N")) {
                System.out.println("Czy chcesz rozpocząć grę od nowa? T - tak, N - nie");
                String choice = input.nextLine().toUpperCase();

                if (choice.equals("T")) {
                    details.newGame();
                } else {
                    continue;
                }
            } else if (playerChoice.equals("1") || playerChoice.equals("2") || playerChoice.equals("3")) {
                System.out.println("Wybrałeś: " + playerMove.name());

                int computerChoice = random.nextInt(3);
                Move computerMove = computerChoiceList.get(computerChoice);
                System.out.println("Komputer wybrał: " + computerMove.name());

                RoundResult result = playerMove.winsWithMove(computerMove);

                if (result.isDraw()) {
                    details.draw();
                } else if (result.isWin()) {
                    details.playerWin();
                    if (details.playerScore == details.roundsToWin && details.playerScore > details.computerScore) {
                        details.playerWonGame();
                        System.out.println("Czy chcesz zagrać jeszcze raz? T - tak, N - nie");
                        String choice = input.nextLine().toUpperCase();

                        if (choice.equals("T")) {
                            details.newGame();
                        } else {
                            end = true;
                        }
                    } else {
                        continue;
                    }
                } else {
                    details.computerWin();
                    if (details.computerScore == details.roundsToWin && details.computerScore > details.playerScore) {
                        details.computerWonGame();
                        System.out.println("Czy chcesz zagrać jeszcze raz? T - tak, N - nie");
                        String choice = input.nextLine().toUpperCase();

                        if (choice.equals("T")) {
                            details.newGame();
                        } else {
                            end = true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
