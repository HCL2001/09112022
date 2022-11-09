package QuadraticEquation;

public class QuadraticEquation {
    float a, b ,c;

    public QuadraticEquation(){

    }

    public void getA(float A){
        this.a = A;
    }

    public void getB(float B){
        this.b = B;
    }

    public void getC(float C){
        this.c = C;
    }

    public double getDiscriminant(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1(){
        return (-this.b + Math.sqrt(Math.pow(this.b,2) - 4 * this.a * this.c)) / 2 * this.a;
    }

    public double getRoot2(){
        return (-this.b - Math.sqrt(Math.pow(this.b,2) - 4 * this.a * this.c)) / 2 * this.a;
    }
}
