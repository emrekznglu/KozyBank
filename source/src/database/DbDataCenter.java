package database;

public class DbDataCenter extends DbConnection {
    
    protected int userId=0;
    protected String nameSurname,tcIdNo,phoneNo,customerNo;
    protected double balance;
    protected double ebill,wbill,ngbill,ibill;
    protected String myGitHubAccount = "https://github.com/emrekznglu";

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getEbill() {
        return ebill;
    }

    public void setEbill(double ebill) {
        this.ebill = ebill;
    }

    public double getWbill() {
        return wbill;
    }

    public void setWbill(double wbill) {
        this.wbill = wbill;
    }

    public double getNgbill() {
        return ngbill;
    }

    public void setNgbill(double ngbill) {
        this.ngbill = ngbill;
    }

    public double getIbill() {
        return ibill;
    }

    public void setIbill(double ibill) {
        this.ibill = ibill;
    }

    public String getMyGitHubAccount() {
        return myGitHubAccount;
    }   
}
