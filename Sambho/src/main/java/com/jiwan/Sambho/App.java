package com.jiwan.Sambho;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      //  vehicle obj = (vehicle)context.getBean("bike");
        //obj.drive();
        tyre ty = (tyre)context.getBean("tyre");
        System.out.println(ty);
        
        car obj = (car)context.getBean("car");
        obj.drive();
    }
}
