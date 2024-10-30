package utils;

import constants.File;
import constants.File.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reader {

  static Properties p;

  public static String getBrowser(){

    p = new Properties();
    try {
      p.load(new FileInputStream(FilePaths.getFile(File.ENV)));
    }
    catch (IOException e){

    }
    return p.getProperty("BROWSER");
  }

  public static String getEnvProp(String key){
    p = new Properties();
    try {
      p.load(new FileInputStream(FilePaths.getFile(File.ENV)));
    }
    catch (IOException e){

    }
    return p.getProperty(key);
  }

}