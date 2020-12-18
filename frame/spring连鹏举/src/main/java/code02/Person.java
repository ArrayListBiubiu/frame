package code02;


import lombok.Data;


@Data
public class Person {

    Integer id;
    String name;
    Integer age;

    public Person() {
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
