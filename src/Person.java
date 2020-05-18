import Transport.AirTransport;
import Transport.LandTransport;
import Transport.MaritimeMeansOfTransport;

public class Person {
    private int P_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }
    //驾驶陆地交通工具
     public void driveLand_Transport(LandTransport landTransport){
        System.out.println("正在驾驶："+landTransport.getTransport_name()+ " 拥有者："+landTransport.getOwnership());
        System.out.println("当前位置："+landTransport.getGpsPosition()+ " 价格："+landTransport.getPrice());
    }
    //驾驶空中交通工具
    public void driveAir_Transport(AirTransport airTransport){
        System.out.println("正在驾驶："+airTransport.getTransport_name()+ " 拥有者："+airTransport.getOwnership());
        System.out.println("当前位置："+airTransport.getGpsPosition()+ " 价格："+airTransport.getPrice());
    }
    //驾驶海上交通工具
    public void driveMaritimeMeansOf_Transport(MaritimeMeansOfTransport maritimeMeansOfTransport){
        System.out.println("正在驾驶："+maritimeMeansOfTransport.getTransport_name()+ " 拥有者："+maritimeMeansOfTransport.getOwnership());
        System.out.println("当前位置："+maritimeMeansOfTransport.getGpsPosition()+ " 价格："+maritimeMeansOfTransport.getPrice());
    }

    public int getP_Age() {
        return P_Age;
    }

    public void setP_Age(int p_Age) {
        P_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }
}
