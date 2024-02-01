

public class Snippet {
	You are given two strings of equal length S and T with only lowercase Latin
	letters are included. Let us denote the length by n. You can do the following 3 operations as many times as you like
	How many times do you want and in what order?
	* Select i (0 <= i < n) and swap the symbols S[i] and T[i].
	* Select i (0 <= i < n) and swap the symbols S[i] and S[n-i-1]
	* Select i (0 <= i < n) and swap characters T[i] and T[n-i-1] with S[i]
	The character at the i-th index of the string S is indicated. If you can with these operations
	If you get two identical strings, then such strings are called similar. Your task is
	Write a same method that is passed two strings and returns true if
	These strings are similar, and false if they are not. for example:
	same(“bla”, “blu”) -> false
	same(“abca”, “dbcd”) -> true
	same(“pcabb”, “bbacp”) -> true
	Write the solution in the same.java file
}