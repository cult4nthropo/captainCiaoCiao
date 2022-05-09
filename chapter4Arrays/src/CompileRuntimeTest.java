package src;

public class CompileRuntimeTest {
    public static void main(String[] args) {
        String[] strings1 = new String[100]; //ok but filled with null
        Object[] a1 = (String[]) strings1; //explicit casting ok: String fits into object/is an object
        Object[] a2 = strings1; //implicit conversion ok: String is an Object
        Object[] strings2 = new String[]{"1", "2", "3"}; //compiler ok, runtime ok with implicit casting
        String[] a3 = (String[]) strings2; //compiler OK, casting from Object to String for runtime ok
        Object[] a4 = strings2; //compiler & runtime ok: explicit casting to object in line 8
        Object[] string4 = {"1", "2", "3"}; //compiler and runtime should be OK -> Object array
        String[] a5 = (String[]) string4; //compiler OK, should throw a runtime exception: required String provided Object
        //casting from object to string will not work

        int[] ints1 = new int[100]; //ok, but filled with null despite int is a primitive
        //Object[] a6 = (int[]) ints1; compiler error: Object[] requires objects, int is a primitive
        //Object[] ints2 = new int[100]; compiler error: Object[] requires objects, int is a primitive
        //int[] a7 = (int[]) ints2; ints2 would privide an object array so if this declaration would compile a7 would give
        //you an compile error: can not convert Object to int

    }

}
