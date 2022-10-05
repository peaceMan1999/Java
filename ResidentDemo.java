import java.util.Calendar;
import java.util.GregorianCalendar;

class Resident{
    private String name;
    private String IDNumber;

    public Resident() {
        this.name = "";
        this.IDNumber = "";
    }

    public Resident(String name, String IDNumber) {
        this.name = name;
        this.IDNumber = IDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    private static String[] province = {
            "11:北京", "12:天津", "13:河北", "14:山西",
            "15:内蒙古", "21:辽宁", "22:吉林", "23:黑龙江",
            "31:上海", "32:江苏", "33:浙江", "34:安徽",
            "35:福建", "36:江西", "37:山东", "41:河南",
            "42:湖北", "43:湖南", "44:广东", "45:广西",
            "46:海南", "50:重庆", "51:四川", "52:贵州",
            "53:云南", "54:西藏", "61:陕西", "62:甘肃",
            "63:青海", "64:宁夏", "65:新疆", "71:台湾",
            "81:香港", "82:澳门", "91:国外"};

    private String getWhere(){
        String res = IDNumber.substring(0,2);
        for (int i = 0; i < province.length; i++) {
            String pro = province[i].substring(0,2);
            if(pro.equals(res)){
                return province[i].substring(3);
            }
        }
        return "无";
    }

    private int getAge(){
        int yy = Integer.parseInt(IDNumber.substring(6,10));
        int mm = Integer.parseInt(IDNumber.substring(10,12));
        int dd = Integer.parseInt(IDNumber.substring(12,14));
        GregorianCalendar date1=new GregorianCalendar(yy,mm-1,dd);
        GregorianCalendar date2=new GregorianCalendar();
        double d1=yy+mm/100.0+dd/10000.0;
        double d2=date2.get(Calendar.YEAR)+date2.get(Calendar.MONTH)/100.0+date2.get(Calendar.DAY_OF_MONTH)/10000.0;
        int age=(int)(d2-d1);
        return age;
    }

    private String getMale(){
        int male = Integer.parseInt(IDNumber.substring(16,17));
        if (male % 2 == 0)
            return "女";
        else
            return "男";
    }

    public String to_String(){
        String place = getWhere();

        int age = getAge();
        String male = getMale();
        String yy = IDNumber.substring(6,10);
        String mm = IDNumber.substring(10,12);
        String dd = IDNumber.substring(12,14);
        String Date = yy+"年"+mm+"月"+dd+"日,年龄:"+age+"岁";

        String res = "姓名：" + name + "\n" +
                "身份证号码："+IDNumber +"\n" +
                "个人信息：" + "\n" +
                "姓   名："+ name + "\n" +
                "出生省份："+place + "\n" +
                "出生日期："+Date + "\n" +
                "性   别："+male + "\n";
        return res;
    }

}

public class ResidentDemo {
    public static void main(String[] args) {
        Resident rd = new Resident("韦小宝","11204419541220243X");
        String res = rd.to_String();
        System.out.println(res);

    }

}
