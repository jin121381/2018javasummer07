//当输入没有的菜的时候，也不会产生error
import java.util.Scanner;
class Car{
	int speed;
	String color;
	Car(){
		this.speed=speed;
		this.color=color;
	}
	 public void upSpeed(int value){
		speed=speed+value;
	}
	 public void downSpeed(int value) {
		 speed=speed-value;
	 }
}
class dingdan{
	String name;
	int num;
	int value;
	dingdan() {
		this.name = name;
		this.num = num;
		this.value=value;
	}
	public  int sum(int sum,int value) {
		sum = value+sum;
		return sum;
	}
}
public class T11_0710 {
	public static int sum=0;
	public static void print_menu() {
		System.out.println("菜单：鱼香肉丝、辣白菜、炒牛肉、炒羊肉");
		System.out.println("1.点菜");
		System.out.println("2.结算");
		System.out.println("3.退出");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		Car myCar3 = new Car();
		myCar1.color="红色";
		myCar1.speed=0;
		myCar2.color="蓝色";
		myCar2.speed=0;
		myCar3.color="黄色";
		myCar3.speed=0;
		myCar1.upSpeed(30);
		System.out.println("Car1的颜色是"+myCar1.color+"，当前速度为"+myCar1.speed+"km");
		myCar2.upSpeed(60);
		System.out.println("Car2的颜色是"+myCar2.color+"，当前速度为"+myCar2.speed+"km");
		myCar3.upSpeed(0);
		System.out.println("Car3的颜色是"+myCar3.color+"，当前速度为"+myCar3.speed+"km");
		System.out.println("*********************************************************");
		int i = 0;
		int choice=0;
		String  menu[]= {"鱼香肉丝","辣白菜","炒牛肉","炒羊肉"};//菜名，可以随便改
		int value[]= {10,15,20,25};//菜价，可以随便改
		Scanner sc  = new Scanner(System.in);
		int count=0;
		dingdan a[]= new dingdan[9];
		while (choice !=3) {
			print_menu();
			switch(choice=sc.nextInt()) {
			case 1:
				boolean have = true;
				System.out.println("菜名:");
				String name = sc.next();
				for(i = 0;i<menu.length;i++) {
					if (name.equals(menu[i])) 
						break;
					else
						have=false;
				}
				if(i==menu.length&&have==false) {
					System.out.println("没有这种菜");
					break;
				}
			    a[count]=new dingdan();
				a[count].name=name;
				System.out.println("数量：");
				a[count].num=sc.nextInt();
				a[count].value=a[count].num*value[i];
				sum=a[count].sum(sum, a[count].value);
				count++;
				break;
			case 2:
				int id=0;
				for(id=0;id<count;id++) {
					System.out.println("菜名："+a[id].name+" 数量："+a[id].num);
				}
				System.out.println("总价："+sum);
				break;
			case 3:
				break;
			default:
				System.out.println("\n 输入错误请重新输入\n");
			}
		}
	}
}
