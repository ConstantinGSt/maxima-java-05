package org.example;

import org.example.Cat;
import freemarker.template.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DynamicPage {

    public static void createPage(String filename) throws IOException, TemplateException, IncorrectCatWeightException {

        String resourcesPath = "D:\\repository\\maxima-java-05\\resources\\templates";
        String writePath = resourcesPath + "\\" + filename;

        FileWriter writer = new FileWriter(writePath, false);
        Configuration conf = new Configuration(Configuration.VERSION_2_3_31);
        conf.setDirectoryForTemplateLoading(new File(resourcesPath));
        conf.setDefaultEncoding("UTF-8");
        
        Cat cat = new Cat("Васька", 12);
        Map root = new HashMap<>();

        root.put("title", "Данные кота");

        root.put("cat", cat);

        Template template = conf.getTemplate("index.html");
        template.process(root, writer);

        writer.flush();
        writer.close();
    }
}
