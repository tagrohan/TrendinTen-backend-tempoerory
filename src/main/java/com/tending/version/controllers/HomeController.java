package com.tending.version.controllers;

import com.tending.version.models.Card;
import com.tending.version.models.Thumbnail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

   @GetMapping("/get_card")
   public Thumbnail getCard() {

      Card cdc = new Card("name", "content", "10", "uri");
      Card cdcc = new Card("name", "content", "10", "uri");
      Card cd = new Card("name", "content", "10", "uri");
      Card card = new Card("name", "content", "10", "uri");
      List<Card> cards = List.of(cdc, cdcc, cd, card);
      return new Thumbnail("title", "thumburi", "31 july", cards);
   }
}