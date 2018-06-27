import java.util.ArrayList;

public class Simulator {

	
	public int NodeNum = 40;
	Node [] myNodes = new Node[NodeNum];
	// 40���� �����
	MC myMC = new MC();
	// MC�� �����
	public ArrayList<Circle> candidate = new ArrayList<Circle>();
	public ArrayList<Circle> singleCircle = new ArrayList<Circle>();
	
	public ArrayList<Cluster> singleCluster = new ArrayList<Cluster>();
	
	Simulator()
	{
		for(int i=0;i<NodeNum;i++)
		{
			myNodes[i] = new Node();
		}
		// Node ��ġ���� �Ϸ��Ͽ���.
	}
	
	public void Run()
	{
		MakeSingle();
		// Single Charging ����� �̿��ϵ��� �Ѵ�.
	
		myMC.RunSingleMC();
		
		MakeCircle();
		
		myMC.RunMultiMC();
	}

	
	public void MakeCircle()
	{
		
	}
	
	public void MakeSingle()
	{
		// Single Charging�� ���, ������ ��尡 �׳� Circle�� �Ǹ�ȴ�.
			
		Circle first = new Circle(0,0);
		this.singleCircle.add(first);
		Cluster firstCluster = new Cluster(first);
		this.singleCluster.add(firstCluster);
		
		// ù��° Ŭ�����ʹ� ���Ƿ� �����ؾ��ϹǷ� �־���.
		// ����ϰ�
		
		for(int i=0;i<NodeNum;i++)
		{
			Circle tmp = new Circle(myNodes[i]);
			this.singleCircle.add(tmp);
			// i��° ���"����" ������ �ִ� Circle�� ����� �׸� singleCircle ��ü�� �ִ´�.
			Cluster tmpCluster = new Cluster(tmp);
			this.singleCluster.add(tmpCluster);
			// Cluster�� �߰��ϵ��� �Ѵ�.
		}
		
		// Cluster�� ���� �ִ�.
		
		myMC.setSingleCluster(singleCluster);
		// singleCluster�� �־���.
		
	}
	
}
