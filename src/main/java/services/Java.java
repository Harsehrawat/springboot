package services;

public class Java implements Icourse{

    public Java(){
        System.out.println("Java Bean Created");
    }

    @Override
    public Boolean getTheCourse(Double price) {
        System.out.println("Java course is purchased and fee is: "+ price);
        return true;
    }

}
