
class Coach {
    String id;
    String type;
    Coach next;

    Coach(String id, String type) {
        this.id = id;
        this.type = type;
        this.next = null;
    }
}

public class Train {
    private Coach head = new Coach("ENGINE", "ENGINE");
    private Coach tail = head;
    private int count = 0;

    public void attach(String id, String type) {
        if (position(id) != -1 || id.equals("ENGINE")) {
            System.out.println("Duplicate coach ID");
            return;
        }

        Coach newNode = new Coach(id, type);
        tail.next = newNode;
        tail = newNode;
        count++;
    }

    public boolean insertAfter(String afterId, String id, String type) {
        if (position(id) != -1 || id.equals("ENGINE")) {
            System.out.println("Duplicate coach ID");
            return false;
        }

        Coach temp = head;

        while (temp != null && !temp.id.equals(afterId))
            temp = temp.next;

        if (temp == null)
            return false;

        Coach newNode = new Coach(id, type);
        newNode.next = temp.next;
        temp.next = newNode;

        if (tail == temp)
            tail = newNode;

        count++;
        return true;
    }

    public boolean detach(String id) {
        if (id.equals("ENGINE"))
            return false;

        Coach prev = head;

        while (prev.next != null && !prev.next.id.equals(id))
            prev = prev.next;

        if (prev.next == null)
            return false;

        if (prev.next == tail)
            tail = prev;

        prev.next = prev.next.next;
        count--;
        return true;
    }

    public int position(String id) {
        Coach temp = head.next;
        int pos = 1;

        while (temp != null) {
            if (temp.id.equals(id))
                return pos;

            temp = temp.next;
            pos++;
        }
        return -1;
    }

    public int countType(String type) {
        int c = 0;
        Coach temp = head.next;

        while (temp != null) {
            if (temp.type.equalsIgnoreCase(type))
                c++;

            temp = temp.next;
        }
        return c;
    }

    public int totalCoaches() {
        return count;
    }

    public void display() {
        Coach temp = head;

        while (temp != null) {
            System.out.print(temp.id);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Train t = new Train();

        t.attach("S1", "SLEEPER");
        t.attach("S2", "SLEEPER");
        t.attach("S3", "SLEEPER");
        t.attach("GEN1", "GENERAL");

        t.insertAfter("S2", "PC", "PANTRY");
        t.detach("S3");

        System.out.print("display() -> ");
        t.display();

        System.out.println("countType(SLEEPER) -> "
                + t.countType("SLEEPER"));

        System.out.println("position(PC) -> Coach PC is at position "
                + t.position("PC") + " from the engine");

        System.out.println("totalCoaches() -> " + t.totalCoaches());
    }
}
