package ioc.code08;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
public class Grass {

    private String id;
    private Integer age;
    private int phone;
    private Map map;
    private long identitCard;
    private List list;
    private Properties desk;


    public void setId(String id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setIdentitCard(long identitCard) {
        this.identitCard = identitCard;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setDesk(Properties desk) {
        this.desk = desk;
    }
}
