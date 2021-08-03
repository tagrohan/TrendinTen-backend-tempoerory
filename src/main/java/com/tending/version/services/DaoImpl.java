package com.tending.version.services;

import com.tending.version.apis.CardDao;
import com.tending.version.apis.TrendingDao;
import com.tending.version.models.Card;
import com.tending.version.models.Thumbnail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaoImpl {

   @Autowired
   TrendingDao thumbDao;

   @Autowired
   CardDao cardDao;


   public List<Thumbnail> getContents() {
      return thumbDao.getContents();
   }

   public void savingCards(Thumbnail t) {
      thumbDao.save(t);
   }

   public List<Card> getCards() {
      return (List<Card>) cardDao.findAll();
   }


   public Card getCard(String id) {
      return cardDao.getCardByCardId(id);
   }
}
