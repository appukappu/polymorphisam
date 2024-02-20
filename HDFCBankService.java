package polymorphisam;

public class HDFCBankService extends RBIBankService{
    public double calculateInterset(int principalAtm) {
        double totalAtm=0;
        double intresetAtm = super.calculateInterset(principalAtm);
        totalAtm = intresetAtm+principalAtm;
        return totalAtm;
    }
    public double calculateInterset(int principalAtm,int days) {
        double totalAtm =0;
        if(days >89){
            return this.calculateInterset(principalAtm);
        }
        return totalAtm + principalAtm;
    }
}
//output