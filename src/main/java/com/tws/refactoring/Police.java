package com.tws.refactoring;

public class Police {
//    public boolean checkDriver(Driver driver) {
//        if(driver.age >= 18) return true;
//        else return false;
//    }
    private static int AGE = 18;
    public boolean checkDriver(Driver driver) {
    	int temp = driver.getAge();
    	if (temp>= AGE) {
    		return true;
		}else {
			return true;
		}
    }  
}
