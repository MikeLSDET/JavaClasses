package com.syntax.reviewclass04;

public class NestedForLoops3 {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				for (int k=0; k<2; k++) {//most inner bracket kicks out to closes bracket
					System.out.println("i= "+i+" j = "+j+" k = "+k);
				}
			}
		}


	}

}
