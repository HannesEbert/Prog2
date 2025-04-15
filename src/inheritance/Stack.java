package inheritance;

import java.util.ArrayList;

public class Stack extends ArrayList
{
    Stack list;

    public Stack(){

    }

    public void push(Object newObject){
        list.add(newObject);
    }

    public Object pop(){

        return list.remove(list.size() - 1);
    }
}
