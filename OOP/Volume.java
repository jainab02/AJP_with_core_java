//Write a program which calculates volume of cube, cylinder, and rectangular box
import java.util.Scanner;
public class Volume{
	public double vol(double l){
		return l*l*l;
	}
	public double vol(double r,double h){
		return Math.PI*r*r*h;
	}
	public double vol(double w,double l,double h){
		return w*l*h;
	}
	public static void main(String args[]){
		Volume obj = new Volume();
		double cube = obj.vol(3);
		double cylinder = obj.vol(4,5);
		double rectangle = obj.vol(4,55,34);
		System.out.println("volume of cube : " +cube);
		System.out.println("volume of cylinder : " +cylinder);
		System.out.println("volume of rectangle :"+rectangle);
	}
}