package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class App {
  public static void main(String[] args) throws IOException, TemplateException, IncorrectCatWeightException {
    System.out.println("Hello World!");
    
    FileWriter writer = new FileWriter("cat.html", false);
    
    String resourcesPath = App.class.getClassLoader().getResource("templates").getPath();
    
    Configuration conf = new Configuration(Configuration.VERSION_2_3_31);
    conf.setDirectoryForTemplateLoading(new File(resourcesPath));
    conf.setDefaultEncoding("UTF-8");
    
    Map root = new HashMap<>();
    root.put("title", "Данные кота");
    
    
		Cat cat1 = new Cat("Пушок", 12, false);
		root.put("cat1", cat1);
	
    
    Template template = conf.getTemplate("index.html");
    template.process(root, writer);
    
    writer.flush();
    writer.close();
    
  }
}
