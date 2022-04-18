package com.kodilla.rps;

import java.util.Scanner;

public class Details {

    Scanner choice = new Scanner(System.in);

    String playerName;
    int roundsToWin;
    int computerScore;
    int playerScore;

    public void getStartTitle() {
        System.out.println("Witamy w grze: KAMIEN - PAPIER - NOZYCE");
    }

    public String setPlayerName() {
        System.out.println("Podaj swoje imię:");
        playerName = choice.nextLine();

        return playerName;
    }

    public int setRoundsToWin() {
        System.out.println("Podaj do ilu wygranych rund chcesz grać:");
        roundsToWin = choice.nextInt();

        return roundsToWin;
    }

    public void newGame() {
        computerScore = 0;
        playerScore = 0;
        System.out.println("Gra rozpoczęta od nowa!");
        getStartTitle();
        setRoundsToWin();
    }

    public void playerWin() {
        playerScore++;
        System.out.println("Wygrałeś rundę! Aktualny wynik: " + playerName + " " + playerScore + ":" + computerScore + " Komputer");
    }

    public void computerWin() {
        computerScore++;
        System.out.println("Komputer wygrał tę rundę! Aktualny wynik: " + playerName + " " + playerScore + ":" + computerScore + " Komputer");
    }

    public void draw() {
        System.out.println("Remis! Bez punktów! Aktualny wynik: " + playerName + " " + playerScore + ":" + computerScore + " Komputer");
    }

    public void playerWonGame() {
        System.out.println("Gratulacje! Wygrałeś grę!" + "\n" + "Końcowy wynik: " + playerName + " " + playerScore + ":" + computerScore + " Komputer");
    }

    public void computerWonGame() {
        System.out.println("Koniec gry! Komputer wygrał grę!" + "\n" + "Końcowy wynik: " + playerName + " " + playerScore + ":" + computerScore + " Komputer");
    }
}
