/**

 Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]

 */

package main.java;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {

  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();

    if (n == 0)
      return result;

    generateParenthesisHelper(result, "", 0, 0, n);
    return result;
  }

  private void generateParenthesisHelper(List<String> result, String parans, int open, int close, int max){
    if (parans.length() == max * 2){
      result.add(parans);
      return;
    }

    if (open < max)
      generateParenthesisHelper(result, parans+"(", open+1, close, max);
    if (close < open)
      generateParenthesisHelper(result, parans+")", open, close+1, max);
  }

}
