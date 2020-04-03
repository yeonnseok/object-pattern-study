package chapter05.srp.object;

public interface VendingMachine {
    void insert(double money);

    Coffee buy(Coffee coffee);

    void cancel();
}
