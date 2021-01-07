package code02;


import lombok.Data;


@Data
public class Person {

    Integer id;
    String name;
    Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    private Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(Integer id) {
        this.id = id;
    }


}
