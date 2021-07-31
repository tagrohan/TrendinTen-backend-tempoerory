package com.tending.version.util;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class DIR {

   public File getPath() {
      return new File("E:\\asset\\images");
   }
}
