package QuestionsAnswers;

public class BitManipulation {
    public static void main(String[] args) {
        PowerSet p = new PowerSet();
        p.printSet();

    }
}

class PowerSet
{
	public void printSet() {
		
		String[] s = {"a","b","c"};
		
		int n= s.length;
		int len = (int)Math.pow(2,n);
// 		System.out.println(len);
		
		for (int i=0; i<len; i++) {
		    String ans = "";
		    for (int j=0; j<n; j++) {
		        
		        if ((i&(1<<j))!=0) {
		            ans += s[j];
		        }
		    }
		    
		    System.out.print(ans+" ");
		}
	}
}

