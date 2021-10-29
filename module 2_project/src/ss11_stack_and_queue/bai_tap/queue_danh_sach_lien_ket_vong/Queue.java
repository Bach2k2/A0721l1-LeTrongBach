package ss11_stack_and_queue.bai_tap.queue_danh_sach_lien_ket_vong;

public class Queue implements Solution{
        Node front;
        Node rear;

        public Queue() {
            front = null;
            rear = null;
        }

        private class Node {
            int data;
            Node link;

            public Node(int value) {
                this.data = value;
                this.link = null;
            }

        }

        @Override
        public void enQueue(int value) {
            Node temp = new Node(value);
            if (front == null)
                front = temp;
            else {
                rear.link=temp;
            }
            rear = temp;
            rear.link = front;
        }

        @Override
        public int deQueue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }

            int value;
            if (front == rear) {
                value = front.data;
                front = null;
                rear = null;
            } else {
                Node temp = front;
                value = temp.data;
                front = front.link;
                rear.link = front;
            }
            return value;
        }

        @Override
        public void displayQueue() {
            Node temp = front;
            System.out.print("\nElements in Circular Queue are: ");
            do{
                System.out.print(temp.data + "\t");
                temp = temp.link;
            } while (temp != front);

        }

    }
