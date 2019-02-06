package lekce_5;

public class example {

	public void demonstrateObjectReference() {
	
	int nums1[] = new int[10];
	int nums2[] = new int[10];	
		
	nums1 = setValuesForArray(nums1);
	
	nums2 = setMinusValuesForArray(nums2);
	
	printArray(nums1);
	
	printArray(nums2);
	
	nums2 = nums1;
	
	printArray(nums2);
	
	nums2[3] = 99;
	
	printArray(nums1);
	
	}

	public void printArray(int[] pole) {
		int i;
		System.out.print("Tiskneme nejake pole: ");
		for(i=0; i < 10; i++) {
			System.out.print(pole[i] + " ");
		}
		System.out.println();
	}

	public int[] setMinusValuesForArray(int[] nums2) {
		int i;
 		for(i=0; i < 10; i++)
			nums2[i] = -i;
		return nums2;
	}

	public int[] setValuesForArray(int[] nums1) {
		int i;
		for(i=0; i < 10; i++)
			nums1[i] = i;
		return nums1;
	}

}
