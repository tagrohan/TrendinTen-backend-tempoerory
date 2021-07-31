package com.tending.version.apis;

import com.tending.version.models.Thumbnail;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.List;

public interface TrendingDao extends CrudRepository<Thumbnail, Integer> {


   @Query("select l from Thumbnail l")
   List<Thumbnail> getContents();
}
