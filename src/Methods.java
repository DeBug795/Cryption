public class Methods {
    public void decript(String word, int key) {
        char[] arr = word.toCharArray();
        char[] arr1 = new char[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arr1[i] = (char) (arr[i] - key);
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }

    public void encript(String word, int key) {
        char[] arr = word.toCharArray();
        char[] arr1 = new char[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arr1[i] = (char) (arr[i] + key);
        }

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }
}
