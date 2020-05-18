import Transport.Aircraft;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person1=new Person();//实例化一个人
        person1.setId("201902177");
        person1.setP_Sex("男");
        person1.setP_Name("小宇");
        person1.setP_Age(19);
        //初始化人的信息
        Aircraft aircraft=new Aircraft();//实例化一个飞机
        aircraft.setPrice("1800万");
        aircraft.setOwnership("小宇");
        aircraft.setGpsPosition("西南");
        aircraft.setTransport_name("飞机");
        //初始化飞机信息
        System.out.println("Id："+person1.getId());
        System.out.println("姓名："+person1.getP_Name());
        System.out.println("年龄："+person1.getP_Age());
        System.out.println("性别："+person1.getP_Sex());
        person1.driveAir_Transport(aircraft);//驾驶飞行工具中的飞机

    }
}
