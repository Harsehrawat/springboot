package services;

public class SpringBoot implements Icourse{

    public SpringBoot(){
        System.out.println("Springboot Bean Created");
    }

    @Override
    public Boolean getTheCourse(Double price) {
        System.out.println("Springboot course is purchased and fee is: "+ price);
        return true;
    }
}
