import java.util.*;
class BRTS{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
		Methods ob=new Methods();
		boolean b=true;
		while(b){
			System.out.println();
			System.out.println("-----Welcome to the BRTS portal-----");
		System.out.println();
		System.out.println("1-Ticket Booking.");
		System.out.println("2-Card making.");
		System.out.println("3-Card(Entry or Exit)");
		System.out.println("4-Exit");
		System.out.println("\nEnter your choice.");
		int choice1=sc.nextInt();
		
				switch(choice1)
				{
					case 1: ob.Ticket_Booking();
							break;
					case 2: ob.card_Making();
							break;
					case 3:ob.card();
							break;
					case 4:
						return;
					default:
							System.out.println("Invalid choice, please try again.");
				}
		}
	}

}
class Methods{
	Scanner sc=new Scanner(System.in);

	int x1 = 0, x2 = 0, y1 = 0, y2 = 0; // Coordinates of the stations
   
	
		String[] name=new String[10];
		long Phone_num[]= new long[10];
		int Age[]= new int[10];
		String[] gender=new String[10];
		String[] S_C=new String[10];
		int[] Card_Balance=new int[10];
		String station[] = new String[10];       //Array to store station names

		{
			station[0] = "Nehrunagar";
			station[1] = "Maninagar";
			station[2] = "CTM";
			station[3] = "GitaMandir";
			station[4] = "Sarkhej";
			station[5] = "Gota";
			station[6] = "Vastrapur";
			station[7] = "ScienceCity";
		   }

		String currentStation;
		String destinationStation;
		
		String[] Add=new String[10];
		int Count=0;
		int payment=0;
		double distance=0;
		static int Id=125;
		int[] valid_id=new int[10];
		int EE_Count=0;

		void Ticket_Booking()
		{
				Methods ob2=new Methods();
				ob2.Distance();
		}

		void Distance()                            //Method to calculate distance between two stations
    {

        boolean looper1 = true;  // to loop
        boolean looper2 = true; //to loop

        while(looper1)
        {
            System.out.println("--------------> Enter your current station : 1."+station[0]+"\n                                             2."+station[1]+"\n                                             3."+station[2]+"\n                                             4."+station[3]+"\n                                             5."+station[4]+"\n                                             6."+station[5]+"\n                                             7."+station[6]+"\n                                             8."+station[7]);
            System.out.print("Enter the name or number of Station : ");
			currentStation = sc.next().toLowerCase();
            System.out.println();

            switch (currentStation)
            { 
                case "nehrunagar":
            		x1 = -3;
                    y1 = -2;
                    looper1 = false;
                break;
                case "maninagar":
                    x1 = 1; 
                    y1 = -4; 
                    looper1 = false;
                break;
                case "ctm":
                    x1 = 3;
                    y1 = -3;
                    looper1 = false;
                break;
                case "gitamandir":
				x1 = 2;
				y1 = -5;
                    looper1 = false;
                break;
                case "sarkhej":
				x1 = -5;
				y1 = -5;
                    looper1 = false;
                break;
                case "gota":
				x1 = 3;
				y1 = 5;
                    looper1 = false;
                break;
                case "vastrapur":
				x1 = -3;
				y1 = 1;
                    looper1 = false;
                break;
                case "sciencecity":
				x1 = 5;
				y1 = 4;
                    looper1 = false;
                break;
				case "1":
            		x1 = -3;
                    y1 = -2;
                    looper1 = false;
                break;
                case "2":
                    x1 = 1; 
                    y1 = -4; 
                    looper1 = false;
                break;
                case "3":
                    x1 = 3;
                    y1 = -3;
                    looper1 = false;
                break;
                case "4":
				x1 = 2;
				y1 = -5;
                    looper1 = false;
                break;
                case "5":
				x1 = -5;
				y1 = -5;
                    looper1 = false;
                break;
                case "6":
				x1 = 3;
				y1 = 5;
                    looper1 = false;
                break;
                case "7":
				x1 = -3;
				y1 = 1;
                    looper1 = false;
                break;
                case "8":
				x1 = 5;
				y1 = 4;
                    looper1 = false;
                break;
                default:
                    System.out.println("Invalid Current station");
                    System.out.println("Plese enter Again(Name or number of Station) :");
                break;
            }
        }

        while(looper2)
        {    
            System.out.println("--------------> Enter your destination station : 1."+station[0]+"\n                                                 2."+station[1]+"\n                                                 3."+station[2]+"\n                                                 4."+station[3]+"\n                                                 5."+station[4]+"\n                                                 6."+station[5]+"\n                                                 7."+station[6]+"\n                                                 8."+station[7]);
            System.out.print("Enter the name or number of Station : ");
			destinationStation = sc.next().toLowerCase();
            System.out.println();

            switch (destinationStation) 
            { 
                case "nehrunagar":
            		x2 = -3;
                    y2 = -2;
                    looper2 = false;
                break;
                case "maninagar":
                    x2 = 1; 
                    y2 = -4; 
                    looper2 = false;
                break;
                case "ctm":
                    x2 = 3;
                    y2 = -3;
                    looper2 = false;
                break;
                case "gitamandir":
				x2 = 2;
				y2 = -5;
                    looper2 = false;
                break;
                case "sarkhej":
				x2 = -5;
				y2 = -5;
                    looper2 = false;
                break;
                case "gota":
				x2 = 3;
				y2 = 5;
                    looper2 = false;
                break;
                case "vastrapur":
				x2 = -3;
				y2 = 1;
                    looper2 = false;
                break;
                case "sciencecity":
				x2 = 5;
				y2 = 4;
                    looper2 = false;
                break;
				case "1":
            		x2 = -3;
                    y2 = -2;
                    looper2 = false;
                break;
                case "2":
                    x2 = 1; 
                    y2 = -4; 
                    looper2 = false;
                break;
                case "3":
                    x2 = 3;
                    y2 = -3;
                    looper2 = false;
                break;
                case "4":
				x2 = 2;
				y2 = -5;
                    looper2 = false;
                break;
                case "5":
				x2 = -5;
				y2 = -5;
                    looper2 = false;
                break;
                case "6":
				x2 = 3;
				y2 = 5;
                    looper2 = false;
                break;
                case "7":
				x2 = -3;
				y2 = 1;
                    looper2 = false;
                break;
                case "8":
				x2 = 5;
				y2 = 4;
                    looper2 = false;
                break;
                default:
                    System.out.println("Invalid Current station");
                    System.out.println("Plese enter Again(Name or number of Station) :");
                break;
            }
        }

        // Calculate the distance between the two stations
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        if (distance<10)
        {
            distance = distance + 5;
        }
        else if (distance > 10 && distance <= 15) 
        {
            distance += 7.5;
        }
        else if (distance > 15 && distance <=20)
        {
            distance +=10;
        }
        else if (distance > 20 && distance <=30)
        {
            distance +=12;
        }

        if(distance<=5)
        {
				payment=10;
        }
				if(distance>5 && distance<=8)
                {
					payment=15;
                }
						if(distance>8 && distance<=14)
                        {
						payment=20;
                        }
							if(distance>14 && distance<=18)
							{
							payment=25;
							}
								if(	distance>18 && distance<=20)
                            	{
								payment=30;
                            	}
									if(distance>20)
									{
									payment=35;
                                	}
                                    if(currentStation.equals(destinationStation))
                                    {
                                        distance = 0;
                                        payment = 0;
                                        System.out.println("Already at the Station");
                                    }
							
        

        // Print the result
        System.out.println("The distance between the two stations is: " + distance + " kilometers.");
		System.out.println("Payment is:"+payment);
    }
void card()
	{
		Methods ob2=new Methods();
				
				
				
				System.out.println("1-Entry");
				System.out.println("2-Exit");
				System.out.println("3-Balance On The Card.");
				System.out.println("Enter your choice.");
				int choice2=sc.nextInt();

				switch(choice2)
				{
					case 1: Entry_Card();
					break;
					
					case 2: Exit();
					break;

					case 3: Balance_Card();
					break;

					default:
					System.out.println("Invalid choice, please try again.");
				}

	}
	void Entry_Card()
	{
		if(EE_Count%2==0){
		System.out.println("Enter Your ID:");
		int id =sc.nextInt();

		for(int i=0;i<=Count;i++)
			{
				if(valid_id[i] == id)
				{
					System.out.println("Your Entry of card is done.\n Kindly Exit your Card at your lasr Station!");
					EE_Count++;
					continue;
				}
						else{
							System.out.println("Invalid Id.");
							break;
						}
			}
		}
		else{
			System.out.println("Exit Requaried");
			}
	}

	void Exit()
	{
		Methods ob3 = new Methods();
		if(EE_Count%2==1){
		System.out.println("Enter Your ID:");
		int id =sc.nextInt();
		ob3.Distance();
			for(int i=0;i<Count;i++)
			{
					if(valid_id[i]==(id)){
						EE_Count++;
								if(distance<=5)
						payment=payment-((60*10)/100);
						if(distance>5 && distance<=8)
						payment=payment-((60*15)/100);
						if(distance>8 && distance<=14)
						payment=payment-((60*20)/100);
						if(	distance>18 && distance<=20)
						payment=payment-((60*25)/100);
						if(distance>20)
						payment=payment-((60*30)/100);
						System.out.println("Payment is:"+payment);
						Card_Balance[i]=Card_Balance[i]-payment;
						System.out.println("Your Card balance is "+Card_Balance[i]);
							}
						
					}
		}
		else{
			System.out.println("Entry Required.");
		}
	}

void Balance_Card(){
		
		while (true)
		{
			System.out.println("Enter your Id.");
			int Password2=sc.nextInt();
		for(int i=0;i<Count;i++)
		{
				if(valid_id[i]==(Password2))
				{
					System.out.println("Enter the amount you want to add in your card.");
					int amount=sc.nextInt();
					Card_Balance[i]=Card_Balance[i]+amount;
					System.out.println("Your Updated Card balance is "+Card_Balance[i]);
					return;
				}
				else
				{
					System.out.println("Invalid Id.");
				}
		}
	}
}

void card_Making(){
	Scanner sc=new Scanner(System.in);
					System.out.println("-----Welcome To The Card Making System.");
					System.out.println("1-Student Pass");
					System.out.println("2-Monthly Pass for 1 Mounth");
					System.out.println("3-Monthly Pass for 3 Mounth");
					System.out.println("4-Exit");
					System.out.println();
					System.out.print("Enter your choice:");
					int pass=sc.nextInt();

					if(pass==1)
					{
						System.out.print("Enter your Name: ");
						name[Count]=sc.next();
						System.out.print("Enter Your Age: ");
						Age[Count]=sc.nextInt();
						
						long number;
			
						System.out.println("Enter  mobile number (10 digits):");
						number = sc.nextLong();
						String s=number+"";
						boolean d=true;
						while(d)
						{
							if(s.length()!=10){
								System.out.println("Enter 10 digit number");
								number=sc.nextLong();
							}
							else{
								d=false;
								Phone_num[Count]=number;
							}
						}
									
						int choice4;
							while(true){
							System.out.println("Enter your gender\n1-Male:\n2-Female\n3-Other");
							choice4=sc.nextInt();
							if(choice4<4 && choice4>0)
								break;
							else{
								System.out.println("Invalid input");
								System.out.println();
								}
							}
							if(choice4==1)
							gender[Count]="male";
							if(choice4==2)
								gender[Count]="female";
							if(choice4==3)
								gender[Count]="other";

							System.out.println("Enter your school/collage name:");
							S_C[Count]=sc.next();
							
							System.out.println("Enter your addres:");
							Add[Count]=sc.next();
							
							if(Age[Count]>0 && Age[Count]<23){
							System.out.println("Your Application for student pass is Approved");
							System.out.println("Your Id is "+Id);
							valid_id[Count]=Id;
							Id++;
							
							System.out.println("Enter the amount which you want to add in your card");
							Card_Balance[Count]=sc.nextInt();
							Count++;
							}
							else{
								System.out.println("You can not get the student pass");
							}
					}

					if(pass==2)
					{
						System.out.println("Enter your name.");
						name[Count]=sc.next();
						System.out.println("Enter Your Age:");
						 Age[Count]=sc.nextInt();

						long number;
			
						System.out.println("Enter Donor's mobile number (10 digits):");
						number = sc.nextLong();
						String s=number+"";
						boolean b=true;
						while(b){
							s=number+"";
							if(s.length()!=10){
								System.out.println("Enter 10 digit number");
								number=sc.nextLong();
							}
							else{
								b=false;
								Phone_num[Count]=number;
							}
							
								}	
								int choice5;
											
							while(true){
							System.out.println("Enter your gender\n1-Male:\n2-Female\n3-Other");
							choice5=sc.nextInt();
							if(choice5<4 && choice5>0)
								break;
							else{
								System.out.println("Invalid input");
								System.out.println();
								}
							}
							if(choice5==1)
								gender[Count]="male";
							if(choice5==2)
								gender[Count]="female";
							if(choice5==3)
							gender[Count]="other";
							System.out.println("Enter your addres:");
							sc.nextLine();
							Add[Count]=sc.next();
							System.out.println("Your Application for Card is Approved");
							System.out.println("Your Id is "+Id);
							valid_id[Count]=Id;
							Id++;
							Count++;
									System.out.println("Enter the amount which you wanr to add in your card.");
									Card_Balance[Count]=sc.nextInt();

					}

					if(pass==3)
					{
						System.out.println("Enter your name.");
						name[Count]=sc.next();
						System.out.println("Enter Your Age:");
						Age[Count]=sc.nextInt();
				
						long number;
			
						System.out.println("Enter Donor's mobile number (10 digits):");
						number = sc.nextLong();
						String s=number+"";
						boolean c=true;
						while(c){
							s=number+"";
							if(s.length()!=10){
								System.out.println("Enter 10 digit number");
								number=sc.nextLong();
							}
							else{
								c=false;
								Phone_num[Count]=number;
							}
							
								}
							int choice6;
							while(true){
							System.out.println("Enter your gender\n1-Male:\n2-Female\n3-Other");
							choice6=sc.nextInt();
							if(choice6<4 && choice6>0)
								break;
							else{
								System.out.println("Invalid input");
								System.out.println();
								}
							}
								if(choice6==1)
									gender[Count]="male";
								if(choice6==2)
									gender[Count]="female";
								if(choice6==3)
								gender[Count]="other";
								System.out.println("Enter your addres:");
								Add[Count]=sc.next();
								System.out.println("Your Application for Card is Approved");
								System.out.println("Your Id is "+Id);
								valid_id[Count]=Id;
								Id++;
								Count++;
							System.out.println("Enter the amount which you wanr to add in your card.");
							Card_Balance[Count]=sc.nextInt();
					}

}
}