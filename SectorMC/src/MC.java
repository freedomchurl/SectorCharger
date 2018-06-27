import java.util.ArrayList;

public class MC {

	public int SectorN = 4;
	// 우선 Sector는 4개가 존재한다고 가정한다.
	public boolean []isOn = null;
	// 어떤 Sector가 켜져있는지 저장하기 위한 배열
	public int checkSector = 4;
	// 몇개의 Sector가 켜져있는지 확인하기 위한 변수, 기존적으로 4의값을 가지고 모든 섹터를 키게된다.
	public double Pt = 3;
	// Transfer power 3W
	public double Gt = 16;
	// Transfer Antenna Gain
	
	public double x = 0;
	public double y = 0;
	// 현재 MC의 위치
	
	
	public ArrayList<Cluster> singleCL = null;
	public ArrayList<Cluster> multiCL = null;
	
	public TSP mytsp = null;
	
	MC()
	{
		isOn = new boolean[SectorN];
		// Sector의 개수만큼 isOn을 설정한다.
		Gt = SectorN / checkSector; 
		// 기존적으로 SectorN의 개수가 4이고, checkSector의 값이 4 -> Omni한 상황이라면 4/4 = 1이 될것이고 2개만 켜져있으면 2의 값이 생성될 것이다
		
	}
	
	public int CheckSector()
	{
		int count = 0;
		
		for(int i=0;i<this.SectorN;i++) {
			if(isOn[i]==true)
				count++;
		}
		
		checkSector = count;
		return checkSector;
	}
	
	public void CheckNode(Node [] input)
	{
		// 이 함수 내에서 노드들을 받고, 어떤 영역에 노드가 존재하는지 확인하여야한다.
	}
	
	public void setSingleCluster(ArrayList<Cluster> input)
	{
		this.singleCL = input;
	}
	
	public void setMultiCluster(ArrayList<Cluster> input)
	{
		this.multiCL = input;
	}
	
	public void RunMultiMC()
	{
		this.x = 0;
		this.y = 0;
		
		
	}
	
	public void RunSingleMC()
	{
		this.x = 0;
		this.y = 0;
		
		// 여기서 Single, Multi동시에 가능한것 구현
		// 애초에 첫번째에 들어간 Cluster가 0,0 위치이므로 그냥 돌리면된다.
		
		System.out.println("Cluster의 사이즈는 = " + singleCL.size());
		
		mytsp = new TSP(singleCL);
		mytsp.Run();
	}
}
