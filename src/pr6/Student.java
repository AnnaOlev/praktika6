package pr6;

public class Student {

    String name;
    int iDNumber;

    public Student (String name, int iDNumber){
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public String toString(){
        return this.name + " " + this.iDNumber;
    }
}
