package hashMap;

import java.util.ArrayList;

public class Map<K,V> {
		private ArrayList<MapNode<K,V>> buckets;
		private int size;
		private int numBucket;
		public Map() {
			buckets=new ArrayList<>();
			numBucket=5;
			for (int i = 0; i < numBucket; i++) {
				buckets.add(null);
			}
		}
		public void insert(K key,V value) {
			int bucketIndex=getBucketIndex(key);
			MapNode<K,V> head=buckets.get(bucketIndex);
			while(head!=null) {
				if(head.key.equals(key)) {
					head.value=value;
					return;
				}
				head=head.next;
			}
			MapNode<K,V> newEntryNode=new MapNode<>(key,value);
			newEntryNode.next=head;
			buckets.set(bucketIndex, newEntryNode);
			
		}
		public V getValue(K key) {
			int bucketIndex=getBucketIndex(key);
			MapNode<K,V> head=buckets.get(bucketIndex);
			while(head!=null) {
				if(head.key.equals(key)) {
					
					return head.value;
				}
				head=head.next;
			}
			return null;
		}
		public V deleteKey(K key) {
			int bucketIndex=getBucketIndex(key);
			MapNode<K,V> head=buckets.get(bucketIndex);
			MapNode<K,V> prev=null;
			while (head != null) {
				if (head.key.equals(key)) {
					size--;
					if (prev == null) {
						buckets.set(bucketIndex, head.next);
					} else {
						prev.next = head.next;
					}
					return head.value;
				}
				prev = head;
				head = head.next;
			}
			return null;
			}
		private int getBucketIndex(K key) {
			int hashCode=key.hashCode();
			return hashCode%numBucket;
		}
}
