class RandomizedSet {

    // public RandomizedSet() {
        
    // }
    
    // public boolean insert(int val) {
        
    // }
    
    // public boolean remove(int val) {
        
    // }
    
    // public int getRandom() {
        
    // }

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1); // Store index of val in list
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Swap the element to be removed with the last element
        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove); // Update index of the swapped element

        list.remove(list.size() - 1); // Remove the last element (which was originally the element to remove)
        map.remove(val); // Remove the entry from the map
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */