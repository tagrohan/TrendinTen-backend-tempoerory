package com.tending.version.controllers;

import com.tending.version.models.Card;
import com.tending.version.models.Thumbnail;
import com.tending.version.services.DaoImpl;
import com.tending.version.util.DIR;
import com.tending.version.util.Saving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;

@RestController
public class HomeController {

   @Autowired
   DaoImpl service;

   @Autowired
   private DIR dir;


   @GetMapping("/get_content")
   public List<Thumbnail> getContent() {
      return service.getContents();
   }

   @GetMapping("/get_cards")
   public List<Card> getCards() {
      return service.getCards();
   }

   @GetMapping("/get_card/{number}")
   public Card getCard(@PathVariable("number") String number) {
      return service.getCard(number);
   }

   @GetMapping("/save")
   public String saveImages() {
//      List<Card> cards = Saving.getSecond();
      List<Card> cards2 = Saving.getSecond2();
      Thumbnail t2 = new Thumbnail("Top Agencies", "mossad.png", new Date().toString(), cards2);
      service.savingCards(t2);
      List<Card> cards3 = Saving.getSecond3();
      Thumbnail t3 = new Thumbnail("Top Medical institutes", "cmi.jpg", new Date().toString(), cards3);
      service.savingCards(t3);
      List<Card> cards4 = Saving.getSecond4();
      Thumbnail t4 = new Thumbnail("Best Carriers", "deta.png", new Date().toString(), cards4);
      service.savingCards(t4);
      return "saved";
   }

   @GetMapping("/image/{nameOfFile}")
   public ResponseEntity<byte[]> getImage(@PathVariable("nameOfFile") String path) {

      try {
         File fi = new File(dir.getPath().getAbsolutePath() + File.separator + path);
         byte[] fileContent = Files.readAllBytes(fi.toPath());
         return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(fileContent);
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
   }

   @GetMapping("/image_by_number/{number}")
   public ResponseEntity<byte[]> getImageByNumber(@PathVariable("number") String number) {

      try {
         File fi = new File(dir.getPath().getAbsolutePath() + File.separator + service.getCard(number).getUri());
         byte[] fileContent = Files.readAllBytes(fi.toPath());
         return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(fileContent);
      } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
   }
}