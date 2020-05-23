import java.util.Scanner;

public class rentSystem {
    private int price;//总价
    private int day;//租车时间
    private int num;//总租车数
    private int busload;//总载客量
    private double cargo;//总载货量

    //setter()方法
    public void setPrice(int price) {
        this.price += price;
    }
    public void setDay(int day) {
        this.day = Math.max(day, this.day);
    }
    public void setNum(int num) {
        this.num += num;
    }
    public void setBusload(int busload) {
        this.busload += busload;
    }
    public void setCargo(double cargo) {
        this.cargo += cargo;
    }

    //汇总结果
    public void calResults(int price, int day, int num, int busload, double cargo){
        this.setPrice(price);
        this.setDay(day);
        this.setNum(num);
        this.setBusload(busload);
        this.setCargo(cargo);
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t------------------------------欢迎使用租车系统------------------------------");
        rentSystem RENTSYSTEM = new rentSystem();
        //展示车辆信息
        RENTSYSTEM.showCarInfo();
        //租车
        //carNum为租车数，dayNum为租车时间
        int carNum = 0, dayNum = 0;
        double temp;
        Scanner car = new Scanner(System.in);
        Scanner day = new Scanner(System.in);
        for(int i = 1; i < 9; i++){
            switch (i){
                case 1:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为1的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    sedan SEDAN = new sedan();
                    sedan.setNum(carNum);
                    sedan.setDay(dayNum);
                    RENTSYSTEM.calResults(carNum*SEDAN.getPrice(), dayNum, carNum, carNum*SEDAN.getBusload(), 0);
                    break;
                case 2:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为2的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    minibus MINIBUS = new minibus();
                    minibus.setNum(carNum);
                    minibus.setDay(dayNum);
                    RENTSYSTEM.calResults(carNum*MINIBUS.getPrice(), dayNum, carNum, carNum*MINIBUS.getBusload(), 0);
                    break;
                case 3:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为3的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    bus BUS = new bus();
                    bus.setNum(carNum);
                    bus.setDay(dayNum);
                    RENTSYSTEM.calResults(carNum*BUS.getPrice(), dayNum, carNum, carNum*BUS.getBusload(), 0);
                    break;
                case 4:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为4的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    lowHurdleCar LOWHURDLECAR = new lowHurdleCar();
                    lowHurdleCar.setNum(carNum);
                    lowHurdleCar.setDay(dayNum);
                    temp = (double)carNum;
                    RENTSYSTEM.calResults(carNum*LOWHURDLECAR.getPrice(), dayNum, carNum, 0, temp * LOWHURDLECAR.getCargo());
                    break;
                case 5:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为5的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    highHurdleCar HIGHHURDLECAR = new highHurdleCar();
                    highHurdleCar.setNum(carNum);
                    highHurdleCar.setDay(dayNum);
                    temp = (double)carNum;
                    RENTSYSTEM.calResults(carNum*HIGHHURDLECAR.getPrice(), dayNum, carNum, 0, temp * HIGHHURDLECAR.getCargo());
                    break;
                case 6:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为6的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    van VAN = new van();
                    van.setNum(carNum);
                    van.setDay(dayNum);
                    temp = (double)carNum;
                    RENTSYSTEM.calResults(carNum*VAN.getPrice(), dayNum, carNum, 0, temp * VAN.getCargo());
                    break;
                case 7:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为7的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    jpTrack JPTRACK = new jpTrack();
                    jpTrack.setNum(carNum);
                    jpTrack.setDay(dayNum);
                    temp = (double)carNum;
                    RENTSYSTEM.calResults(carNum*JPTRACK.getPrice(), dayNum, carNum, carNum*JPTRACK.getBusload(), temp * JPTRACK.getCargo());
                    break;
                case 8:
                    System.out.println("------------------------------------------------------------");
                    System.out.println("请输入序号为8的车需要租车的数量，若不需要则请输入0：");
                    //输入合法性检查
                    if (car.hasNextInt()){
                        carNum = car.nextInt();
                        if (carNum < 0){
                            System.out.println("输入格式错误！");
                            continue;
                        }

                    }
                    else {
                        System.out.println("输入格式错误！");
                        continue;
                    }
                    //开始导入数据
                    if (carNum > 0){
                        //输入合法性检查
                        System.out.println("请输入租车天数：");
                        if (day.hasNextInt()){
                            dayNum = day.nextInt();
                            if (dayNum < 0){
                                System.out.println("输入格式错误！");
                                continue;
                            }
                        }
                        else {
                            System.out.println("输入格式错误！");
                            continue;
                        }
                    }
                    usTrack USTRACK = new usTrack();
                    usTrack.setNum(carNum);
                    usTrack.setDay(dayNum);
                    temp = (double)carNum;
                    RENTSYSTEM.calResults(carNum*USTRACK.getPrice(), dayNum, carNum, carNum*USTRACK.getBusload(), temp * USTRACK.getCargo());
                    break;
            }
        }
        //展示租车结果
        RENTSYSTEM.showResults();
    }

    //展示车辆信息
    public void showCarInfo(){
        new sedan().showCarInfo();
        new minibus().showCarInfo();
        new bus().showCarInfo();
        new lowHurdleCar().showCarInfo();
        new highHurdleCar().showCarInfo();
        new van().showCarInfo();
        new jpTrack().showCarInfo();
        new usTrack().showCarInfo();
    }

    //展示租车结果
    public void showResults(){
        System.out.println("------------------------------租车结果------------------------------");
        System.out.printf("总价：%d，总租车数：%d，租车时间：%d天，总载客量：%d人，总载货量：%.1f吨\n", this.price, this.num, this.day, this.busload, this.cargo);
        new sedan().showResults();
        new minibus().showResults();
        new bus().showResults();
        new lowHurdleCar().showResults();
        new highHurdleCar().showResults();
        new van().showResults();
        new jpTrack().showResults();
        new usTrack().showResults();
    }

}
