package com.jy;

import java.util.Scanner;

public class FactoryMethodPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 运算符类型
		int operationType = 0;
		// 运算符
		String operationStr = null;

		// 获取第一个操作数
		System.out.print("请输入操作数A(A为double类型):");
		Double numA = scanner.nextDouble();

		// 获取第二个操作数
		System.out.print("请输入操作数B(B为double类型):");
		Double numB = scanner.nextDouble();

		// 获取运算符
		System.out.print("请输入操作数符号(1表示:+、2表示:-、3表示:*、4表示:/):");
		operationType = scanner.nextInt();

		IFactory ifactory = null;
		Operation operation = null;
		// 根据不同的运算符类型，选择不同的运算类型工厂类，并创建不同的运算类型
		switch (operationType) {
		case 1:
			operationStr = "+";
			ifactory = new AddFactory();
			operation = ifactory.CreateOperation();
			break;
		case 2:
			operationStr = "-";
			ifactory = new SubFactory();
			operation = ifactory.CreateOperation();
			break;
		case 3:
			operationStr = "*";
			ifactory = new MulFactory();
			operation = ifactory.CreateOperation();
			break;
		case 4:
			operationStr = "/";
			ifactory = new DivFactory();
			operation = ifactory.CreateOperation();
			break;
		default:

			break;
		}
		// 运算
		operation.mNumA = numA;
		operation.mNumB = numB;
		double result = operation.getResult();
		// 输出运算结果
		StringBuilder resultSB = new StringBuilder("计算结果: ");
		resultSB.append(numA + " ");
		resultSB.append(operationStr + " ");
		resultSB.append(numB + " ");
		resultSB.append("= ");
		resultSB.append(result);
		System.out.println(resultSB.toString());

		resultSB = null;
		scanner.close();
	}

}
