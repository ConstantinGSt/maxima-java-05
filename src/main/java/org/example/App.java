package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class App {
  public static void main(String[] args) throws IOException, TemplateException, IncorrectCatWeightException {
    System.out.println("Hello World!");


    Cat cat = new Cat("Васька", 12);
    Cat cat1 = new Cat("Мурка", 5);
    cat.createPage("cat.html");

    
    

    
  }
}
