package code10;


import lombok.Data;

@Data
public class Logger {
    public void recordBefore(){
        System.out.println("动态代理。。。");
    }
}
