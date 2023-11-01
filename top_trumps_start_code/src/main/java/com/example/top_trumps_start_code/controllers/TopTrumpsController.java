package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/top_trump")
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;
    @PostMapping
    public ResponseEntity<String> newGame(@RequestBody ArrayList<Card> cards){
        return new ResponseEntity<>(topTrumpsService.checkWinner(cards), HttpStatus.CREATED);
    }

} //Last curly bracket
