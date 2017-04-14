import java.util.Scanner;
import java.util.Stack;

//Program for Balanced Paranthesis
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.nextLine();

		Stack<Character> st = new Stack<Character>();
		// Stack<Character> st1= new Stack<Character> ();
		// System.out.println("Enter Strings");
		String[] str= new String[N];
		for (int i = 0; i < N; i++) {
			 str[i] = s.nextLine();
		}
			// System.out.println("zxcdvfd");
		for(int i=0;i<N;i++)
		{
			
		char a[] = str[i].toCharArray();
			int size = a.length;
			int flag = 0;
			 

			for (int j = 0; j < size; j++) {
                if(size%2!=0)
				{
					 flag=1;
				break;
				}
				if (a[j] == '(' || a[j] == '{' || a[j] == '[') {
					st.push(a[j]);
				} else if (a[j] == ')' || a[j] == '}' || a[j] == ']') {
					if (!st.isEmpty()) {
						char c = st.peek();
						if ((c == '(' && a[j] == ')') || (c == '{' && a[j] == '}') || (c == '[' && a[j] == ']'))
							// if (!st.isEmpty())
							st.pop();
					} else {
						flag = 1;
						break;
					}
				}
			}

			if (flag == 1 || !st.isEmpty()) {
				System.out.println("NO");
				st.clear();
			} else if (st.isEmpty() && flag == 0)

				System.out.println("YES");
		}
	}
}
