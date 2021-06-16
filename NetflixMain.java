import java.util.Scanner;

public class NetflixMain {

    private static Netflix netflix;


    public static void main(String[] args) {

        Episode fr1  = new Episode("Episode 1", "Episode 1 of Friends", new Date(14,7,2000));
        Episode fr2 = new Episode("Episode 2", "Episode 2 of Friends", new Date(15,7,2000));
        Episode fr3 = new Episode("Episode 3", "Episode 3 of Friends", new Date(16,7,2000));
        Episode [] friendsEpisodes = {fr1 , fr2 ,fr3};
        Series friends = new Series("Friends" , friendsEpisodes);

        Episode pb1  = new Episode("Episode 1", "Episode 1 of Peaky Blinders", new Date(14,7,2000));
        Episode pb2 = new Episode("Episode 2", "Episode 2 of Peaky Blinders", new Date(15,7,2000));
        Episode pb3 = new Episode("Episode 3", "Episode 3 of Peaky Blinders", new Date(16,7,2000));
        Episode [] peakyBlindersEpisodes = {pb1 , pb2 ,pb3};
        Series thePeakyBlinders = new Series("The Peaky Blinders" , peakyBlindersEpisodes);

        Episode br1  = new Episode("Episode 1", "Episode 1 of Breaking Bad", new Date(14,7,2000));
        Episode br2 = new Episode("Episode 2", "Episode 2 of Breaking Bad", new Date(15,7,2000));
        Episode br3 = new Episode("Episode 3", "Episode 3 of Breaking Bad", new Date(16,7,2000));
        Episode [] breakingBadEpisodes = {br1 , br2 ,br3};
        Series breakingBad = new Series("Friends" , breakingBadEpisodes);

        Account acc1 = new Account("Play45" , "BS1999",new Date(1,12,2021), new Date(1,12,2022));
        Account acc2 = new Account("Maximus12" , "mfg1880",new Date(1,12,2021), new Date(1,12,2022));
        Account acc3 = new Account("Liorius94" , "lr158aa4",new Date(1,12,2021), new Date(1,12,2022));

        netflix = new Netflix(new Series[]{friends});
        netflix = new Netflix(new Series[]{thePeakyBlinders});
        netflix = new Netflix(new Series[]{breakingBad});

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

                break;


            case Options.PRINT_VIEWED_SERIES:


                break;

            case Options.PRINT_MENU_INFO:

                break;

            case Options.PRINT_CHOSE_SERIES_TO_WATCH:

                break;

            case Options.EXIT:

                break;



            default:
                System.out.println("Wrong option! ");


        }

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
            Account account = new Account(username, password, new Date(1, 12, 2021), new Date(1, 12, 2022));
            netflix.addAccount(account);


            System.out.println("account created , enjoy !");


        }
        if (option == 2) {
            String username;
            boolean userNameExist;
            do {
                userNameExist = false;
                System.out.println("Log in existing account:\nplease insert your username:");
                username = scanner.nextLine();
            } while (userNameExist);


            System.out.println("Please insert your password:");
            String password = scanner.nextLine();

            Account account = new Account(username, password, new Date(1, 12, 2021), new Date(1, 12, 2022));
            netflix.addAccount(account);


            System.out.println("accepted !");

        }



    }


}
