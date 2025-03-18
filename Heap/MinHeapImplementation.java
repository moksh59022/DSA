package Heap;
class MinHeap{
  private int[] arr;
   private int size;

    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num) throws Exception{
        if(size== arr.length){
            throw new Exception("Heap is full");
        }
        arr[size++] = num;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if (idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int peek() throws Exception{
        if (size==0) {
            throw new Exception("Heap is empty");
        }
        return arr[0];
    }
    public int size(){
        return size;
    }
    public int remove() throws Exception{
        if(size==0) throw new Exception("Heap is Empty");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }

    public void downHeapify(int i){
        if (i>=size-1) return;
        int lc = 2*i+1,rc = 2*i+2;
        int minIdx = i;
        if(lc<size && arr[lc]<arr[minIdx]) minIdx = lc;
        if (rc<size && arr[rc]<arr[minIdx]) minIdx = rc;
        if (i==minIdx) return;
        swap(i,minIdx);
        downHeapify(minIdx);
    }
}
public class MinHeapImplementation {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);
         pq.add(10);
         pq.add(1);
         pq.add(6);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

    }
}
