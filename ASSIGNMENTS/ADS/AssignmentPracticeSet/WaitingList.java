
class Patient {
    String name;
    Patient prev, next;

    Patient(String name) {
        this.name = name;
    }
}

public class WaitingList {
    private Patient head, tail;
    private int size;

    public void addNormal(String name) {
        Patient p = new Patient(name);

        if (head == null) {
            head = tail = p;
        } else {
            tail.next = p;
            p.prev = tail;
            tail = p;
        }
        size++;
    }

    public void addEmergency(String name) {
        Patient p = new Patient(name);

        if (head == null) {
            head = tail = p;
        } else {
            p.next = head;
            head.prev = p;
            head = p;
        }
        size++;
    }

    public String callNext() {
        if (head == null)
            return null;

        String name = head.name;
        head = head.next;

        if (head == null)
            tail = null;
        else
            head.prev = null;

        size--;
        return name;
    }

    public boolean leave(String name) {
        Patient temp = head;

        while (temp != null && !temp.name.equals(name))
            temp = temp.next;

        if (temp == null)
            return false;

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
        else
            tail = temp.prev;

        size--;
        return true;
    }

    public void display() {
        Patient temp = head;

        while (temp != null) {
            System.out.print(temp.name);
            if (temp.next != null)
                System.out.print(", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        Patient temp = tail;

        while (temp != null) {
            System.out.print(temp.name);
            if (temp.prev != null)
                System.out.print(", ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public int waiting() {
        return size;
    }

    public static void main(String[] args) {
        WaitingList w = new WaitingList();

        w.addNormal("R");
        w.addNormal("S");
        w.addEmergency("T");
        w.addNormal("U");

        System.out.println("Call next: " + w.callNext()
                + ", please go to the doctor");

        w.leave("S");
        w.addEmergency("V");

        System.out.print("display() -> ");
        w.display();

        System.out.print("displayReverse() -> ");
        w.displayReverse();

        System.out.println("waiting() -> " + w.waiting());
    }
}
