
public class Ch05Ex02_14 {

	public static void main(String[] args) {
		int[][] a= new int[][] {{3,5,9},
								{2,11,5},
								{8,30,10},
								{22,5,1}
								};
		int sum=0;
								
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%d ",a[i][j]);
				sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.printf("%d", sum);
								
		
		
	}

}
