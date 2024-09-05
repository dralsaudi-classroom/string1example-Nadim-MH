package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
    boolean flag = false;
    if(s.lenght() != str.lenght())
	    return flag;
    else{   
	    for(int i = 0; i<length(); i++){
		    if(s.getChar[i] == str.getChar[i])
			    flag =true;
		    else{
			    flag = false;
			    break;
		    }
		 }   
	     } 
	    return flag;
    }
    public void reverse() {
           int left = 0;
	int right = length() - 1;
	    
	while(left < right){
		
		char tmp = str[left];
		str[left] = str[right];
		str[right] = tmp;

		left--;
		right++;
		
    }
    }
}
