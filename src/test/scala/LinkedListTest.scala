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
}