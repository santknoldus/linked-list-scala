package com.knoldus.linkedlist

import scala.annotation.tailrec

class Node[T](val data: T, var next: Node[T])

class LinkedList[T] {
  private var head: Node[T] = null

  def insert(data: T): Unit = {
    @tailrec
    def inserting(node: Node[T]): Unit = {
      if (node.next == null) {
        node.next = new Node[T](data, null)
      } else {
        inserting(node.next)
      }
    }

    if (head == null) {
      head = new Node(data, null)
    } else {
      inserting(head)
    }
  }

  def delete(data: T): Unit = {
    @tailrec
    def deleting(node: Node[T], prev: Option[Node[T]]): Unit = {
      node match {
        case null => ()
        case _ if node.data == data =>
          prev match {
            case None => head = node.next
            case Some(p) => p.next = node.next
          }
        case _ => deleting(node.next, Some(node))
      }
    }

    deleting(head, None)
  }

  def traverse(): List[T] = {
    @tailrec
    def helper(node: Node[T], accumulator: List[T]): List[T] = {
      if (node == null) {
        accumulator
      } else helper(node.next, node.data :: accumulator)
    }

    helper(head, Nil).reverse
  }

  def search(data: T): Option[T] = {
    @tailrec
    def searching(node: Node[T]): Option[T] = {
      if (node == null) {
        None
      } else if (node.data == data) {
        Some(node.data)
      } else {
        searching(node.next)
      }
    }

    searching(head)
  }
}