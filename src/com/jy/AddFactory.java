package com.jy;

public class AddFactory implements IFactory {

	@Override
	public Operation CreateOperation() {
		return new OperationAdd();
	}

}
