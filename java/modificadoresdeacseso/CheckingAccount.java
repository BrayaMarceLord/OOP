package banco;

public class CheckingAccount {
  private String name;
  private double balance;
  private String id;
  private double interestRate;
  private double interestCdt;
  private double valorCdt2;
  
  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
    this.interestCdt = 0.1075;
    this.valorCdt2= 0;
  }
  public void consignacion(int valor){
    System.out.println("El deposito es de= "+ valor);
    this.balance = valor + balance; 
  }
  public void retiro(int valor){
    System.out.println("El retiro es de= "+ valor);
    this.balance = - valor + balance; 
  }
  public void ValorCdt(int valor1, double otroValor){
    double valorCdt = valor1 * otroValor; 
    System.out.println("El valor del CDT a termino de 90 dias es de: " + valorCdt);
}


  public double getBalance(){
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
}   
/* Tarea, hacer tres consignaciones, metodo consignar, se suma al balance. 
metodo retiro, hacer tres retiros, 
*/