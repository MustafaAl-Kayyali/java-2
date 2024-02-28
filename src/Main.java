import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name = "",title="",titleResult="",ageResult="";
        boolean z=true,y=true,x=true,k=true;
        int age= 0,grade=0;
        Scanner input = new Scanner(System.in);
       do {
           System.out.print("Insert the name ? ");
           name = input.next();
           if (name.length() >= 5) {
               z = false;
                 do{   System.out.print("How old are you ?");
               age = input.nextInt();
               if (age > 0) {
                    x=false;
                    if(age>50){
                        ageResult="old";
                    }
                    else if (age >11) {
                        ageResult="young";
                    }
                    else{
                        ageResult="Kid";
                    }
                 do {
                     System.out.println("[1]Accountant \n[2]Developer \n[3]Researcher \n[4]Other");
                     System.out.print("what is your title?");
                     title = input.next();
                     switch (title) {
                         case "Accountant": {
                             y=false;
                             titleResult = "Accounting";
                             break;
                         }
                         case "Developer": {
                             y=false;
                             titleResult = "IT";
                             break;
                         }
                         case "Researcher": {
                             y=false;
                             titleResult = "Research";
                             break;
                         }
                         case "Other": {
                             y=false;
                             titleResult = "Operations";
                             break;
                         }
                         default: {
                             System.out.println("Please choose one of list items");
                             break;
                         }
                     }
                 }while (y==true);
                   do {
                       System.out.print("How many years of experience do you have?");
                       grade = input.nextInt();
                       if(grade>0){
                           k=false;
                            if(grade>5){
                                grade=4;
                            }
                            else if (grade>3) {
                                grade=3;
                            }
                            else if(grade>1){
                                grade=2;
                            }
                            else{
                                grade=1;
                            }
                       }
                       else{
                           System.out.println("Please Enter a positive number ");
                       }

                   }while (k==true);
               }
               else {
                   System.out.println("Please Enter a valid age!");
                    }
                 } while (x==true);

           }
           else {
               System.out.println("Try agine !");
           }
       }
       while (z==true);

        System.out.println("\n\n----------------------------------------------\nHi "+name+"\nyour age is: "+age+
                " thats mean you are: "+ageResult+"\n"+
                "your department is: "+ titleResult+"\n"+
                "your salary grade is: "+grade+"\n"+
                "Welcome to our company");
    }
}