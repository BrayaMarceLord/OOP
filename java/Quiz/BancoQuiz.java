package bancoquiz;

public class BancoQuiz {
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  
  
  public BancoQuiz(){
    accountOne = new CheckingAccount(" Zeus ", 0, "1");
    accountTwo = new CheckingAccount("Hades", 0, "2");
  }

  public static void main(String[] args){
    BancoQuiz bankOfGods = new BancoQuiz();
    System.out.println(bankOfGods.accountOne.getBalance());
    
    System.out.println("Aqui las consignaciones y retiros de la cuenta 1");
    
    bankOfGods.accountOne.setBalance(500);
    bankOfGods.accountOne.consignacion(1000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retiro(10);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignacion(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retiro(10);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignacion(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retiro(10);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignacion(4000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retiro(10);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.consignacion(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retiro(10);
    System.out.println(bankOfGods.accountOne.getBalance());
    /*acounttwo*/
    System.out.println("Aqui las consignaciones y retiros de la cuenta 2");
    
    bankOfGods.accountOne.setBalance(500);
    bankOfGods.accountTwo.consignacion(1000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retiro(10);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignacion(2000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retiro(10);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignacion(3000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retiro(10);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignacion(4000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retiro(10);
    System.out.println(bankOfGods.accountTwo.getBalance());
    
    bankOfGods.accountTwo.consignacion(5000);
    System.out.println(bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.retiro(10);
    System.out.println(bankOfGods.accountTwo.getBalance());
  }
}
/* Abrir la cuenta es setacount primera consignacion(afectar el balance)*/
