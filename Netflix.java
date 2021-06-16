public class Netflix {
    Series[] series;
    Account[] accounts;
    int lastIndex;
    static final int MAX = 30;


    public Netflix(Series[] series) {
        this.accounts = new Account[MAX];
        this.series = series;
        this.lastIndex = 0;
    }

    public void addAccount(Account account) {
        this.accounts[lastIndex] = account;
        lastIndex++;
    }

    public Series[] getSeries() {
        return series;
    }

    public Account[] getAccounts() {
        return accounts;
    }
}
