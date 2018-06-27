import java.util.ArrayList;

public class MC {

	public int SectorN = 4;
	// �켱 Sector�� 4���� �����Ѵٰ� �����Ѵ�.
	public boolean []isOn = null;
	// � Sector�� �����ִ��� �����ϱ� ���� �迭
	public int checkSector = 4;
	// ��� Sector�� �����ִ��� Ȯ���ϱ� ���� ����, ���������� 4�ǰ��� ������ ��� ���͸� Ű�Եȴ�.
	public double Pt = 3;
	// Transfer power 3W
	public double Gt = 16;
	// Transfer Antenna Gain
	
	public double x = 0;
	public double y = 0;
	// ���� MC�� ��ġ
	
	
	public ArrayList<Cluster> singleCL = null;
	public ArrayList<Cluster> multiCL = null;
	
	public TSP mytsp = null;
	
	MC()
	{
		isOn = new boolean[SectorN];
		// Sector�� ������ŭ isOn�� �����Ѵ�.
		Gt = SectorN / checkSector; 
		// ���������� SectorN�� ������ 4�̰�, checkSector�� ���� 4 -> Omni�� ��Ȳ�̶�� 4/4 = 1�� �ɰ��̰� 2���� ���������� 2�� ���� ������ ���̴�
		
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
		// �� �Լ� ������ ������ �ް�, � ������ ��尡 �����ϴ��� Ȯ���Ͽ����Ѵ�.
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
		
		// ���⼭ Single, Multi���ÿ� �����Ѱ� ����
		// ���ʿ� ù��°�� �� Cluster�� 0,0 ��ġ�̹Ƿ� �׳� ������ȴ�.
		
		System.out.println("Cluster�� ������� = " + singleCL.size());
		
		mytsp = new TSP(singleCL);
		mytsp.Run();
	}
}
