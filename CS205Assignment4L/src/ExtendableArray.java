import java.util.Scanner;

public class ExtendableArray {
	public static int[] addElement(int[] inExtendableArray, int inNumberOfElements, int newInteger) {
		int[] extendableArray;
		if (inNumberOfElements >= inExtendableArray.length)
			extendableArray = new int[inExtendableArray.length/2 + inExtendableArray.length];
		else
			extendableArray = new int[inExtendableArray.length];
		for ( int i = inNumberOfElements-1; i >= 0; i--) {
			if(i > 0)
				extendableArray[i] = inExtendableArray[i-1];
			else
				extendableArray[i] = newInteger;
		}
		return extendableArray; 
	}

	public static void display(int[] inExtendableArray, int inNumberOfElements) {
		System.out.println("Array Size: " + inNumberOfElements);
		System.out.println("Array Capacity: " + inExtendableArray.length);
		System.out.print("Array Contents: ");
		for ( int i = 0; i < inNumberOfElements; i++) {
			System.out.print(inExtendableArray[i]);
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] extendableArray = new int[6];
		int numberOfElements = 0;
		numberOfElements++;
		extendableArray = addElement(extendableArray, numberOfElements, 1);
		display(extendableArray, numberOfElements);
		numberOfElements++;
		extendableArray = addElement(extendableArray, numberOfElements, 2);
		display(extendableArray, numberOfElements);
		numberOfElements++;
		extendableArray = addElement(extendableArray, numberOfElements, 3);
		display(extendableArray, numberOfElements);
		numberOfElements++;
		extendableArray = addElement(extendableArray, numberOfElements, 4);
		display(extendableArray, numberOfElements);
		numberOfElements++;
		extendableArray = addElement(extendableArray, numberOfElements, 5);
		display(extendableArray, numberOfElements);
		numberOfElements++;
		extendableArray = addElement(extendableArray, numberOfElements, 6);
		display(extendableArray, numberOfElements);
		numberOfElements++;
		extendableArray = addElement(extendableArray, numberOfElements, 7);
		display(extendableArray, numberOfElements);
	}// main

}// class
