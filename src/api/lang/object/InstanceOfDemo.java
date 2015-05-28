package api.lang.object;

/*
 * ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ����
 * �˾ƺ��� ���� instanceof �����ڸ� ����Ѵ�.
 * ������ ����δ� true �� false �� �ϳ��� �����Ѵ�.
 * */
public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Amblulance amblulance = new Amblulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
	}
	
	public void doWork(Car dc){
		/*
		 * �ҹ����� Car Ÿ������ Ȯ�� �� �´ٸ�
		 * (FireCar) �� ��ü ĳ������ �϶�
		 * */
		if (dc instanceof FireCar) {
			FireCar f = (FireCar) dc;
			f.driver();
			f.stop();
			f.shootWater();
			/*
			 * �Ķ���ͷ� �Ѿ�� c�� Car Ÿ������ Ȯ�� �� 
			 * �´ٸ� (Amblulance) �� ��ü ĳ������ �϶�
			 * */
		} else if (dc instanceof Amblulance) {
			Amblulance a = (Amblulance) dc;
			a.driver();
			a.siren();
			a.stop();
		}
	}
}
class Car{
	String color;
	int door;
	void driver(){System.out.println("������..");}
	void stop(){System.out.println("���� !!");}
}
class FireCar extends Car{ // Car Ŭ������ ��ӹ��� �ҹ���
	void shootWater(){
		System.out.println("�� �ѷ� �� ���� ��...");
	}
}
class Amblulance extends Car{ // Car Ŭ������ ��ӹ��� ���深��
	void siren(){
		System.out.println("���̷��� �︮�� ���� ��...");
	}
}