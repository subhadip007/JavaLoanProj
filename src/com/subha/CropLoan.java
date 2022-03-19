package com.subha;

import java.util.Scanner;

public class CropLoan extends  Loan{
    private String cropName;
    private float estdYield;
    private final float intrestRate = 6.5f;

CropLoan(int val){
    super();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the corp name");
    cropName=input.nextLine();
    System.out.println("Enter the estimated  yield");
    estdYield=input.nextFloat();
    Total_loan_amount+=val;
    System.out.println("Your loan has been successfully generated loan of Rs"+val+" and the loan number is"+Loan_no);


}




}