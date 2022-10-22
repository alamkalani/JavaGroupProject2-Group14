package JavaGroupProject2;

public class Task2 {
    /*
    We have to calculate the average of marks
    obtained in three subjects by student A and by
    student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning
    the average percentage of marks. Provide
    implementation of abstract method in classes
    'A' and 'B'. The constructor of student A takes the
    marks in three subjects as its parameters and
    the marks in four subjects as its parameters for
    student B. Test your code
     */
    public static void main(String[] args) {
        A a = new A(80, 50, 90);
        System.out.println(a.getPercentage());

        B b = new B(90, 95, 96, 85);
        System.out.println(b.getPercentage());
    }
}

abstract class Mark {
    abstract double getPercentage();
}

class A extends Mark {
    double num1;
    double num2;
    double num3;

    A(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    double getPercentage() {
        return (num1 + num2 + num3) / 3;
    }
}

class B extends Mark {
    double num1;
    double num2;
    double num3;
    double num4;

    B(double num1, double num2, double num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    @Override
    double getPercentage() {
        return (num1 + num2 + num3 + num4) / 4;
    }
}