package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main (String[] args){
String N = JOptionPane.showInputDialog("Type in a number.");
int P = Integer.parseInt (N);
for (int i = 2; i < P; i++) {
	

if (P % i == 0 ) {
JOptionPane.showMessageDialog(null,"Your number is not prime!");
System.exit(0);
}
}
JOptionPane.showMessageDialog(null, "Your number is prime!");
}
}
