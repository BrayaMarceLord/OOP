package banco;

public class Cdt {
    private double principal;
    private double interestRate;
    private int term;

    public Cdt(double principal, double interestRate, int term) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.term = term;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double calculateCdtValue() {
        double interest = principal * interestRate * term / 365;
        return principal + interest;
    }

    public void displayCdtValue() {
        double cdtValue = calculateCdtValue();
        System.out.println("El valor del CDT a termino de " + term + " dias es de: " + cdtValue);
    }
}
