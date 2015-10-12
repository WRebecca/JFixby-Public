package com.jfixby.cmns.api.collections;


public interface StateSwitcher<T> {

	void expectState(T expected_state);

	void switchState(T next_state);

	T currentState();

	void setDebugName(String string);

	void setDebugFlag(boolean b);

}
