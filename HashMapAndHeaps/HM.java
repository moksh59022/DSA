package HashMapAndHeaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class HM {
    public static class HashMap<K, V> {

        // Node class to store key-value pairs
        private class HMNode {
            K key;
            V value;

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // total number of key-value pairs
        private LinkedList<HMNode>[] buckets; // array of LinkedLists (chaining)

        // Constructor to initialize with default bucket size = 4
        public HashMap() {
            initbuckets(4);
            size = 0;
        }

        // Initialize buckets array with N empty linked lists
        @SuppressWarnings("unchecked")
        private void initbuckets(int N) {
            buckets = new LinkedList[N];
            for (int bi = 0; bi < N; bi++) {
                buckets[bi] = new LinkedList<>();
            }
        }

        // Insert or update a key-value pair
        public void put(K key, V value) {
            int bi = hashfn(key); // bucket index
            int di = getIndexWithinBucket(key, bi); // data index in bucket

            if (di != -1) {
                // Key already exists → update value
                HMNode node = buckets[bi].get(di);
                node.value = value;
            } else {
                // Key not found → insert new node
                HMNode node = new HMNode(key, value);
                buckets[bi].add(node);
                size++;
            }

            // Check load factor and rehash if needed
            double lambda = size * 1.0 / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // Rehash: double bucket size and reinsert old data
        private void rehash() {
            LinkedList<HMNode>[] oldBuckets = buckets;

            initbuckets(oldBuckets.length * 2);
            size = 0; // will be updated in put()

            for (LinkedList<HMNode> bucket : oldBuckets) {
                for (HMNode node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        // Check if key exists
        public boolean containsKey(K key) {
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi);
            return di != -1;
        }

        // Get value for a key
        public V get(K key) {
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi);

            if (di != -1) {
                HMNode node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        // Remove a key-value pair
        public V remove(K key) {
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key, bi);

            if (di != -1) {
                HMNode node = buckets[bi].remove(di); // FIXED: remove correct index
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        // Get list of all keys
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<HMNode> bucket : buckets) {
                for (HMNode node : bucket) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // Get total number of key-value pairs
        public int size() {
            return size;
        }

        // Find index of key in a bucket (if exists)
        private int getIndexWithinBucket(K key, int bi) {
            int di = 0;
            for (HMNode node : buckets[bi]) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1; // key not found
        }

        // Hash function → returns bucket index
        private int hashfn(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }
    }
}
