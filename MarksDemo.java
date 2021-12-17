abstract class Marks{
    abstract void getPercentage();
}

class A extends Marks{
    int m1,m2,m3;    //marks

    A(int m1, int m2, int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    float percentage(float m1, float m2, float m3) {
        float percentage = ((m1+m2+m3)/300)*100;
        return percentage;
    }

    void getPercentage() {
        System.out.println("Percentage obtained by Student A is: "+ percentage(m1,m2,m3)+" %");
    }
}

class B extends Marks{
    int m1,m2,m3,m4;    //marks

    B(int m1, int m2, int m3, int m4){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    float percentage(float m1, float m2, float m3, float m4) {
        float percentage = ((m1+m2+m3+m4)/400)*100;
        return percentage;
    }

    void getPercentage() {
        System.out.println("Percentage obtained by Student B is: "+ percentage(m1,m2,m3,m4)+" %");
    }
}



public class MarksDemo {
    public static void main(String[] args) {
        A a = new A(78,88,90);
        B b = new B(98,97,91,94);
        a.getPercentage();
        b.getPercentage();
    }
}
