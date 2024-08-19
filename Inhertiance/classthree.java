package Inhertiance;

public class classthree  extends classtwo{
    int total;
    classthree(int roll,int marks,int subjects,int practical,int total){
        super(roll,marks,subjects,practical);
        this.total=(marks+practical);

    }

}
