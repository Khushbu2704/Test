package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface Interf {
	public void m1();
}

public class Java8Concepts {
	
	public static void main(String[] args) {
		
		//method1();
		//methodForEAch();
		
		/*Interf i = ()-> System.out.println("Helloo...form lambda expression");
		i.m1();*/
		
		
	/*	Runnable r = ()->{
			for(int i=0;i<10;i++){
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}*/
		
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		l1.stream().forEach(System.out::println);
		
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		methodForEAch(); 
	}

	private static void methodForEAch() {
		
		Function<Integer, Integer> func = i -> i*i;
		System.out.println("Square of value 40 is " +func.apply(40));
	}

	private static void method1() {
		
		Integer int1 = null;
		Optional<Integer> newInt = Optional.ofNullable(int1);
		System.out.println(newInt.isPresent());
		System.out.println("Integer value is :" +newInt);
		
	}

}

class MyConsumer implements java.util.function.Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}}
