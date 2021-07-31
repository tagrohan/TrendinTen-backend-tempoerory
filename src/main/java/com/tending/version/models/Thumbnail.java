package com.tending.version.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Thumbnail {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String title;
   private String thumbnailUri;
   private String date;

   @OneToMany
   private List<Card> cards;


   public Thumbnail(String title, String thumbnailUri, String date, List<Card> cards) {
      this.title = title;
      this.thumbnailUri = thumbnailUri;
      this.date = date;
      this.cards = cards;
   }

   public Thumbnail() {
   }

   public Thumbnail(String title, String thumbnailUri, String date) {
      this.title = title;
      this.thumbnailUri = thumbnailUri;
      this.date = date;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getThumbnailUri() {
      return thumbnailUri;
   }

   public void setThumbnailUri(String thumbnailUri) {
      this.thumbnailUri = thumbnailUri;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public List<Card> getCards() {
      return cards;
   }

   public void setCards(List<Card> cards) {
      this.cards = cards;
   }
}
