package code03;


import lombok.Data;

@Data
public class Log {

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
    public void aopAround(){
        System.out.println("动态代理。。。aopAround");
    }
}
