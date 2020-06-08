import java.util.Scanner;

public class MyAnimalQueue<T> {
    public static class AnimalQueueNode<T> {
        public T data;
        public String animalType;
        public AnimalQueueNode<T> next;

        public AnimalQueueNode(T data, String animalType) {
            this.data = data;
            this.animalType = animalType;
        }
    }

    public AnimalQueueNode<T> first;
    public AnimalQueueNode<T> last;
    public AnimalQueueNode<T> firstCat;
    public AnimalQueueNode<T> firstDog;
    public AnimalQueueNode<T> lastDog;
    public AnimalQueueNode<T> lastCat;

    public void add(T item, String animalType) {
        AnimalQueueNode<T> newNode = new AnimalQueueNode<T>(item, animalType);
        if (last != null) {
            last.next = newNode;
        }
        last = newNode;
        if (first == null) {
            first = last;
        }

        if (animalType.equals("Dog")) {
            if (firstDog == null) {
                firstDog = newNode;
            } else {
                newNode.next = firstDog;
                firstDog = newNode;
            }
        }
        if (animalType.equals("Cat")) {
            if (firstCat == null) {
                firstCat = newNode;
            } else {
                newNode.next = firstCat;
                firstCat = newNode;
            }
        }
    }

    public T remove() throws Exception {
        if (first == null) {
            throw new Exception();
        }

        T item = first.data;
        first = first.next;

        if (first == null) {
            last = null;
        }

        if (item.animalType.equals("Dog")) {
            firstDog = firstDog.next;
        }
        if (item.animalType.equals("Cat")) {
            firstCat = firstCat.next;
        }

        return item;
    }

    public T removeDog() throws Exception {
        if (firstDog == null) {
            throw new Exception();
        }

        T item = firstDog.data;
        firstDog = firstDog.next;

        if (firstDog == null) {
            lastDog = null;
        }

        AnimalQueueNode node = first;
        if (first.animalType.equals("Dog")) {
            first = first.next;
        } else {
            AnimalQueueNode prev = node;
            node = node.next;
            while (node != null) {
                if (node.animalType.equals("Dog")) {
                    prev.next = node.next;
                    break;
                }
                prev = node;
                node = node.next;
            }
        }
        return item;
    }

    public T removeCat() throws Exception {
        if (firstCat == null) {
            throw new Exception();
        }

        T item = firstCat.data;
        firstCat = firstCat.next;

        if (firstCat == null) {
            firstCat = null;
        }

        AnimalQueueNode node = first;
        if (first.animalType.equals("Cat")) {
            first = first.next;
        } else {
            AnimalQueueNode prev = node;
            node = node.next;
            while (node != null) {
                if (node.animalType.equals("Cat")) {
                    prev.next = node.next;
                    break;
                }
                prev = node;
                node = node.next;
            }
        }
        return item;
    }


    public T peek() throws Exception {
        if (first == null) {
            throw new Exception();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}

public class QueueAnimalShelter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyAnimalQueue<Integer> mq = new MyAnimalQueue<Integer>();
        try {
            System.out.println("1.Add \n2.Remove \n3.Remove Dog \n4.Remove Cat.\n5. Quit");
            int choice = scan.nextInt();
            while (choice != 5) {
                switch (choice) {
                    case 1:
                        System.out.println("Enter data and animal type");
                        int num = scan.nextInt();
                        String type = scan.next();

                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void display(AnimalQueueNode first) {
        AnimalQueueNode curr = first;
        while (curr != null) {
            System.out.println(curr.data + ":" + curr.animalType + "   ");
        }
        System.out.println();
    }
}