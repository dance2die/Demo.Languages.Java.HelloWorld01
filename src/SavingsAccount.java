/**
 * Created by dance2die on 2/12/2016.
 */
public class SavingsAccount {
    private int _balance;

    public SavingsAccount(int _balance) {
        this._balance = _balance;
    }

    public SavingsAccount deposit(int amount){
        _balance += amount;
        return this;
    }

    public SavingsAccount printBalance(){
        System.out.println(_balance);
        return this;
    }
}
