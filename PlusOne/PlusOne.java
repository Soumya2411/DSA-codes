package PlusOne;

public class PlusOne {
    
    class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            //ulta loop
	if (digits[i] < 9) { //[4]
        //[1,4,4]
		digits[i]++; //[5]
		return digits; //[1,4,5]
	} //else
	digits[i] = 0; //9 se niche ni to 9 hoga aur usme +1 hua to 0 ho jyga//
}

digits = new int[digits.length + 1]; //pr agr aisa hua for example = [9,9,9] +1 = 1000 to phle to ek space brhao 
digits[0] = 1; // aur phle place p zero
return digits;
}
}
}
