package com.knoldus.linkedlist

import org.scalatest.funsuite.AnyFunSuite

class LinkedListTest extends AnyFunSuite{

  test("insert string") {
    val newLinkedList = new LinkedList[String]
    newLinkedList.insert("Sant")
    newLinkedList.insert("Tushar")
    newLinkedList.insert("Shivam")
    assert(newLinkedList.traverse() == List("Sant", "Tushar", "Shivam"))
  }

  test("delete string") {
    val newLinkedList = new LinkedList[String]
    newLinkedList.insert("Sant")
    newLinkedList.insert("Tushar")
    newLinkedList.insert("Shivam")
    newLinkedList.delete("Tushar")
    assert(newLinkedList.traverse() == List("Sant", "Shivam"))
  }

  test("traverse string") {
    val newLinkedList = new LinkedList[String]
    newLinkedList.insert("Sant")
    newLinkedList.insert("Tushar")
    newLinkedList.insert("Shivam")
    assert(newLinkedList.traverse() == List("Sant", "Tushar", "Shivam"))
  }

  test("search string") {
    val newLinkedList = new LinkedList[String]
    newLinkedList.insert("Sant")
    newLinkedList.insert("Tushar")
    newLinkedList.insert("Shivam")
    assert(newLinkedList.search("Tushar") == Some("Tushar"))
  }

  test("insert number") {
    val newLinkedList = new LinkedList[Int]
    newLinkedList.insert(45)
    newLinkedList.insert(65)
    newLinkedList.insert(75)
    assert(newLinkedList.traverse() == List(45,65,75))
  }

  test("delete number") {
    val newLinkedList = new LinkedList[Int]
    newLinkedList.insert(31)
    newLinkedList.insert(32)
    newLinkedList.insert(33)
    newLinkedList.delete(32)
    assert(newLinkedList.traverse() == List(31,33))
  }

  test("traverse number") {
    val newLinkedList = new LinkedList[Int]
    newLinkedList.insert(1000)
    newLinkedList.insert(2000)
    newLinkedList.insert(3000)
    assert(newLinkedList.traverse() == List(1000,2000,3000))
  }

  test("search number") {
    val newLinkedList = new LinkedList[Int]
    newLinkedList.insert(1)
    newLinkedList.insert(0)
    newLinkedList.insert(3)
    assert(newLinkedList.search(0) == Some(0))
  }

  test("insert double") {
    val newLinkedList = new LinkedList[Double]
    newLinkedList.insert(45.0)
    newLinkedList.insert(65.0)
    newLinkedList.insert(75.0)
    assert(newLinkedList.traverse() == List(45.0, 65.0, 75.0))
  }

  test("delete double") {
    val newLinkedList = new LinkedList[Double]
    newLinkedList.insert(31.0)
    newLinkedList.insert(32)
    newLinkedList.insert(33.0)
    newLinkedList.delete(32)
    assert(newLinkedList.traverse() == List(31.0, 33.0))
  }

  test("traverse double") {
    val newLinkedList = new LinkedList[Double]
    newLinkedList.insert(1000.1)
    newLinkedList.insert(2000.2)
    newLinkedList.insert(3000.3)
    assert(newLinkedList.traverse() == List(1000.1, 2000.2, 3000.3))
  }

  test("search double") {
    val newLinkedList = new LinkedList[Double]
    newLinkedList.insert(1.12)
    newLinkedList.insert(0)
    newLinkedList.insert(3.13)
    assert(newLinkedList.search(0) == Some(0))
  }

  test("insert long") {
    val newLinkedList = new LinkedList[Long]
    newLinkedList.insert(451234567)
    newLinkedList.insert(651234567)
    newLinkedList.insert(751234567)
    assert(newLinkedList.traverse() == List(451234567,651234567,751234567))
  }

  test("delete long") {
    val newLinkedList = new LinkedList[Long]
    newLinkedList.insert(317654321)
    newLinkedList.insert(327654321)
    newLinkedList.insert(337654321)
    newLinkedList.delete(327654321)
    assert(newLinkedList.traverse() == List(317654321, 337654321))
  }

  test("traverse long") {
    val newLinkedList = new LinkedList[Long]
    newLinkedList.insert(10000987)
    newLinkedList.insert(20000987)
    newLinkedList.insert(30000987)
    assert(newLinkedList.traverse() == List(10000987, 20000987, 30000987))
  }

  test("search long") {
    val newLinkedList = new LinkedList[Long]
    newLinkedList.insert(1454545)
    newLinkedList.insert(0)
    newLinkedList.insert(335454545)
    assert(newLinkedList.search(0) == Some(0))
  }

}