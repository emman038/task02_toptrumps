package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {


    //Create a method to check winner
    public String checkWinner(ArrayList<Card> cards) {
        int firstCard = cards.get(0).getCardValue();
        int secondCard = cards.get(1).getCardValue();
        if (firstCard > secondCard) {
            return "first player wins";
        } else {
            return "second player wins";
        }
    }


} //Last curly bracket
