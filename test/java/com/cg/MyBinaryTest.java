package com.cg;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTest {

	@Test
	public void given3NumbersWhenAddedToBinaryShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}
