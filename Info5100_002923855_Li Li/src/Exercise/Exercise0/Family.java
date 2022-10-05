package Exercise.Exercise0;

public class Family {

    public String familyMembersName;
    public int familyMembersNum;
    public int kidNum;
    public int femaleNum;
    public int maleNum;
    public int adultNum;
    public boolean happiness;
    public boolean healthy;

    public Family() {
        System.out.println("f1 has been created");
    }

    public Family(int maleNum) {
        this.maleNum = maleNum;
        System.out.println("f2 has been created");
    }

    public Family(int kidNum, int maleNum) {
        this.kidNum = kidNum;
        this.maleNum = maleNum;
        System.out.println("f3 has been created");
    }

    public class InnerFamily{

    }

    public class InnerFamily2{

    }

    public void printFamilyMembersName(){

    }

    public void printKidNum(){

    }
    public void printFamilyHappiness(){

    }
}

