package com.jy;

import java.util.Scanner;

public class FactoryMethodPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// ���������
		int operationType = 0;
		// �����
		String operationStr = null;

		// ��ȡ��һ��������
		System.out.print("�����������A(AΪdouble����):");
		Double numA = scanner.nextDouble();

		// ��ȡ�ڶ���������
		System.out.print("�����������B(BΪdouble����):");
		Double numB = scanner.nextDouble();

		// ��ȡ�����
		System.out.print("���������������(1��ʾ:+��2��ʾ:-��3��ʾ:*��4��ʾ:/):");
		operationType = scanner.nextInt();

		IFactory ifactory = null;
		Operation operation = null;
		// ���ݲ�ͬ����������ͣ�ѡ��ͬ���������͹����࣬��������ͬ����������
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
		// ����
		operation.mNumA = numA;
		operation.mNumB = numB;
		double result = operation.getResult();
		// ���������
		StringBuilder resultSB = new StringBuilder("������: ");
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
