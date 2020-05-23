public class minibus {
    private String name = "面包车";//车辆名
    private int price = 65;//车辆价格
    private int busload = 7;//车辆载客数
    private static int num;//租车数
    private static int day;//租车天数

    //setter()方法
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBusload(int busload) {
        this.busload = busload;
    }

    public static void setNum(int num) {
        minibus.num = num;
    }

    public static void setDay(int day) {
        minibus.day = day;
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

    public static int getNum() {
        return num;
    }

    public static int getDay() {
        return day;
    }

    //展示车辆信息
    public void showCarInfo(){
        System.out.printf("\t\t\t2-名称：面包车\t\t价格：65元/(辆·天)\t\t载客数：7人\n");
    }

    //展示租车结果
    public static void showResults() {
        if (num != 0) {
            System.out.printf("面包车：租车%d辆，时间为%d天\n", num, day);
        }
    }

}
