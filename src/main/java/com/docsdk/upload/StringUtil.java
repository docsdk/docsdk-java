package com.docsdk.upload;

import java.util.HashSet;
import java.util.Set;

/**
 * Utility class for String.
 */
public class StringUtil {

	public static String escape(String input) {
		String str = input;

		str = str.replace("\\", "\\\\"); //$NON-NLS-1$ //$NON-NLS-2$
		str = str.replace("\r", "\\r"); //$NON-NLS-1$ //$NON-NLS-2$
		str = str.replace("\n", "\\n"); //$NON-NLS-1$ //$NON-NLS-2$
		str = str.replace("\t", "\\t"); //$NON-NLS-1$ //$NON-NLS-2$
		str = str.replace("\"", "\\\""); //$NON-NLS-1$ //$NON-NLS-2$
		return str;
	}

	public static String quoteString(String input) {
		return "\"" + escape(input) + "\"";
	}

	public static String getFileName(String text) {
		return getFileName(text, true);
	}

	public static String getFileName(String text, boolean trim) {
		if (text == null || text.length() <= 0) {
			return null;
		}

		String baseName = text;

		if (trim) {
			baseName = getBaseName(baseName);
		}

		baseName = baseName.replace("\\", " "); //$NON-NLS-1$ //$NON-NLS-2$
		baseName = baseName.replace("\r", " "); //$NON-NLS-1$ //$NON-NLS-2$
		baseName = baseName.replace("\n", " "); //$NON-NLS-1$ //$NON-NLS-2$
		baseName = baseName.replace("\t", " "); //$NON-NLS-1$ //$NON-NLS-2$
		baseName = baseName.replace("\"", "'"); //$NON-NLS-1$ //$NON-NLS-2$

		char[] fileName = new char[baseName.length()];

		for (int i = 0; i < baseName.length(); i++) {
			char c = baseName.charAt(i);

			// char is from 0-127
			if (c < 0x00 || c >= 0x80) {
				if (!isLegalChar(c)) {
					c = ' ';
				}
			}
			fileName[i] = c;
		}
		return new String(fileName);
	}

	private static String getBaseName(String title) {
		String fileName = title;

		if (fileName != null) {
			String[] titles = fileName.split("\\/");

			fileName = titles[titles.length - 1];
			titles = fileName.split("\\\\");
			fileName = titles[titles.length - 1];

			int pos = fileName.lastIndexOf('.');

			if (pos >= 0) {
				fileName = fileName.substring(0, pos);
			}
			fileName.trim();
			if (fileName.indexOf("Microsoft Word - ") == 0) {
				fileName = fileName.replace("Microsoft Word - ", "");
			} else if (fileName.indexOf("Microsoft Excel - ") == 0) {
				fileName = fileName.replace("Microsoft Excel - ", "");
			} else if (fileName.indexOf("Microsoft PowerPoint - ") == 0) {
				fileName = fileName.replace("Microsoft PowerPoint - ", "");
			}
		}
		return fileName;
	}

	public static boolean isLegalChar(char c) {

		Set<Character.UnicodeBlock> languageUnicodeBlocks = new HashSet<Character.UnicodeBlock>() {
			private static final long serialVersionUID = -7490724106310028018L;

			{
				add(Character.UnicodeBlock.CJK_COMPATIBILITY);
				add(Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS);
				add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
				add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
				add(Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT);
				add(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
				add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
				add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
				add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B);
				add(Character.UnicodeBlock.KANGXI_RADICALS);
				add(Character.UnicodeBlock.IDEOGRAPHIC_DESCRIPTION_CHARACTERS);
				add(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
				add(Character.UnicodeBlock.LATIN_EXTENDED_A);
				add(Character.UnicodeBlock.HIRAGANA);
				add(Character.UnicodeBlock.KATAKANA);
			}
		};

		if (languageUnicodeBlocks.contains(Character.UnicodeBlock.of(c))) {
			return true;
		}
		return false;
	}

	public static boolean isGarbled(String str) {
		if (str != null) {
			int originalLength = str.length();
			String newStr = str.replace("/(['\u3400'-'\u4DBF'])/g", "");
			int newLength = newStr.length();

			if (newLength < originalLength) {
				return true;
			}
		}
		return false;
	}
}
