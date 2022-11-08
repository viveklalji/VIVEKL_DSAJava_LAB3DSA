package com.greatlearning.service;

import java.util.Stack;

public class BalalncedBrackets {
	public boolean isbalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char s = expression.charAt(i);
			if (s == '(' || s == '{' || s == '[') {
				stack.push(s);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char element;
			switch (s) {
			case ')':
				element = stack.pop();
				if (element == '{' || element == '[') {
					return false;
				}
				break;
			case ']':
				element = stack.pop();
				if (element == '(' || element == '{') {
					return false;
				}
				break;
			case '}':
				element = stack.pop();
				if (element == '(' || element == '[') {
					return false;
				}
				break;
			}
		}
		return (stack.isEmpty());

	}

}
