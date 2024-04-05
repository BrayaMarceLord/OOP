
package banco;

public class Banco {
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  private CheckingAccount Consignacion;
  private CheckingAccount Cdtport;
  
  
  public Banco(){
    accountOne = new CheckingAccount(" Zeus ", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
    Consignacion = new CheckingAccount("0",555,"0");
  }

  public static void main(String[] args){
    Banco bankOfGods = new Banco();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    bankOfGods.accountOne.consignacion(1000000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignacion(1000000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignacion(1000000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    bankOfGods.accountOne.retiro(100000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retiro(10000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retiro(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.ValorCdt(1000, 0.1075);
    Cdt cdt = new Cdt(20000, 0.1075, 90);
    cdt.displayCdtValue();
  }
}
