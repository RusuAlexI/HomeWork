package exercise.mycomplex;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    @Override
    public String toString() {
        return "(" + this.real + "+" + this.imag + "i)";
    }

    public boolean isReal() {
        return real != 0 && imag == 0;
    }

    public boolean isImaginary() {
        return !isReal();
    }

    public boolean equals(double real, double imag) {
        return this.imag == imag && this.real == real;

    }

    public boolean equals(MyComplex another) {
        if (this.imag == another.imag && this.real == another.real) {
            return true;
        } else {
            return false;
        }
    }

    public double magnitude() {
        return Math.sqrt(this.imag * this.imag + this.real * this.real);
    }

    public double argument() {
        //return Math.pow(Math.tan(imag/real),-1);
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        this.imag = this.imag + right.imag;
        this.real = this.real + right.real;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newMyComplexInstance = new MyComplex(real, imag);
        newMyComplexInstance.imag = newMyComplexInstance.imag + right.imag;
        newMyComplexInstance.real = newMyComplexInstance.real + right.real;
        return newMyComplexInstance;
    }

    public MyComplex subtract(MyComplex right) {
        this.imag = this.imag - right.imag;
        this.real = this.real - right.real;
        return this;
    }

    public MyComplex substractNew(MyComplex right) {
        MyComplex newMyComplexInstance = new MyComplex(real, imag);
        newMyComplexInstance.imag = newMyComplexInstance.imag - right.imag;
        newMyComplexInstance.real = newMyComplexInstance.real - right.real;
        return newMyComplexInstance;
    }

    public MyComplex multiply(MyComplex right) {
        this.real = (this.real * right.real - this.imag * right.imag);
        this.imag = (this.real * right.imag + this.imag * right.real);
        /*(this.real*right.real)+(this.real*right.imag)+(this.imag*right.real)+(this.imag*right.imag;*/
        return this;
    }

    public MyComplex divide(MyComplex right) {
        MyComplex c3 = new MyComplex();
        c3.real = this.real / right.real - this.imag / right.imag;
        c3.imag = this.real / right.imag + this.imag / right.real;
        return c3;
    }

    public MyComplex conjugate() {
        this.imag = this.imag * (-1);
        return this;
    }

}
