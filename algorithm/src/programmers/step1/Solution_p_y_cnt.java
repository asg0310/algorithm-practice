package programmers.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_p_y_cnt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
        	if ('p' == s.charAt(i) || 'P' == s.charAt(i)) {
        		cnt++;
        	} else if ('y' == s.charAt(i) || 'Y' == s.charAt(i)) {
        		cnt--;
        	}
		}
        return cnt == 0 ? true : false;
    }

}
