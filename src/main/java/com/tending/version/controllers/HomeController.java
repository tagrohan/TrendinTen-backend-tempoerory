package com.tending.version.controllers;

import com.tending.version.models.Card;
import com.tending.version.models.Thumbnail;
import com.tending.version.services.DaoImpl;
import com.tending.version.util.DIR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

@RestController
public class HomeController {

   @Autowired
   DaoImpl service;

   @Autowired
   private DIR dir;

   @GetMapping("/get_card")
   public List<Thumbnail> getCard() {

      Card cdc = new Card("name", "content", "10", "uri");
      Card cdcc = new Card("name", "content", "10", "uri");
      Card cd = new Card("name", "content", "10", "uri");
      Card card = new Card("name", "content", "10", "uri");
      List<Card> cards = List.of(cdc, cdcc, cd, card);
      Thumbnail t = new Thumbnail("title", "thumburi", "31 july", cards);
      List<Thumbnail> thumb = service.getContents();
      return thumb;
   }

   @GetMapping("/save")
   public String saveImages() {




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
}