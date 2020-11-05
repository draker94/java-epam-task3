package by.training;

import by.training.domain.Greenhouse;
import by.training.xml.GreenhouseXmlReader;
import by.training.xml.GreenhouseXmlValidator;
import by.training.xml.GreenhouseXmlWriter;

public class Runner {
    public static void main(String[] args) {
        GreenhouseXmlReader reader = new GreenhouseXmlReader();
        Greenhouse greenhouse = new Greenhouse(reader.readPlants("data/greenhouse.xml"));
        greenhouse.getPlantList().forEach(System.out::println);

        GreenhouseXmlWriter writer = new GreenhouseXmlWriter();
        writer.setPath("data/greenhouseWrite.xml");
        writer.setPlants(greenhouse.getPlantList());

        GreenhouseXmlValidator validator = new GreenhouseXmlValidator();
        validator.setPathXml("data/greenhouseWrite.xml");
        System.out.println("Validation is " + validator.validate() + "\n" + validator.getError());
    }
}
