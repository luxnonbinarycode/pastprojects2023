package ClassDirectory.Classes;//---------------------------------------------------------------------------
// ClassDirectory.Classes.LinkedCollection.java          by Dale/Joyce/Weems               Chapter 5
//
// Implements the ClassDirectory.Classes.CollectionInterface using a linked collection.
// Null elements are not allowed. Duplicate elements are allowed.
// One constructor is provided, one that creates an empty collection.
//---------------------------------------------------------------------------

/*
MaShayla Kendrick Assignment 4 project

This program adds to the LinkedCollection class. It adds
new methods.

 */



public class LinkedCollection<T> implements CollectionInterface<T>  
{
  protected LLNode<T> head;       // head of the linked list
  protected int numElements = 0;  // number of elements in this collection

  // set by find method
  protected boolean found;        // true if target found, else false
  protected LLNode<T> location;   // node containing target, if found
  protected LLNode<T> previous;   // node preceding location

  public LinkedCollection()
  {
    numElements = 0;
    head = null;
  }


  public boolean add(T element)
  // Adds element to this collection.
  {
    LLNode<T> newNode = new LLNode<T>(element);
    newNode.setLink(head);
    head = newNode;
    numElements++;
    return true;
  }

  protected void find(T target)
  // Searches the collection for an occurence of an element e such that
  // e.equals(target). If successful, sets instance variables
  // found to true, location to node containing e, and previous
  // to the node that links to location. If not successful, sets 
  // found to false.
  {
    location = head;
    found = false;

    while (location != null) 
    {
      if (location.getInfo().equals(target))  // if they match
      {
       found = true;
       return;
      }
      else
      {
        previous = location;
        location = location.getLink();
      }
    }
  }

  public int size()
  // Returns the number of elements on this collection. 
  {
    return numElements;
  }

  public boolean contains (T target)
  // Returns true if this collection contains an element e such that 
  // e.equals(target); otherwise, returns false.
  {
    find(target);
    return found;
  }

  public boolean remove (T target)
  // Removes an element e from this collection such that e.equals(target)
  // and returns true; if no such element exists, returns false.
  {
    find(target);
    if (found)
    {
      if (head == location)     
        head = head.getLink();    // remove first node
      else
        previous.setLink(location.getLink());  // remove node at location

      numElements--;
    }
    return found;
  }

  public T get(T target)
  // Returns an element e from this collection such that e.equals(target);
  // if no such element exists, returns null.
  {
    find(target);    
    if (found)
      return location.getInfo();
    else
      return null;
  }
    
  public boolean isEmpty()
  // Returns true if this collection is empty; otherwise, returns false.
  {
    return (numElements == 0);  
  }

  public boolean isFull()
  // Returns true if this collection is full; otherwise, returns false.
  {
    return false;  // Linked implementation is never full
  }

  // toString method to change linked collection to a string
  @Override
  public String toString() {
    location = head;
    String linkString = "";
    String locationString;

    if (numElements == 0) {
      return "";
    }
    else {
      for (int i = 0; i < numElements; i++) {
        locationString = (String)location.getInfo();
        linkString += locationString;
        linkString += " ";
        location = location.getLink();
      }
    }
    return linkString;
  }

  // count method
public int count(T target) {
    int targetCount = 0;
  location = head;

    for (int i = 0; i < numElements; i++) {

      if (location.getInfo().equals(target)) {
        targetCount++;
      }
      else {
        location = location.getLink();
      }
    }
    return targetCount;
}

// removeAll method
public void removeAll(T target) {
    location = head;

    for (int i = 0; i < numElements; i++) {
      if (location.getInfo().equals(target)) {
        remove(location.getInfo());
      }
      else {
        location = location.getLink();
      }
    }
  }
  public LinkedCollection<T> combine(LinkedCollection<T> other) {
    LinkedCollection<T> combinedCollection = new LinkedCollection<T>();

    LLNode<T> currentNode = this.head;
    while (currentNode != null) {
      combinedCollection.add(currentNode.getInfo());
      currentNode = currentNode.getLink();
    }

    currentNode = other.head;
    while (currentNode != null) {
      combinedCollection.add(currentNode.getInfo());
      currentNode = currentNode.getLink();
    }

    return combinedCollection;
  }



}
