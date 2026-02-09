package com.mycompany.app.Programming;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ValidParentheses {

    public static void main(String args[]) {
        String s = "([[])";
        System.out.println(isValid(s));    
    }

    public static boolean isValid(String s) {
        Deque<String> parenthesesQueue = new LinkedList<>();
        int moduleOfSLength = s.length() % 2 ;
        if(moduleOfSLength == 1){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String sAtI = s.charAt(i) + "";
            if (sAtI.equals("[") || sAtI.equals("{") || sAtI.equals("(")){
                parenthesesQueue.addFirst(sAtI);         
            }
            try {
                String firstElement = parenthesesQueue.peekFirst();
                switch (sAtI) {
                    case ")":
                        if (firstElement.equals("(")) {
                            parenthesesQueue.pollFirst();
                            
                        } else {
                            return false;                        }
                        break;
                    case "]":
                        if (firstElement.equals("[")) {
                            parenthesesQueue.pollFirst();
                        } else {
                            return false;
                        }
                        break;
                    case "}":
                        if (firstElement.equals("{")) {
                            parenthesesQueue.pollFirst();
                        } else {
                            return false;
                        }
                    default:
                        break;
                }
            } catch (Exception e) {
                return false;
            }

        }
        return parenthesesQueue.size() == 0 ? true : false;
    }
}