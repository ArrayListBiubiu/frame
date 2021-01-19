package code08;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Leaf {
    private String name;
    private int age;
    private int[] arr;

    private Branch branch;
}
