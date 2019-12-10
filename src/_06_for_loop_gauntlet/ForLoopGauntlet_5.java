package _06_for_loop_gauntlet;

public class ForLoopGauntlet_5 {
public static void main(String[] args) {
	for (int i = 1; i < 501; i++) {
		if (i % 2 == 1) {
			System.out.println(i + " is odd");
		}else {
			System.out.println(i + " is even");
		}
	}
}
}
