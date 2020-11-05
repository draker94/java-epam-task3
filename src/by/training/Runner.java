package by.training;

import by.training.console.GreenhouseInfo;
import by.training.domain.Greenhouse;
import by.training.xml.GreenhouseXmlReader;
import by.training.xml.GreenhouseXmlValidator;
import by.training.xml.GreenhouseXmlWriter;

public class Runner {
    public static void main(String[] args) {
        GreenhouseXmlValidator validator = new GreenhouseXmlValidator();
        validator.setPathXml("data/greenhouse.xml");
        if (validator.validate()) {
            GreenhouseXmlReader reader = new GreenhouseXmlReader();
            Greenhouse greenhouse = new Greenhouse(reader.readPlants("data/greenhouse.xml"));
            GreenhouseInfo.printFullInfo(greenhouse);
            GreenhouseXmlWriter writer = new GreenhouseXmlWriter();
            writer.setPath("data/greenhouseWrite.xml");
            writer.setPlants(greenhouse.getPlantList());
        } else {
            System.out.println(validator.getError());
        }
    }
}
