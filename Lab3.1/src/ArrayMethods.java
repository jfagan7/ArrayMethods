
public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]list= {1,1,2,3,4,5,6};
		removeDuplicates(list);
	}
	public static int[] removeDuplicates(int[] list)
	{
		int size=list.length;
		int[] newList = null;
		for(int i=0;i<list.length-1;i++)
		{
			if(list[i]!=list[i+1])
			{
				newList[i]=list[i];
			}
		}
		return newList;
	}
}
