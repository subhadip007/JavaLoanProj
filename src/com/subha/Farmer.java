package com.subha;

import java.util.Scanner;

public class Farmer {
private String First_name;
private String Last_Name;
private Address address;
private boolean[] loan_taken=new boolean[3];
private boolean[] isEmiPaid=new boolean[3];
private int loan_amount=0;
private int amount_repaid=0;
private CropLoan crpLn;
private WaterPipelineLoan wpLn;
private TractorLoan trcLn;

Farmer(String f,String l){
    First_name=f;
    Last_Name=l;
}


void setAddress(String H,String L,String T,String D,String S){
    address=new Address(H,L,T,D,S);
}

void displayAddress(){
System.out.println("the address of farmer "+First_name+"is below \n"+address.showAddress());
}

    void takeLoan(int n,int amnt){
        n--;
        if(n>2||n<0){
            System.out.println("Input a valid loan type");
        }else{
            if(loan_taken[n]){
                System.out.println("You have already taken this loan");
            }else{
                loan_taken[n]=true;
                loan_amount+=amnt;
                if(n==0){
                    crpLn=new CropLoan(amnt);
                }else if(n==1){
                    wpLn=new WaterPipelineLoan(amnt);
                }else{
                    trcLn=new TractorLoan(amnt);
                }
            }
        }
    }


    void repayLoan(int amnt){
    int x=0;
    String temp;
    System.out.println("Which type of loan you want to repay");
        Scanner input = new Scanner(System.in);
        temp=input.nextLine();

        if(temp=="Crop loan") {
            x = 0;
        }else if(temp=="Water Pipeline Loan") {
            x = 1;
        }else if(temp=="Tractor Loan") {
            x = 2;
        }else{

                System.out.println("Input a valid loan type");
        }
        isEmiPaid[x]=true;

        System.out.println("Type the loan number of the loan");
        temp=input.nextLine();

        if((x==0&&crpLn.Loan_no==temp)||(x==1&&wpLn.Loan_no==temp)||(x==2&&trcLn.Loan_no==temp)){
            amount_repaid+=amnt;
            Loan.Total_emi_amount+=amnt;
        }else{
            System.out.println("Put valid loan no");
        }


    }









    public static void main(String[] args) {
        Farmer fam1=new Farmer("subodh","mishra");
        fam1.setAddress("31/1","bamaria","mals","hariyana","UP");
        fam1.displayAddress();
    }

}
