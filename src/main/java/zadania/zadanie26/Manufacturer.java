package zadania.zadanie26;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@AllArgsConstructor
public class Manufacturer {

    public String name;
    public int yearOfCreation;
    List<Model> models;

}
