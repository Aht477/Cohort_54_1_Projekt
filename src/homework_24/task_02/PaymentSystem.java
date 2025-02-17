package homework_24.task_02;
/*
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
 */
public interface PaymentSystem {
    void withdrawMoney(); // (снятие со счета) - списываются деньги со счета
    void depositTransfer(double amount); // (поступление денег на счет)
    void checkBalance(); // (остаток на счете)



}
