package chess;

public class convertToCoordinates{


    public static int[] convert(String toConvert){
        char x1s = toConvert.charAt(0);
        char y1s = toConvert.charAt(1);
        char x2s = toConvert.charAt(6);
        char y2s = toConvert.charAt(7);

        int x1 = x1s - 97;
        int y1 = Character.getNumericValue(y1s) - 1;
        int x2 = x2s - 97;
        int y2 = Character.getNumericValue(y2s) - 1;

        return new int[]{x1,y1,x2,y2};
    }
}



