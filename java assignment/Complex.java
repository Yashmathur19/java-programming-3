import java.util.*;
class Complex{
  int real;
  int imag;
  public Complex(int r =0, int i =0){
    real = r;
    imag = i;
  }

  public static Complex add(Complex a, Complex b){
    return new Complex((a.real+b.real),(a.imag+b.imag));
  }

  public static Complex diff(Complex a, Complex b){
    return new Complex((a.real-b.real),(a.imag-b.imag));
  }

  public static Complex product(Complex a, Complex b){
    return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
  }

  public void printComplex(){
    if(real == 0 && imag!=0){
      System.out.println(imag+"i");
    }
    else if(imag == 0 && real!=0){
      System.out.println(real);
    }
    else{
      System.out.println(real+"+"+imag+"i");
    }
  }
public static void main(string[] args)
}
class yash3{
    public static void main(String[] args)
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter first real part");
    int real = sc.nextInt();
    system.out.println("enter first imag part");
    int imag = sc1.nextInt();
    System.out.print("enter second real part");
    int real1 = sc.nextInt();
    System.out.print("enter second imag part");
    int imag1 = sc1.nextInt();
    Complex c1 = new Complex(real,imag);
    Complex c2 = new Complex(real1,imag1);
    Complex c2 = new Complex();
    c3.add(c1,c2);
    c3.printComplex();
    Complex c4 = new Complex();
    c4.diff(c1,c2);
    c4.printComplex();
    Complex c5 = new Complex();
    c5.product(c1,c2);
}