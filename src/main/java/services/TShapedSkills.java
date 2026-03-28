package services;

public class TShapedSkills {
    private Icourse course;

//    public TShapedSkills( Icourse course){
//        super();
//        this.course = course;
//    }

    public TShapedSkills(){
        System.out.println(" TShapedSkills Bean Created");
    }

    public void setCourse(Icourse course){
        System.out.println("setter injection occured inside TShapedSkills !");
        this.course = course;
    }

    public Boolean buyTheCourse( Double amount){
        return course.getTheCourse( amount);
    }

}
