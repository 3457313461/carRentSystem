public class usTrack {
    private String name = "美式皮卡车";//车辆名称
    private int price = 60;//车辆价格
    private int busload = 2;//载客量
    private double cargo = 3;//载货量
    private static int num;//租车数量
    private static int day;//租车时间

    //setter()方法
    public static void setNum(int num) {
        usTrack.num = num;
    }
    public static void setDay(int day) {
        usTrack.day = day;
    }

    //getter()方法
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getBusload() {
        return busload;
    }
    public double getCargo() {
        return cargo;
    }
    public static int getNum() {
        return num;
    }
    public static int getDay() {
        return day;
    }

    //展示车辆信息
    public void showCarInfo(){
        System.out.printf("\t\t\t8-名称：美式皮卡车\t\t价格：60元/(辆·天)\t\t载客量：2人\t\t载货量：3吨\n");
    }

    //展示租车结果
    public static void showResults(){
        if (num != 0){
            System.out.printf("美式皮卡车：租车%d辆，时间为%d天\n", num, day);
        }
    }
}
