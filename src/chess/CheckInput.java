package chess;

public class CheckInput {

    public boolean checkCoordinateValidity(String input){
        boolean isValid;
        String inputLower = input.toLowerCase();
        isValid = inputLower.matches(("[a-h][1-8] to [a-h][1-8]"));
        return isValid;
    }

}


