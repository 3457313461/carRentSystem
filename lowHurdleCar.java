public class lowHurdleCar {
    private String name = "低栏车";//车辆名称
    private int price = 30;//车辆价格
    private double cargo = 1.5;//载货量
    private static int num;//租车数量
    private static int day;//租车时间

    //setter()方法
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public static void setNum(int num) {
        lowHurdleCar.num = num;
    }

    public static void setDay(int day) {
        lowHurdleCar.day = day;
    }

    //getter()方法
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
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
        System.out.printf("\t\t\t4-名称：低栏车\t\t价格：30元/(辆·天)\t\t载货量：1.5吨\n");
    }

    //展示租车结果
    public static void showResults(){
        if (num != 0){
            System.out.printf("低栏车：租车%d辆，时间为%d天\n",num, day);
        }
    }

}
