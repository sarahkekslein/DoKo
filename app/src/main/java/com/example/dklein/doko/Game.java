package com.example.dklein.doko;

import java.util.ArrayList;

public class Game {

    private static Game instance;

    private ArrayList<Player> players = new ArrayList<>();

    private Game(ArrayList<Player> players){

        this.players.addAll(players);

    }

    public static Game getInstance(ArrayList<Player> players) {

        if (instance == null) {
            instance = new Game(players);
        }

        return instance;

    }






}
