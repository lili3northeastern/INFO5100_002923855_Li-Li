package Exercise.Exercise0;

public class Jobs {

    public String title;
    public String companyName;
    public String department;
    public String responsibility;
    public int num;
    public int salary;
    public boolean isRemote;
    public int colleaguesNum;

    public Jobs() {
        System.out.println("j1 has been created");
    }

    public Jobs(int salary) {
        this.salary = salary;
        System.out.println("j2 has been created");
    }

    public Jobs(String title) {
        this.title = title;
        System.out.println("j3 has been created");
    }

    public class InnerJobs{

    }

    public class InnerJobs2{

    }

    public void printJobsTitle(){

    }

    public void printJobsDepartment(){

    }
    public void printJobsSalary(){

    }
}
