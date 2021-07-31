package com.tending.version.controllers;

import com.tending.version.apis.TrendingDao;
import com.tending.version.models.Card;
import com.tending.version.models.Thumbnail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

   @Autowired
   TrendingDao dao;

   @GetMapping("/get_card")
   public Thumbnail getCard() {

      Card cdc = new Card("name", "content", "10", "uri");
      Card cdcc = new Card("name", "content", "10", "uri");
      Card cd = new Card("name", "content", "10", "uri");
      Card card = new Card("name", "content", "10", "uri");
      List<Card> cards = List.of(cdc, cdcc, cd, card);
      Thumbnail t = new Thumbnail("title", "thumburi", "31 july", cards);
      dao.save(t);
      return t;
   }
}