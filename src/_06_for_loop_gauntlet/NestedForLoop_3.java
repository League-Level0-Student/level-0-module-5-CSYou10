package _06_for_loop_gauntlet;

public class NestedForLoop_3 {
public static void main(String[] args) {
int count = 1;
	
	for (int i = 1; i < 11; i++) {
		for (int j = 1; j < 11; j++) {
			System.out.print(count+" ");
		count ++ ;
			
		}
		System.out.println("");
	}
}
}
