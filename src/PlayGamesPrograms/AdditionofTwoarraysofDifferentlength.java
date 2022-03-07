package PlayGamesPrograms;

public class AdditionofTwoarraysofDifferentlength {

	public static void main(String[] args) {
		int[] arr1={2,5,8,7};
		int[] arr2={3,4,2,7,5};
		int count = arr1.length;
		if(count<arr2.length)
		{
			count=arr2.length;		
		}
		for(int i=0;i<count;i++)
		{
			try{
				
			
			System.out.println(arr1[i]+arr2[i]);
			}
			catch(Exception e)
			{
				if(arr1.length>arr2.length){
				System.out.println(arr1[i]);
				}
				else{
					System.out.println(arr2[i]);
				}
			}
		}
	}
}
