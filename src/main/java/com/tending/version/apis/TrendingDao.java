package com.tending.version.apis;

import com.tending.version.models.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrendingDao extends CrudRepository<Card, Integer> {

   @Query("select c from Card c")
   public List<Card> getCards();
}