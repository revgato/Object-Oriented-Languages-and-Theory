public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The order is almost full");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The disc has been added");
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i = 0; i<qtyOrdered;i++){
            if(itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("Cannot find this disc");
    }
     public float totalCost(){
        float totalCost = 0;
        for(int i=0;i<qtyOrdered;i++){
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
     }
}
