import java.util.Scanner;
public class caladd{
        public static void main(String args[]){
                float a,b,res;
                char choice,ch;
                Scanner scan=new Scanner(System.in);

                do{
                        System.out.println("1.Add 2 numbers\n");
			System.out.println("2.sub 2 numbers\n")
                        System.out.println("3.Exit \n\n");
                        System.out.println("Enter Your Choice: ");
                        choice=scan.next().charAt(0);
                        switch(choice){
                                case '1':System.out.println("Enter Two Number:");
                                         a=scan.nextFloat();
                                         b=scan.nextFloat();
                                         res=a+b;
                                         System.out.println("Result ="+res);
                                         break;
				case '2':System.out.println("Enter Two Number:");
                                         a=scan.nextFloat();
                                         b=scan.nextFloat();
                                         res=a-b;
                                         System.out.println("Result ="+res);
                                         break;
				case '3':System.exit(0);
                                         break;
                                }
                                System.out.println("\n...............\n");
        }while(choice!=2);
}
}

