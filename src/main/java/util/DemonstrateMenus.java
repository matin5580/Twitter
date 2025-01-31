package util;

public class DemonstrateMenus {
    public void homeMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+--------------------+");
        System.out.println("|     1.Sign up      |");
        System.out.println("|     2.Log in       |");
        System.out.println("|     3.Exit         |");
        System.out.println("+--------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void howToLogInMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("Log in using : ");
        System.out.println("+-------------+");
        System.out.println("| 1.username  |");
        System.out.println("|   2.Email   |");
        System.out.println("+-------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void mainMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+-------------------------+");
        System.out.println("|      1.Your tweets      |");
        System.out.println("|      2.all tweets       |");
        System.out.println("|      3.profile          |");
        System.out.println("|      4.Search           |");
        System.out.println("|      5.log out          |");
        System.out.println("|      6.Exit             |");
        System.out.println("+-------------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void profileMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+-----------------------------+");
        System.out.println("|       1.change a field      |");
        System.out.println("|       2.delete a field      |");
        System.out.println("|      3.back to main menu    |");
        System.out.println("+-----------------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void tweetsMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+-----------------------------+");
        System.out.println("|       1.see your tweets     |");
        System.out.println("|       2.add a tweet         |");
        System.out.println("|      3.back to main menu    |");
        System.out.println("+-----------------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void eachTweetMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+-----------------------------+");
        System.out.println("|    1.Edit current tweet     |");
        System.out.println("|   2.delete current tweet    |");
        System.out.println("|        3.next tweet         |");
        System.out.println("|       4.back to menu        |");
        System.out.println("+-----------------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void allTweetsMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("| 1.comment 💬  2.like 👍  3.dislike 👎  4.next tweet  5.back to menu |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void commentMenu() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+-----------------------------+");
        System.out.println("|       1.add a comment       |");
        System.out.println("|     2.delete a comment      |");
        System.out.println("|      3.Edit a comment       |");
        System.out.println("|       4.back to menu        |");
        System.out.println("+-----------------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void toDoWithDeletableComments() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+----------------------------------+");
        System.out.println("| 1.delete  2.next  3.back to menu |");
        System.out.println("+----------------------------------+");
        System.out.print(Color.ANSI_RESET);
    }

    public void toDoWithEditableComments() {
        System.out.print(Color.ANSI_CYAN);
        System.out.println("+----------------------------------+");
        System.out.println("| 1.edit    2.next  3.back to menu |");
        System.out.println("+----------------------------------+");
        System.out.print(Color.ANSI_RESET);
    }
}