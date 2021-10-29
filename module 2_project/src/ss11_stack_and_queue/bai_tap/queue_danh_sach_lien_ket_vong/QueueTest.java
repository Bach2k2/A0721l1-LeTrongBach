package ss11_stack_and_queue.bai_tap.queue_danh_sach_lien_ket_vong;

public class QueueTest {
    public static void main(String[] args) {
        Queue numQueue=new Queue();
        numQueue.enQueue(14);
        numQueue.enQueue(22);
        numQueue.enQueue(6);
        numQueue.displayQueue();

        System.out.println("\nDelete value: " + numQueue.deQueue());
        System.out.println("Delete value: " + numQueue.deQueue());
        numQueue.displayQueue();

        numQueue.enQueue(9);
        numQueue.enQueue(20);
        numQueue.displayQueue();
    }
}
