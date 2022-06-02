package com.example.demo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticOperationTest {
@Test
void test_Add() {
	assertEquals(10, ArithmeticOperation.add(7, 3),"Adition of two numbers: ");
}

@Test
void test_Sub() {
	assertEquals(20, ArithmeticOperation.sub(50, 30),"Subtraction of two numbers: ");
}

@Test
void test_Mul() {
	assertEquals(30, ArithmeticOperation.mul(15, 2));
}

@Test
void test_Div() {
	assertEquals(5, ArithmeticOperation.div(25, 5));
}

@Test
void test_Even1() {
	assertTrue(ArithmeticOperation.even1(2));
}

@Test
void test_Prime() {
	assertTrue(ArithmeticOperation.isPrime(13));
}
}
