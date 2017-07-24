// Array List  

import java.lang.reflect.Array;
import java.util.*;


public class CollectionEx1 {
	public static void main(String args[]){
	
	
	ArrayList<SampleClass> al = new ArrayList<SampleClass>();
	ArrayList<SampleClass> cl = new ArrayList<SampleClass>();
	
	
	SampleClass sc1=new SampleClass("Meghajit");
	SampleClass sc2 = new SampleClass("Pinak");
	SampleClass sc3 = new SampleClass("Ankit");
	SampleClass sc4 = new SampleClass("Me");
	SampleClass sc5 = new SampleClass("Alone");
	
	
	al.add(sc1);
	al.add(sc2);
	al.add(sc3);
	
	//[Meghajit, Pinak, Ankit]
	System.out.println(al);
	
	cl.add(sc4);
	cl.add(sc5);
	
	al.addAll(cl);
	//[Meghajit, Pinak, Ankit, Me, Alone]
	System.out.println(al);
	
	al.retainAll(cl);
	//[Me, Alone]
	System.out.println(al);
	
	
	al.removeAll(cl);
	//[]
	System.out.println(al);
	
	al.add(sc1);
	al.add(sc2);
	al.add(sc3);
	
	System.out.println(al);
	
	
	
	
	
	

	
	
	
	}
	

}
