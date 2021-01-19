package ioc.code08;

import lombok.Data;

@Data
public class Leaf {
    private String name;
    private int age;
    private int[] arr;

    private Branch branch;
}
