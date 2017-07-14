package com.jy;

public class OperationSub extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = mNumA - mNumB;
		return result;
	}

}
