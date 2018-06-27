
public class Cluster {

	
	public Circle myCircle = null;
	
	Cluster(Circle input)
	{
		myCircle = input;
		// Cluster의 Circle을 그대로 대입하는 생성자
	}
	
	Cluster()
	{
		
	}
	
	public int getNodesNum()
	{
		return myCircle.myNodes.size();
		// Circle에 담겨있는 노드의 개수를 리턴한다.
	}
	
	public int consumedEnergy()
	{
		if(getNodesNum()==1)
		{
			// Single Charging일 경우
			return 1;
		}
		
		return 0;
	}
	
}
