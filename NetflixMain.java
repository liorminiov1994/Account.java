import java.util.Scanner;

public class NetflixMain {

    private static Netflix netflix;



    public static void main(String[] args) {



            Episode na1 = new Episode("Episode 1", "Episode 1 of Naruto", new Date(19, 10, 2005));
            Episode na2 = new Episode("Episode 2", "Episode 2 of Naruto", new Date(26, 10, 2005));
            Episode na3 = new Episode("Episode 3", "Episode 3 of Naruto", new Date(3, 11, 2005));
            Episode[] narutoEpisodes = {na1, na2, na3};
            Series Naruto = new Series("Naruto ", narutoEpisodes);


            Episode a1 = new Episode("Episode 1", "Episode 1 of Arrow", new Date(10, 10, 2007));
            Episode a2 = new Episode("Episode 2", "Episode 2 of Arrow", new Date(17, 10, 2007));
            Episode a3 = new Episode("Episode 3", "Episode 3 of Arrow", new Date(24, 10, 2007));
            Episode[] arrowEpisodes = {a1, a2, a3};
            Series Arrow = new Series("Arrow", arrowEpisodes);

            Episode fr1 = new Episode("Episode 1", "Episode1 of  Friends  ", new Date(7, 7, 2000));
            Episode fr2 = new Episode("Episode 2", "Episode 2 of  Friends", new Date(14, 7, 2000));
            Episode fr3 = new Episode("Episode 3", "Episode 3 of  Friends", new Date(21, 7, 2000));
            Episode[] friendEpisodes = {fr1, fr2, fr3};
            Series Friends = new Series("Friends", friendEpisodes);


            netflix = new Netflix(new Series[]{Naruto});
            netflix = new Netflix(new Series[]{Arrow});
            netflix = new Netflix(new Series[]{Friends});






        Account acc1 = new Account("TheNerd" , "Bznga11",new Date(1,12,2021), new Date(1,12,2022));
        Account acc2 = new Account("TheOne1" , "Ecanor11",new Date(7,12,2021), new Date(7,12,2022));
        Account acc3 = new Account("LomMga" , "lr1994",new Date(15,9,2021), new Date(15,9,2022));
        Account[] accounts = {acc1,acc2,acc3};



        netflix.addAccount(acc1);
        netflix.addAccount(acc2);
        netflix.addAccount(acc3);

        showMainMenu();

        System.out.println("done");
        System.out.println("Menu: \n" +
                "1 - show list of series \n" +
                "2 - show the series that you started watching \n" +
                "3 - show account info \n" +
                "4 - choose a series to watch \n" +
                "5 - EXIT \n");

        System.out.println("Please enter your choice: ");

        int userOption;
        Scanner scanner = new Scanner(System.in);


        do {
            userOption = scanner.nextInt();
            if (userOption <= 5 && userOption >= 1) {
                break;
            } else {
                System.out.println("Wrong number, please enter number 1-5: ");
            }
        } while (true);




        switch (userOption) {


            case Options.PRINT_ALL_SERIES:
                System.out.println("The series are: \n"  );
                netflix.printAllSeries();
                break;


            case Options.PRINT_VIEWED_SERIES:
                netflix.printAllSeries();
                break;


            case Options.PRINT_ACCOUNT_INFO:
                for(int i = 0; i < accounts.length; i++)
                    accounts[i].printAccountInfo();


                break;

            case Options.PRINT_CHOSE_SERIES_TO_WATCH:

                break;

            case Options.EXIT:
                System.out.println("Exiting... see you soon !");
                break;



            default:
                System.out.println("Wrong option! ");


        }

    }

    private static Netflix getNetflix() {
        return netflix;
    }

    public static void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Create account\n" + "2.Login into existing account");
        int option = scanner.nextInt(); // 1  ---> Enter  // stack
        scanner.nextLine();  // scannerFlush

        if (option == 1) {
            String username;
            boolean userNameExist;
            do {
                userNameExist = false;
                System.out.println("Please insert your username:");
                username = scanner.nextLine();
                for (Account account : netflix.getAccounts()) {
                    if (username.equals(account.getUser_name())) {
                        System.out.println("The username is already taken!");
                        userNameExist = true;
                    }
                    break;
                }
            } while (userNameExist);


            System.out.println("Please insert your password:");
            String password = scanner.nextLine();
            Account account = new Account(username, password, new Date(10, 2, 2021), new Date(1, 12, 2022));
            netflix.addAccount(account);


            System.out.println("account created , enjoy !");


        }
        if (option == 2) {
            String username;
            boolean user_Name_Exist;
            do {
                user_Name_Exist = false;
                System.out.println("Log in existing account :\n please insert your username:");
                username = scanner.nextLine();
            } while (user_Name_Exist);


            System.out.println("Please insert your password:");
            String password = scanner.nextLine();

            Account account = new Account(username, password, new Date(10, 02, 2021), new Date(10, 02, 2022));
            netflix.addAccount(account);


            System.out.println("accepted !");

        }



    }


}
