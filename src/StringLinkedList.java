public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {

        if (first.next == null) {
            Node nodeFirst = new Node();
            nodeFirst.value = value;
            first.next = nodeFirst;
            last.prev = first.next;
            return;
        }

        Node nodeSecond = new Node();
        nodeSecond.value = value;
        Node lastNode = last.prev;
        lastNode.next = nodeSecond;
        nodeSecond.prev = lastNode;
        last.prev = nodeSecond;
    }

    public String get(int index) {
        int i = index + 1;
        String Index = Integer.toString(i);
        Node node = first.next;

        if (Index.equals(node.value)) {
            return node.value;
        } else {
            while (!Index.equals(node.value)) {
                if (node.next == null) {
                    return null;
                }
                node = node.next;
            }
            return node.value;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}

