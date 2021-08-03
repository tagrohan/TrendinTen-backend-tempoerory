package com.tending.version.apis;

import com.tending.version.models.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CardDao extends CrudRepository<Card, Integer> {

   @Query("select c from Card c where c.number =:number")
   Card getCardByCardId(@Param("number") String number);
}
