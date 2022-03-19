package com.subha;

import java.util.Scanner;

public class WaterPipelineLoan extends Loan{
    private int lop;
    private String sow;
    private final float intrestRate=5.0f;


    WaterPipelineLoan(int val){
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the corp name");
        lop=input.nextInt();
        System.out.println("Enter the estimated  yield");
        sow=input.nextLine();
        Total_loan_amount+=val;
        System.out.println("Your loan has been successfully generated loan of Rs"+val+" and the loan number is"+Loan_no);
    }


}
