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

    public void printAllSeries () {
        for (Series allSeries : series) {
            System.out.println(allSeries.getName());
        }
    }

    public void chooseSeriesToWatch (String seriesName, Account account) {
        Series s = null;
        for (Series series : series) {
            if (series.getName().equals(seriesName)) {
                s = series;

            }
        }

    }

    public Series[] getSeries() {
        return series;
    }

    public Account[] getAccounts() {
        return accounts;
    }
}
