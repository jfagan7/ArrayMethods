
public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] removeDuplicates(int[] list)
	{
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
