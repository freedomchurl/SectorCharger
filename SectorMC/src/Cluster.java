
public class Cluster {

	
	public Circle myCircle = null;
	
	Cluster(Circle input)
	{
		myCircle = input;
		// Cluster�� Circle�� �״�� �����ϴ� ������
	}
	
	Cluster()
	{
		
	}
	
	public int getNodesNum()
	{
		return myCircle.myNodes.size();
		// Circle�� ����ִ� ����� ������ �����Ѵ�.
	}
	
	public int consumedEnergy()
	{
		if(getNodesNum()==1)
		{
			// Single Charging�� ���
			return 1;
		}
		
		return 0;
	}
	
}
