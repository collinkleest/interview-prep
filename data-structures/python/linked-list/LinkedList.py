
class Node(object):
    def __init__(self, data=None, next=None):
        self.data = data
        self.next = None

    def getData(self):
        return self.data

    def getNext(self):
        return self.data

    def setData(self, d):
        self.data = d

    def setNext(self, n):
        self.next = n


class LinkedList(object):

    def __init__(self, head=None):
        self.head = head

    def insert(self, data):
        new_element = Node(data)
        if (self.head == None):
            self.head = new_element
        else:
            last = self.head
            while (last.next != None):
                last = last.next

            last.next = new_element

    def size(self):
        count = 0
        if self.head == None:
            return 0
        else:
            trav = self.head
            count = 1
            while (trav.next != None):
                count += 1
                trav = trav.next
        return count

    def printLinkedList(self):
        printString = ""
        if (self.head == None):
            printString += "List is empty"
        else:
            trav = self.head
            printString += str(trav.data)
            while (trav.next != None):
                trav = trav.next
                printString += ", " + str(trav.data)
        print(printString)


if __name__ == "__main__":
    headElement = Node(3)
    linkedList = LinkedList(headElement)
    linkedList.insert(5)
    linkedList.insert(6)
    linkedList.printLinkedList()
    print(linkedList.size())
