
class Job {
    String id, owner;
    int pages;

    Job(String id, String owner, int pages) {
        this.id = id;
        this.owner = owner;
        this.pages = pages;
    }
}

class Node {
    Job job;
    Node next;

    Node(Job j) {
        job = j;
        next = null;
    }
}

public class PrintQueue {
    private Node front, rear;
    private int size;

    public void enqueue(Job j) {
        Node newNode = new Node(j);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Job dequeue() {
        if (front == null)
            return null;

        Job j = front.job;
        front = front.next;

        if (front == null)
            rear = null;

        size--;
        return j;
    }

    public Job peek() {
        if (front == null)
            return null;
        return front.job;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public boolean cancel(String id) {
        if (front == null)
            return false;

        if (front.job.id.equals(id)) {
            dequeue();
            return true;
        }

        Node temp = front;

        while (temp.next != null) {
            if (temp.next.job.id.equals(id)) {
                if (temp.next == rear)
                    rear = temp;

                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void printSchedule() {
        Node temp = front;
        int time = 0;

        while (temp != null) {
            time += temp.job.pages * 6;
            System.out.println(temp.job.id + " finishes at " + time + " s");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        PrintQueue q = new PrintQueue();

        q.enqueue(new Job("J1", "Ravi", 25));
        q.enqueue(new Job("J2", "Asha", 10));
        q.enqueue(new Job("J3", "Karan", 5));

        System.out.println("Schedule without cancellation:");
        q.printSchedule();

        q.cancel("J2");

        System.out.println("After canceling J2:");
        q.printSchedule();
    }
}
