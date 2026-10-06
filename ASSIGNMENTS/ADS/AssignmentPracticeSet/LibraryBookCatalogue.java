
class BookNode {
    int id;
    String title;
    BookNode left, right;

    BookNode(int id, String title) {
        this.id = id;
        this.title = title;
        left = right = null;
    }
}

public class LibraryBookCatalogue {
    BookNode root;

    void insert(int id, String title) {
        root = insertBook(root, id, title);
    }

    BookNode insertBook(BookNode node, int id, String title) {
        if (node == null)
            return new BookNode(id, title);

        if (id < node.id)
            node.left = insertBook(node.left, id, title);
        else if (id > node.id)
            node.right = insertBook(node.right, id, title);
        else
            System.out.println("Duplicate Book ID");

        return node;
    }

    void inorder(BookNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.id + " ");
            inorder(node.right);
        }
    }

    void preorder(BookNode node) {
        if (node != null) {
            System.out.print(node.id + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(BookNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.id + " ");
        }
    }

    void search(int id) {
        BookNode current = root;
        String path = "";

        while (current != null) {
            if (!path.isEmpty())
                path += " -> ";
            path += current.id;

            if (current.id == id) {
                System.out.println("Found. Path: " + path);
                return;
            }

            if (id < current.id)
                current = current.left;
            else
                current = current.right;
        }

        System.out.println("Not found. Path: " + path + " -> (no matching child)");
    }

    int count(BookNode node) {
        if (node == null)
            return 0;
        return 1 + count(node.left) + count(node.right);
    }

    int height(BookNode node) {
        if (node == null)
            return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    int min(BookNode node) {
        while (node.left != null)
            node = node.left;
        return node.id;
    }

    int max(BookNode node) {
        while (node.right != null)
            node = node.right;
        return node.id;
    }

    void levelOrder() {
        if (root == null)
            return;

        BookNode[] queue = new BookNode[count(root)];
        int front = 0, rear = 0;
        queue[rear++] = root;

        while (front < rear) {
            BookNode current = queue[front++];
            System.out.print(current.id + " ");

            if (current.left != null)
                queue[rear++] = current.left;
            if (current.right != null)
                queue[rear++] = current.right;
        }
    }

    public static void main(String[] args) {
        LibraryBookCatalogue b = new LibraryBookCatalogue();

        int[] ids = {105, 62, 148, 40, 87, 120, 173, 95};
        for (int id : ids)
            b.insert(id, "Book" + id);

        System.out.print("Inorder: ");
        b.inorder(b.root);

        System.out.print("\nPreorder: ");
        b.preorder(b.root);

        System.out.print("\nPostorder: ");
        b.postorder(b.root);

        System.out.print("\nLevel order: ");
        b.levelOrder();

        System.out.print("\nSearch 95: ");
        b.search(95);

        System.out.print("Search 100: ");
        b.search(100);

        System.out.println("Minimum ID: " + b.min(b.root));
        System.out.println("Maximum ID: " + b.max(b.root));
        System.out.println("Total books: " + b.count(b.root));
        System.out.println("Height: " + b.height(b.root));
    }
}
