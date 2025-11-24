class Student {
    private String name;
    private int rollNo;
    private double percentage;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) { 
        this.rollNo = rollNo;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student a = new Student();
        
        a.setName("Deepika");
        System.out.println("Name: " + a.getName());

        a.setRollNo(10);
        System.out.println("Roll no: " + a.getRollNo());

        a.setPercentage(67.8);
        System.out.println("Percentage: " + a.getPercentage());
    }
}
