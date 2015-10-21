//https://codility.com/programmers/task/frog_river_one
public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={1,3,1,4,2,3,5,4};
		int result=solution(5,A);
		System.out.println(result);
	}
	
	public static int solution(int X, int A[]){
		boolean passable[]=new boolean[X];
		int uncovered= X;
		for(int i=0;i<A.length;i++){
			if(A[i]<0 || A[i]>X){
				System.out.println("Error: Invalid Input");
				return -1;
			}
			if(passable[A[i]-1]==false){
				passable[A[i]-1]=true;
				uncovered-=1;
				if(uncovered==0)
					return i;
			}	
		}
		return -1;
	}

}
