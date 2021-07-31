package com.tending.version.controllers;

import com.tending.version.models.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @GetMapping("/get_card")
   public Card getCard() {
      return new Card("rohan", "tagrohan@gmail.com");
   }
}