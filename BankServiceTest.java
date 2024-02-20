package polymorphisam;

public class BankServiceTest {
    public static void main(String[] args) {
        SBIBankService sbiBankService = new SBIBankService();
        double sbi= sbiBankService.calculateInterset(1000,86);
        System.out.println("SBI Bank : "+sbi);
        HDFCBankService hdfcBankService = new HDFCBankService();
        double hdfc = hdfcBankService.calculateInterset(1000,88);

        System.out.println("HDFC Bank : "+hdfc);

    }

    }

