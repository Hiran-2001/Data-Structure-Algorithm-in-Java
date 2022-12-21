
class Array {
    private int[] items;
    int count;

    public Array(int length) {
        items = new int[length];
    }

    // array insertion 

   public void insert(int item){
   if (items.length == count) {
    int [] newItems = new int[count * 2];
    for (int i = 0; i < count; i++) {
        newItems[i] = items[i];
    }
    items = newItems;
   }
   items[count++] = item;
   }

   //array print 

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}