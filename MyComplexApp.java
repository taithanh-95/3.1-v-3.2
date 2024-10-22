package test;
import java.util.Scanner;
public class MyComplexApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double real1 = s.nextDouble();
		double imag1 = s.nextDouble();
		double real2 = s.nextDouble();
		double imag2 = s.nextDouble();
		MyComplex m1 = new MyComplex(real1, imag1);
		MyComplex m2 = new MyComplex(real2,imag2);
		System.out.println(m1.toString());
		System.out.println(m1.isReal());
		System.out.println(m1.isImaginary());
		System.out.println(m1.equals(real2, imag2));
		System.out.println(m2.toString());
		System.out.println(m2.isReal());
		System.out.println(m2.isImaginary());
		System.out.println(m2.equals(real2, imag2));
		MyComplex tong = m1.addNew(m2);
		System.out.println("tong= " + tong);
		MyComplex hieu = m1.subtractNew(m2);
		System.out.println("hieu= " + hieu);
		MyComplex tich = m1.multiply(m2);
		System.out.println("tich= " + tich);
		MyComplex thuong = m1.divide(m2);
		System.out.println("thuong= " + thuong);
	}
}
