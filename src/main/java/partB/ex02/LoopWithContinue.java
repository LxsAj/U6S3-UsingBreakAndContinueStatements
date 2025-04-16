package partB.ex02;

public class LoopWithContinue {
    public static String loopWithContinue() {
        String response = "";

        for (int i = 0; i < 11; i++) {
            if ( i > 4 && i < 9) {
                continue;
            }
            response += (i + "\t");
        }


        return response;
    }

    public static void main(String[] args) {
        String loopOutput = loopWithContinue();
        System.out.print(loopOutput);
    }

}
