package _02_fibonacci;

public class FibonacciSequence {
public static void main(String[]args){
	int prev = 0;
	int curr = 1;
	int next = prev + curr;
	System.out.println(prev);
	System.out.println(curr);
	System.out.println(curr);
for (int i = 0; i < 9; i++) {
	next = prev + curr;
	prev = curr;
	curr = next;	
next = prev + curr;
System.out.println(next);
}








}
}
