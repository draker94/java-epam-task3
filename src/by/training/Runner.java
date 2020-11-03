package by.training;

import by.training.domain.Greenhouse;
import by.training.xml.GreenhouseXmlReader;
import by.training.xml.GreenhouseXmlWriter;

public class Runner {
    public static void main(String[] args) {
        GreenhouseXmlReader reader = new GreenhouseXmlReader();
        Greenhouse greenhouse = new Greenhouse(reader.readPlants("D:\\java-epam-task3\\src\\by\\training\\greenhouse.xml"));
        greenhouse.getPlantList().forEach(System.out::println);

        GreenhouseXmlWriter writer = new GreenhouseXmlWriter();
        writer.setPath("D:\\java-epam-task3\\src\\by\\training\\greenhouseWrite.xml");
        writer.setPlants(greenhouse.getPlantList());
    }
}
