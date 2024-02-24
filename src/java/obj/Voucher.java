package src.java.obj;

public class Voucher {
    private int IdVoucher;
    private int IdType;
    private String StartDate;
    private String EndDate;
    private double Value;
    private String NameShop;
    private String Detail;

    public Voucher(int idVoucher, int idType, String startDate, String endDate, double value, String nameShop, String detail) {
        IdVoucher = idVoucher;
        IdType = idType;
        StartDate = startDate;
        EndDate = endDate;
        Value = value;
        NameShop = nameShop;
        Detail = detail;
    }

    public int getIdVoucher() {
        return IdVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        IdVoucher = idVoucher;
    }

    public int getIdType() {
        return IdType;
    }

    public void setIdType(int idType) {
        IdType = idType;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public String getNameShop() {
        return NameShop;
    }

    public void setNameShop(String nameShop) {
        NameShop = nameShop;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }
}
