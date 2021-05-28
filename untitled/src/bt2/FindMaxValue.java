package bt2;

import java.util.List;

public class FindMaxValue {
    public static int findmax(List<Integer> number) {
            int max = number.get(0);
            for(int i =0;i<number.size();i++){
                if(max<number.get(i)){
                    max = number.get(i);
                }
            }
            return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer > numbers = readAndWriteFile.readfile("achuong.txt");
        int maxvalue = findmax(numbers);
        readAndWriteFile.writefile("achuong.txt",maxvalue);
        System.out.println(maxvalue);
    }
}
