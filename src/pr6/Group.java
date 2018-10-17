package pr6;

import java.util.Random;

public class Group {
	
	public Student [] group = new Student[10];
	
	public void sort () {
        int i, j;

        for (i = 0; group.length - 1 > i; i++) {
            for (j = 0; j < group.length-i-1; j++){
                if (group[j].iDNumber > group[j+1].iDNumber)
                    swap (group[j], group[j+1]);
            }
        }
    }

    public void swap ( Student x, Student y){
        Student temp = x;
        x = y;
        y = temp;
    }
    
	  Group() {
		  Random generator = new Random();
	  	String [] names = {"Anna", "John", "Ivan", "Kate","Tom","Jeanne","Elena", "Maria", "David", "Arthur" };
	
	
	  	for (int i = 0; i < 10; i++){
	          String tname = names[generator.nextInt(10)];
	          group[i] = new Student(tname, generator.nextInt(40));
	  	}
	    }
	  	
	  	public void show() {
	  		for (int i = 0; i < 10; i++)
	            System.out.println(group[i]);
	  	}
}
