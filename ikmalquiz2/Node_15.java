package ikmalquiz2;

public class Node_15 {
    Node_15 prev, next;
    Pembeli buyer;
    Pesanan order;


    Node_15(Node_15 prev, Pembeli buyer, Pesanan order, Node_15 next) {
        this.prev = prev;
        this.buyer = buyer;
        this.order = order;
        this.next = next;
    }
}
