
public class FrgJumpSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int result=solution(10,85,30);
          System.out.println(result);
	}
	
	public static int solution(int X,int Y,int D){
		return (int)Math.ceil((double)Math.abs(Y-X)/D);
	}

}
