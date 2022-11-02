package CollectionFramework;
import java.util.ArrayList;
import java.util.List;



class ArrayListEx3 {
    public static void main(String[] args) {
        //1
        List studentList = new ArrayList<>();

        //2
        Student Alex = new Student("Alex", 24);
        Student Albert = new Student("Albert", 74);
        Student Brook = new Student("Brook", 47);
        Student Carlos = new Student("Carlos", 71);
        Student Ira = new Student("Ira", 84);
        Student Jill = new Student("Jill", 61);
        Student Lucy = new Student("Lucy", 22);
        Student Nancy = new Student("Nancy", 94);

        //3
        studentList.add(Alex);
        studentList.add(Albert);
        studentList.add(Brook);
        studentList.add(Carlos);
        studentList.add(Ira);
        studentList.add(Jill);
        studentList.add(Lucy);
        studentList.add(Nancy);

        //4
        float avgNo = findAverage(studentList);

        //6
        for (int i = 0; i < studentList.size(); i++) {
            if (((Student) studentList.get(i)).getMarks() < avgNo) { System.out.println(((Student) studentList.get(i)).getName() + " got " + ((Student) studentList.get(i)).getMarks() + " ---> Below Average ");
            } else {
                System.out.println(((Student) studentList.get(i)).getName() + " got " + ((Student) studentList.get(i)).getMarks() + " ---> Above Average ");
            }
        }
    }

    //5
    private static float findAverage(List list) {
        float sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += ((Student) list.get(i)).getMarks();
        }

        return sum / list.size();
    }
}


class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}