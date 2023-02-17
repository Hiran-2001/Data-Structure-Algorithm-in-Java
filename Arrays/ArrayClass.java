/**
 * Array
 */
public class ArrayClass {
   private int[] items;
  private int count = 0;
    public ArrayClass (int length) {
        items = new int[length];

    }
    public void insert (int item){
        if (items.length==count) {
            int[] newItems = new int[count*2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        } 
    }
}