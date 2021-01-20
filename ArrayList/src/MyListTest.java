public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);
        myList.add(4,5);
        myList.add(5,6);
        myList.add(6,7);
        myList.add(7,8);
        myList.add(8,9);
        myList.add(9,10);
        myList.add(10,11);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.remove(2));
        System.out.println(myList.contains(4));
        System.out.println(myList.contains(3));
        System.out.println(myList.get(5));
        System.out.println(myList.indexOf(1));
        System.out.println(myList);
        MyList<Integer> list1 = myList.clone();
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
    }
}
