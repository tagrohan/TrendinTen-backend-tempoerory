package com.tending.version.services;

import com.tending.version.apis.TrendingDao;
import com.tending.version.models.Thumbnail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaoImpl {

   @Autowired
   TrendingDao dao;


   public List<Thumbnail> getContents() {
      return dao.getContents();
   }
}
