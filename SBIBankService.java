package polymorphisam;

public class SBIBankService extends RBIBankService{

    public double calculateInterset(int principalAtm) {
        double totalAtm=0;
        double intresetAtm = super.calculateInterset(principalAtm);
       totalAtm = intresetAtm+principalAtm;
        return totalAtm;
    }
    public double calculateInterset(int principalAtm,int days) {
        double totalAtm =0;
        if(days >85){
           return this.calculateInterset(principalAtm);
        }
        return totalAtm + principalAtm;
    }
}
