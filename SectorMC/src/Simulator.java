import java.util.ArrayList;

public class Simulator {

	
	public int NodeNum = 40;
	Node [] myNodes = new Node[NodeNum];
	// 40개를 만들고
	MC myMC = new MC();
	// MC를 만들고
	public ArrayList<Circle> candidate = new ArrayList<Circle>();
	public ArrayList<Circle> singleCircle = new ArrayList<Circle>();
	
	public ArrayList<Cluster> singleCluster = new ArrayList<Cluster>();
	
	Simulator()
	{
		for(int i=0;i<NodeNum;i++)
		{
			myNodes[i] = new Node();
		}
		// Node 배치까지 완료하였다.
	}
	
	public void Run()
	{
		MakeSingle();
		// Single Charging 기법을 이용하도록 한다.
	
		myMC.RunSingleMC();
		
		MakeCircle();
		
		myMC.RunMultiMC();
	}

	
	public void MakeCircle()
	{
		
	}
	
	public void MakeSingle()
	{
		// Single Charging의 경우, 각자의 노드가 그냥 Circle이 되면된다.
			
		Circle first = new Circle(0,0);
		this.singleCircle.add(first);
		Cluster firstCluster = new Cluster(first);
		this.singleCluster.add(firstCluster);
		
		// 첫번째 클러스터는 임의로 시작해야하므로 넣었다.
		// 깔끔하게
		
		for(int i=0;i<NodeNum;i++)
		{
			Circle tmp = new Circle(myNodes[i]);
			this.singleCircle.add(tmp);
			// i번째 노드"만을" 가지고 있는 Circle을 만들고 그를 singleCircle 객체에 넣는다.
			Cluster tmpCluster = new Cluster(tmp);
			this.singleCluster.add(tmpCluster);
			// Cluster를 추가하도록 한다.
		}
		
		// Cluster를 갖고 있다.
		
		myMC.setSingleCluster(singleCluster);
		// singleCluster를 넣었다.
		
	}
	
}
