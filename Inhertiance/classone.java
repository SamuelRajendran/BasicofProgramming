package Inhertiance;

public class classone {
    int roll;
    int marks;
    int subjects;



    public classone(int roll,int marks,int subjects){
        this.roll=roll;
        this.marks=marks;
        this.subjects=subjects;

    }
    classone(classone other){
        this.roll=other.roll;
        this.marks=other.marks;
        this.subjects=other.subjects;
    }

}
