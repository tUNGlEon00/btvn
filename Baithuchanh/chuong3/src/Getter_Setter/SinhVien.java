package Getter_Setter;

public class SinhVien {
    private String ten;
    private String tuoi;
    public String getTen()
    {
        return ten;
    }
    public void setTen(String a)
    {
        if(a==null || a.isEmpty())
        this.ten="Khong biet";
        else
        this.ten=a;
    }
    public String getTuoi()
    {
        if(Integer.valueOf(tuoi)==-1)
        {
            return "Tuoi k hop le";
        }
        else return tuoi;
    }
    public void setTuoi(int tuoi)
    {
        if(tuoi>18)
        {
            this.tuoi=String.valueOf(tuoi);

        } else
        this.tuoi=String.valueOf(-1);
    }
    public static void main(String[] args) {
        SinhVien sv1= new SinhVien();
        SinhVien sv2=new SinhVien();
        sv1.setTen("");
        sv2.setTen("Tien");
        sv1.setTuoi(20);
        sv2.setTuoi(17);
        System.out.println("Sv ten "+sv1.getTen()+" "+sv1.getTuoi()+" tuoi.");
        System.out.println("Sv ten "+sv2.getTen()+" "+sv2.getTuoi()+" tuoi.");

    }
}
