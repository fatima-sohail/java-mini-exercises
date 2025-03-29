package hashSet;

public class DesignHashSet {
    class MyHashSet {

        private int [] buckets;
        private int nBuckets = 1000000+1;

        public MyHashSet() {
            buckets = new int[nBuckets];
            for(int i = 0; i < nBuckets; i++) {
                buckets[i] = -1;
            }
        }

        public void add(int key) {
            int index = hash(key);
            buckets[index] = key;
        }

        public void remove(int key) {
            int index = hash(key);
            buckets[index] = -1;
        }

        public boolean contains(int key) {
            int index = hash(key);
            if(buckets[index] == -1) {
                return false;
            } else {
                return true;
            }
        }

        private int hash(int val) {
            return val % nBuckets;
        }

    }

}
