package com.xujunqi.common.utils.test;

import java.util.List;

import org.junit.Test;

import com.xujunqi.common.utils.FileUtil;

public class DateUtilTest {

	@Test
	public void test() {
		List<String> readTextFileOfList = FileUtil.readTextFileOfList("C:\\Users\\Administrator\\Desktop\\pom.xml");
		System.out.println(readTextFileOfList);
	}
}
