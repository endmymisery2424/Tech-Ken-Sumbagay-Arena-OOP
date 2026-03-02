package com.techken.core;

import com.techken.model.BaseCharacter;

public class MatchManager {
    
    public void startMatch(BaseCharacter player1, BaseCharacter player2) {
        System.out.println("MatchManager: Fight started!");
        if (player1 == null || player2 == null) {
            System.out.println("MatchManager: Waiting for Character implementations from Member 3 & 4");
        }
    }
}
