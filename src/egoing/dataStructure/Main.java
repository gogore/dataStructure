package egoing.dataStructure;

import egoing.dataStructure.ArrayList.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        ListIterator li = numbers.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());
        }
    }
    public void test(){
    }
}
