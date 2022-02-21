package com.company;

public class Main {

    public static void main(String[] args)
    {
	int creditcardbal = 5000;
    System.out.println("Your starting Credit Card Balance is $"+creditcardbal);
    double monthoneint = creditcardbal * .17;
    System.out.println("Your interest after one month is $"+monthoneint);
    double monthtwoint = (creditcardbal * 1.17)*.17;
    System.out.println("Your interest after two months is $"+monthtwoint);
    
    }
}
