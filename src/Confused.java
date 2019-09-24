import java.io.File;
import java.util.Scanner;


public class Confused {

    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File("input.txt"));

        int numInput = Integer.parseInt(file.nextLine());

        for (int i = 0; i < numInput; i++) {

            ArrayStack<String> groupStack = new ArrayStack<>(64);
            String[] arrInput = file.nextLine().split("");

            boolean isBroken = false;

            for (int j = 0; j < arrInput.length; j++) {

                try {
                    if (arrInput[j].equals("(") || arrInput[j].equals("[")) {
                        groupStack.push(arrInput[j]);
                    }

                    else if(arrInput[j].equals(")") && !groupStack.pop().equals("(") || arrInput[j].equals("]") && !groupStack.pop().equals("[")){
                        isBroken = true;
                        break;
                    }
                }

                catch (Exception e){
                    isBroken = true;
                    break;
                }

            }

            if(isBroken || groupStack.size() != 0){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }

        }

    }

}

