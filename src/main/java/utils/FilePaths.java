package utils;

import constants.File;

import java.io.FileNotFoundException;

public class FilePaths {

  private final static String FileName = "";

  public static String getFileName(){
    return FileName;
  }

  public static String getFile(Enum file) {

    if (file.equals(File.ENV)) {
      return "env.properties";
    } else if (file.equals(File.EXCEL)) {
      return "";
    } else {
      return new FileNotFoundException().getMessage();
    }
  }

  public static void main(String[] args) {
    getFile(File.EXCEL);
  }
}
