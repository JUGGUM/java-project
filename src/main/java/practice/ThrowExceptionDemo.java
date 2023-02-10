package practice;

import java.io.*;

class BB {
    void run() throws FileNotFoundException {
        // FileNotFoundException예외에 대응하는것을 강제하는것
        BufferedReader bReader = null;
        String input = null;
//        try {
//            bReader = new BufferedReader(new FileReader("out.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(input);

    }
}


class C {
    void run() {
        BB b = new BB();
        try {
            b.run();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

public class ThrowExceptionDemo {
    public static void main(String[] args) {
        C c = new C();
        c.run();
    }
}
