package code10;


import lombok.Data;

@Data
public class Logger {

    public void aopBefore(){
        System.out.println("动态代理。。。before");
    }
    public void aopAfter(){
        System.out.println("动态代理。。。after");
    }
    public void aopReturning(){
        System.out.println("动态代理。。。afterReturning");
    }
    public void aopThrowing(){
        System.out.println("动态代理。。。afterThrowing");
    }
}
