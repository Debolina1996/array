
public class DuplicateArray {
	public static void main(String[] args) {
		int [] x={6,9,8,9,1,8};
		int count=0;
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) 
					System.out.println(x[j]);
					//count++;
					//break;
				
				
			}
		}
		//System.out.println("duplicate:="+count);
	}
}