public class Main {

    private static PriorityQueue<Integer> pq;

    public static void main(String[] args) {

        pq = new PriorityQueue<>();

        pq.add(1,1);
        pq.add(2,2);
        pq.add(10,10);
        pq.add(7,7);

        System.out.println(pq.get());
        System.out.println(pq.get());
        System.out.println(pq.get());
        System.out.println(pq.get());
        System.out.println(pq.get());
    }
}
