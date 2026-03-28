package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.TShapedSkills;

public class LaunchApp {
    public static void main( String[] args){
        // basically, in spring i won't even declare TShapedClass object..
        // spring auto handles object creation.. the object would be called 'BEAN'

        // bean in spring is managed by IOC container.. which can be done by two ways:
        // Application context
        // Bean Factory

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

        TShapedSkills ts = container.getBean(TShapedSkills.class);

        Boolean status = ts.buyTheCourse( 452.1);
        if( status) System.out.println("success!");
        else System.out.println("failure");
    }
}
