package LinkList;

import java.util.LinkedList;
public class Slide38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("vi du su dung phuong thuc addAll() ");
        System.out.println("--------------------------");
        // them cac phan tu cua list vao listA
        LinkedList<String> listA= new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA:");
        showList(listA);
        

        System.out.println("/n vi du khoi tao rentainAll()");
        System.out.println("------------------------------");
        //List B
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);
        

        System.out.println("vi du ve phuong thuc removeAll()");
        System.out.println("-----------------------------------");
        // xoa nhung phan tu thuoc list B khoi list
        list.removeAll(listB);
        System.out.println("list: ");
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        for(String obj :list){
            System.out.println("/t"+obj +",");
        }
        System.out.println();
    }
}