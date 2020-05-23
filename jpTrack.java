public class jpTrack {
    private String name = "日式皮卡车";//车辆名称
    private int price = 60;//车辆价格
    private int busload = 5;//载客量
    private double cargo = 1;//载货量
    private static int num;//租车数量
    private static int day;//租车时间

    //setter()方法
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBusload(int people) {
        this.busload = people;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public static void setNum(int num) {
        jpTrack.num = num;
    }

    public static void setDay(int day) {
        jpTrack.day = day;
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

    public int getNum() {
        return num;
    }

    public int getDay() {
        return day;
    }

    //展示车辆信息
    public void showCarInfo(){
        System.out.printf("\t\t\t7-名称：日式皮卡车\t\t价格：60元/(辆·天)\t\t载客量：5人\t\t载货量：1吨\n");
    }

    //展示租车结果
    public static void showResults(){
        if (num != 0){
            System.out.printf("日式皮卡车：租车%d辆，时间为%d天\n", num, day);
        }
    }

}
