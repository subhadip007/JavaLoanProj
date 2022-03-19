package com.subha;

public class Loan<proteted> {


    private static int Total_loan_number=0;
    protected  String Loan_no=String.valueOf(Total_loan_number+1);
    protected static int Total_loan_amount=0;
    protected static int Total_emi_amount=0;


    Loan(){
        Total_loan_number++;


    }




}
