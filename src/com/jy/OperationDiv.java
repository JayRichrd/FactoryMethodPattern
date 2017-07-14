package com.jy;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		if (0 == mNumB) {
			try {
				throw new Exception("除数不能为0!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		result = mNumA / mNumB;
		return result;
	}

}
