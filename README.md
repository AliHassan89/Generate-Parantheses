# Generate-Parantheses
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]

# Solution:

1. An integer is received as function parameter.

2. The return type is List of strings containing valid parentheses.

3. A recursive function will be called passing in following parameters
	* result list of strings
	* A string called parans, in the first call the string will be empty
	* integer - number of open parentheses
	* integer - number of close parentheses
	* and value of n which is passed in as function parameter.
	
generateParenthesisHelper(result, "", 0, 0, n);
void generateParenthesisHelper(List<String> result, String parans, int open, int close, int max)

4. In the recursive function the base case is that if the length of parans string is equal to length of max*2 then we will add parans string into our result arrays

5. Otherwise it is checked if value of open is less than max then call the function recursively adding 1 to open and appending one open parentheses to parans string
generateParenthesisHelper(result, parans+"(", open+1, close, max);

6. Same will be the case with close that if value of close is less than max then call the function recursively add 1 to close and appending one close parentheses to parans string
generateParenthesisHelper(result, parans+")", open, close+1, max);

```
Time Complexity = O(2^n)
space complexity = O(n)
```
