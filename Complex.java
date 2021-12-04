public class Complex {
    double realPart;
    double imgPart;

    public Complex(){
        realPart = 0;
        imgPart = 0;
    }
    public Complex(double real , double img){
        realPart = real;
        imgPart = img;
    }

    public Complex add(Complex num){
        Complex result = new Complex();
       result.realPart = this.realPart + num.realPart;
       result.imgPart = this.imgPart + num.imgPart;
       return  result;
    }

    public Complex subtract(Complex num){
        Complex result = new Complex();
        result.realPart = this.realPart - num.realPart;
        result.imgPart = this.imgPart - num.imgPart;
        return  result;
    }

    public Complex multiply(Complex num){
        Complex result = new Complex();
        result.realPart = this.realPart * num.realPart;
        result.imgPart = this.imgPart * num.imgPart;
        return  result;
    }

    public Complex divide(Complex num){
        Complex result = new Complex();
        result.realPart = this.realPart / num.realPart;
        result.imgPart = this.imgPart / num.imgPart;
        return  result;
    }

    public void setRealPart(double real){
        this.realPart = real;
    }

    public void setImgPart(double img){
        this.imgPart = img;
    }

    public double getRealPart(){
        return this.realPart;
    }

    public double getImgPart(){
        return this.imgPart;
    }

    public String toString(){
         String result = this.realPart + " + "+ this.imgPart+"i";
        System.out.println(result);
         return  result;
    }

}

class ComplexDemo{
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setRealPart(1);
        c1.setImgPart(2);
        System.out.println("Real part: "+c1.getRealPart());
        System.out.println("Imaginary part: "+c1.getImgPart());

        Complex c2 = new Complex(3,4);
        Complex c3 = new Complex();

        c3 = c1.add(c2);
        System.out.print("Sum: ");
        c3.toString();
        c3 = c2.subtract(c1);
        System.out.print("Difference: ");
        c3.toString();
        c3 = c1.multiply(c2);
        System.out.print("Product: ");
        c3.toString();
        c3 = c2.divide(c1);
        System.out.print("Quotient: ");
        c3.toString();

        
    }
}