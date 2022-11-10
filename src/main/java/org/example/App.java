package org.example;

import java.io.IOException;

import freemarker.template.TemplateException;

public class App {
  public static void main(String[] args) throws IOException, TemplateException, IncorrectCatWeightException {
    System.out.println("Hello World!");

      DynamicPage.createPage("cat.html");
  }
}
