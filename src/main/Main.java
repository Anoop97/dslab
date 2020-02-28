package main;

import mybst.MyBST;

public class Main {
    public static void main(String[]args){
        MyBST object=new MyBST();
        object.insert(30);
        object.insert(26);
        object.insert(23);
        object.insert(31);
        object.traverseInOrder(object.getRoot());

    }
}
