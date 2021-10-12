package com.docsdk.upload;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 16进制字符串转为62进制字符串 缩短token 与URL
 */
public class Base62Util {

	/** BigDecimal 的62的值，用于除法计算 */
	private static BigDecimal VALUE_62 = new BigDecimal(62);

	/** 62进制数组 */
	private static char[] BASE_62_ENCODE_CHARS = new char[] { 'A', 'B', 'C',
			'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
			'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2',
			'3', '4', '5', '6', '7', '8', '9' };

	/** 将单个字符由16进制转为10进制 */
	public static int getValue(char value) {
		int returnValue = 0;
		switch (value) {
		case 'a':
			returnValue = 10;
			break;
		case 'b':
			returnValue = 11;
			break;
		case 'c':
			returnValue = 12;
			break;
		case 'd':
			returnValue = 13;
			break;
		case 'e':
			returnValue = 14;
			break;
		case 'f':
			returnValue = 15;
			break;
		default:
			returnValue = (int) value - 48;
		}
		return returnValue;
	}

	/** 对BigDecimal 求方 */
	public static BigDecimal getPower(int n) {
		BigDecimal value = new BigDecimal(1);
		BigDecimal multiple = new BigDecimal(16);
		if (n == 0) {
			return value;
		} else {
			return multiple.multiply(getPower(n - 1));
		}
	}

	/** 计算token的10进制 */
	public static BigDecimal calc10Value(String valueStr) {
		BigDecimal value = new BigDecimal(0);
		valueStr = valueStr.replaceAll("\\-", "");
		char[] valueArray = valueStr.toCharArray();

		for (int i = valueArray.length - 1; i >= 0; i--) {
			BigDecimal temp = new BigDecimal(Base62Util.getValue(valueArray[i]));
			int n = valueArray.length - 1 - i;
			value = value.add(temp.multiply(Base62Util.getPower(n)));
		}
		return value;
	}

	/** 16进制字符串并转换为62进制 */
	public static String convertTo62(String valueStr) {
		valueStr = valueStr.toLowerCase();
		BigDecimal value = Base62Util.calc10Value(valueStr);

		// System.out.println("value："+value);
		String result = "";

		// 转换为62进制
		while (value.compareTo(Base62Util.VALUE_62) >= 0) {
			BigDecimal temp = value.remainder(Base62Util.VALUE_62);
			int intTemp = temp.intValue();

			// System.out.println("余数："+temp +"   "+base62EncodeChars[intTemp]);
			result = BASE_62_ENCODE_CHARS[intTemp] + result;

			// 不进位
			value = value.divide(Base62Util.VALUE_62, RoundingMode.FLOOR);
		}
		int intTemp = value.intValue();
		result = BASE_62_ENCODE_CHARS[intTemp] + result;

		// System.out.println("余数："+value);
		return result;
	}

	public static void main(String[] args) throws InterruptedException {
		long a = System.currentTimeMillis();
		String str = "3D";
		String temp = Base62Util.convertTo62(str);
		System.out.println("base62: " + temp);

	}
}
