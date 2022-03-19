package com.subha;

import java.util.Scanner;

public class TractorLoan extends Loan{
    private String tact_name;
    private String model_name;
    private final float intrestRate=7.0f;


    TractorLoan(int val){
        super();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the corp name");
        tact_name=input.nextLine();
        System.out.println("Enter the estimated  yield");
        model_name=input.nextLine();
        Total_loan_amount+=val;
        System.out.println("Your loan has been successfully generated loan of Rs"+val+" and the loan number is"+Loan_no);
    }

}
